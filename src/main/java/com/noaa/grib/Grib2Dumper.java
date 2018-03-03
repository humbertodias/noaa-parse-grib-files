package com.noaa.grib;

import ucar.grib.GribNumbers;
import ucar.grib.grib1.Grib1Tables;
import ucar.grib.grib2.*;
import ucar.unidata.io.RandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

public class Grib2Dumper {
    private final SimpleDateFormat dateFormat;
    private final TimeZone tz;
    private final RandomAccessFile raf;
    private final Grib2Data gd;

    private String gribFile;

    public Grib2Dumper(File gribFile) throws IOException {
        this(gribFile.getAbsolutePath());
    }

    public Grib2Dumper(String gribFile) throws IOException {
        this.gribFile = gribFile;
        this.raf = new RandomAccessFile(gribFile, "r");
        this.gd = new Grib2Data(raf);

        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));  // same as UTC

        // Get UTC TimeZone
        // A list of available ID's show that UTC has ID = 127
        tz = TimeZone.getTimeZone("127");
        TimeZone.setDefault(tz);

    }

    public Grib2Input getInput() throws IOException {
        raf.order(RandomAccessFile.BIG_ENDIAN);
        // Create Grib2Input instance
        Grib2Input g2i = new Grib2Input(raf);
        // boolean params getProductsOnly, oneRecord
        g2i.scan(false, false);

        return g2i;
    }

    public void dump(PrintStream ps, boolean displayData) throws IOException {

        // record contains objects for all 8 Grib2 sections
        List<Grib2Record> records = getInput().getRecords();
        for(Grib2Record record : records){
            printRecord(record, ps, displayData);
        }
        //raf.close();    // done reading

    }  // end main


    public void printProduct(Grib2Product product, PrintStream ps){
        Grib2IdentificationSection id = product.getID();
        Grib2ProductDefinitionSection pds = product.getPDS();

        ps.println("--------------------------------------------------------------------");
        printID(id, ps);
        ps.println("                        GDSKey : " + product.getGDSkey());

    }

    public void printRecord(Grib2Record record, PrintStream ps, boolean displayData) throws IOException {
        Grib2IndicatorSection is = record.getIs();
        Grib2IdentificationSection id = record.getId();
        Grib2GridDefinitionSection gds = record.getGDS();
        Grib2ProductDefinitionSection pds = record.getPDS();

        // create dump output here
        ps.println("--------------------------------------------------------------------");
        ps.println("                        Header : " + record.getHeader());
        printIS(is, ps);
        printID(id, ps);
        printGDS(gds, ps);
        printPDS(is, pds, ps);

        if (displayData) {
            float[] data = null;
            ps.println("--------------------------------------------------------------------");
//            Grib2Data gd = new Grib2Data(raf);
            data = gd.getData(record.getGdsOffset(), record.getPdsOffset(), id.getRefTime());
            if (data != null) {
                for (int j = 0; j < data.length && !Float.isNaN(data[j]) ; j++) {
                    ps.println("data[ " + j + " ]=" + data[j]);
                }
            }
            //break;  // only display data for 1st record
        }

    }

    /**
     * _more_
     *
     * @param is Grib2IndicatorSection
     * @param ps PrintStream
     */
    private void printIS(Grib2IndicatorSection is, PrintStream ps) {

        ps.println("                    Discipline : " + is.getDiscipline() + " " + is.getDisciplineName());
        ps.println("                  GRIB Edition : " + is.getGribEdition());
        ps.println("                   GRIB length : " + is.getGribLength());

    }

    /**
     * prints Grib2IdentificationSection
     *
     * @param id         Grib2IdentificationSection
     * @param ps         PrintStream
     */
    public void printID(Grib2IdentificationSection id, PrintStream ps) {

        ps.println("            Originating Center : " + id.getCenter_id()
                + " " + Grib1Tables.getCenter_idName(id.getCenter_id()));
        ps.println("        Originating Sub-Center : "
                + id.getSubcenter_id());
        ps.println("Significance of Reference Time : "
                + id.getSignificanceOfRT() + " "
                + id.getSignificanceOfRTName());
        ps.println("                Reference Time : " + dateFormat.format(id.getBaseTime()));
        ps.println("                Product Status : "
                + id.getProductStatus() + " " + id.getProductStatusName());
        ps.println("                  Product Type : " + id.getProductType()
                + " " + id.getProductTypeName());
    }

    /**
     * Prints a GDS
     *
     * @param gds Grib2GridDefinitionSection
     * @param ps  PrintStream
     */
    public void printGDS(Grib2GridDefinitionSection gds,
                          PrintStream ps) {

        Grib2GDSVariables gdsv = gds.getGdsVars();

        ps.println("         Number of data points : "
                + gdsv.getNumberPoints());
        ps.println("                     Grid Name : " + gdsv.getGdtn() + " "
                + Grib2Tables.codeTable3_1(gdsv.getGdtn()));

        String winds = GribNumbers.isBitSet(gdsv.getResolution(), GribNumbers.BIT_5)
                ? "Relative"
                : "True";

        switch (gdsv.getGdtn()) {  // Grid Definition Template Number

            case 0:
            case 1:
            case 2:
            case 3:                // Latitude/Longitude Grid

                ps.println("                     Grid Shape: " + gdsv.getShape()
                        + " " + Grib2Tables.codeTable3_2(gdsv.getShape()));
                if (gdsv.getShape() == 1) {
                    ps.println("         Spherical earth radius: "
                            + gdsv.getEarthRadius());

                } else if (gdsv.getShape() == 3) {
                    ps.println("         Oblate earth major axis: "
                            + gdsv.getMajorAxis());
                    ps.println("         Oblate earth minor axis: "
                            + gdsv.getMinorAxis());
                }
                ps.println("Number of points along parallel: " + gdsv.getNx());
                ps.println("Number of points along meridian: " + gdsv.getNy());
                ps.println("                   Basic angle : "
                        + gdsv.getBasicAngle());
                ps.println("    Subdivisions of basic angle: "
                        + gdsv.getSubDivisions());
                ps.println("  Latitude of first grid point : " + gdsv.getLa1());
                ps.println(" Longitude of first grid point : " + gdsv.getLo1());
                ps.println("  Resolution & Component flags : "
                        + gdsv.getResolution());
                ps.println("                         Winds : " + winds);
                ps.println("   Latitude of last grid point : " + gdsv.getLa2());
                ps.println("  Longitude of last grid point : " + gdsv.getLo2());
                ps.println("         i direction increment : " + gdsv.getDx());
                ps.println("         j direction increment : " + gdsv.getDy());
                ps.println("                    Grid Units : " + gdsv.getGridUnits());
                ps.println("                 Scanning mode : "
                        + gdsv.getScanMode());

                if (gdsv.getGdtn() == 1) {  //Rotated Latitude/longitude
                    ps.println("     Latitude of southern pole : "
                            + gdsv.getSpLat());
                    ps.println("    Longitude of southern pole : "
                            + gdsv.getSpLon());
                    ps.println("                Rotation angle : "
                            + gdsv.getRotationAngle());

                } else if (gdsv.getGdtn() == 2) {  //Stretched Latitude/longitude
                    ps.println("              Latitude of pole : "
                            + gdsv.getPoleLat());
                    ps.println("             Longitude of pole : "
                            + gdsv.getPoleLon());
                    ps.println("             Stretching factor : "
                            + gdsv.getStretchingFactor());

                } else if (gdsv.getGdtn() == 3) {  //Stretched and Rotated
                    // Latitude/longitude
                    ps.println("     Latitude of southern pole : "
                            + gdsv.getSpLat());
                    ps.println("    Longitude of southern pole : "
                            + gdsv.getSpLon());
                    ps.println("                Rotation angle : "
                            + gdsv.getRotationAngle());
                    ps.println("              Latitude of pole : "
                            + gdsv.getPoleLat());
                    ps.println("             Longitude of pole : "
                            + gdsv.getPoleLon());
                    ps.println("             Stretching factor : "
                            + gdsv.getStretchingFactor());
                }
                break;

            case 10:  // Mercator
                ps.println("                     Grid Shape: " + gdsv.getShape()
                        + " " + Grib2Tables.codeTable3_2(gdsv.getShape()));
                if (gdsv.getShape() == 1) {
                    ps.println("         Spherical earth radius: "
                            + gdsv.getEarthRadius());

                } else if (gdsv.getShape() == 3) {
                    ps.println("         Oblate earth major axis: "
                            + gdsv.getMajorAxis());
                    ps.println("         Oblate earth minor axis: "
                            + gdsv.getMinorAxis());
                }
                ps.println("Number of points along parallel: " + gdsv.getNx());
                ps.println("Number of points along meridian: " + gdsv.getNy());
                ps.println("  Latitude of first grid point : " + gdsv.getLa1());
                ps.println(" Longitude of first grid point : " + gdsv.getLo1());
                ps.println("  Resolution & Component flags : "
                        + gdsv.getResolution());
                ps.println("                         Winds : " + winds);
                ps.println("   Latitude of last grid point : " + gdsv.getLa2());
                ps.println("  Longitude of last grid point : " + gdsv.getLo2());
                ps.println("                 Scanning mode : "
                        + gdsv.getScanMode());
                ps.println("                   Basic angle : "
                        + gdsv.getAngle());
                ps.println("         i direction increment : " + gdsv.getDx());
                ps.println("         j direction increment : " + gdsv.getDy());
                ps.println("                    Grid Units : " + gdsv.getGridUnits());

                break;

            case 20:  // Polar stereographic projection
                ps.println("                     Grid Shape: " + gdsv.getShape()
                        + " " + Grib2Tables.codeTable3_2(gdsv.getShape()));
                if (gdsv.getShape() == 1) {
                    ps.println("         Spherical earth radius: "
                            + gdsv.getEarthRadius());

                } else if (gdsv.getShape() == 3) {
                    ps.println("         Oblate earth major axis: "
                            + gdsv.getMajorAxis());
                    ps.println("         Oblate earth minor axis: "
                            + gdsv.getMinorAxis());
                }
                ps.println("Number of points along parallel: " + gdsv.getNx());
                ps.println("Number of points along meridian: " + gdsv.getNy());
                ps.println("  Latitude of first grid point : " + gdsv.getLa1());
                ps.println(" Longitude of first grid point : " + gdsv.getLo1());
                ps.println("  Resolution & Component flags : "
                        + gdsv.getResolution());
                ps.println("                         Winds : " + winds);
                ps.println("                    Grid Units : " + gdsv.getGridUnits());
                ps.println("                 Scanning mode : "
                        + gdsv.getScanMode());

                break;

            case 30:  // Lambert Conformal
                ps.println("                    Grid Shape : " + gdsv.getShape()
                        + " " + Grib2Tables.codeTable3_2(gdsv.getShape()));
                if (gdsv.getShape() == 1) {
                    ps.println("         Spherical earth radius: "
                            + gdsv.getEarthRadius());

                } else if (gdsv.getShape() == 3) {
                    ps.println("         Oblate earth major axis: "
                            + gdsv.getMajorAxis());
                    ps.println("         Oblate earth minor axis: "
                            + gdsv.getMinorAxis());
                }
                ps.println("                            Nx : " + gdsv.getNx());
                ps.println("                            Ny : " + gdsv.getNy());
                ps.println("                           La1 : " + gdsv.getLa1());
                ps.println("                           Lo1 : " + gdsv.getLo1());
                ps.println("  Resolution & Component flags : "
                        + gdsv.getResolution());
                ps.println("                         Winds : " + winds);
                ps.println("                           LaD : " + gdsv.getLaD());
                ps.println("                           LoV : " + gdsv.getLoV());
                ps.println("                            Dx : " + gdsv.getDx());
                ps.println("                            Dy : " + gdsv.getDy());
                ps.println("                    Grid Units : " + gdsv.getGridUnits());
                ps.println("             Projection center : "
                        + gdsv.getProjectionFlag());
                ps.println("                 Scanning mode : "
                        + gdsv.getScanMode());
                ps.println("                        Latin1 : "
                        + gdsv.getLatin1());
                ps.println("                        Latin2 : "
                        + gdsv.getLatin2());
                ps.println("                         SpLat : "
                        + gdsv.getSpLat());
                ps.println("                         SpLon : "
                        + gdsv.getSpLon());

                break;

            case 40:
            case 41:
            case 42:
            case 43:  // Gaussian latitude/longitude
                ps.println("                     Grid Shape: " + gdsv.getShape()
                        + " " + Grib2Tables.codeTable3_2(gdsv.getShape()));
                if (gdsv.getShape() == 1) {
                    ps.println("         Spherical earth radius: "
                            + gdsv.getEarthRadius());

                } else if (gdsv.getShape() == 3) {
                    ps.println("         Oblate earth major axis: "
                            + gdsv.getMajorAxis());
                    ps.println("         Oblate earth minor axis: "
                            + gdsv.getMinorAxis());
                }
                ps.println("Number of points along parallel: " + gdsv.getNx());
                ps.println("Number of points along meridian: " + gdsv.getNy());
                ps.println("                   Basic angle : "
                        + gdsv.getAngle());
                ps.println("    Subdivisions of basic angle: "
                        + gdsv.getSubDivisions());
                ps.println("  Latitude of first grid point : " + gdsv.getLa1());
                ps.println(" Longitude of first grid point : " + gdsv.getLo1());
                ps.println("  Resolution & Component flags : "
                        + gdsv.getResolution());
                ps.println("                         Winds : " + winds);
                ps.println("                    Grid Units : " + gdsv.getGridUnits());
                ps.println("   Latitude of last grid point : " + gdsv.getLa2());
                ps.println("  Longitude of last grid point : " + gdsv.getLo2());
                ps.println("         i direction increment : " + gdsv.getDx());
                ps.println("             Stretching factor : "
                        + gdsv.getStretchingFactor());
                ps.println("           Number of parallels : " + gdsv.getNp());
                ps.println("                 Scanning mode : "
                        + gdsv.getScanMode());

                if (gdsv.getGdtn() == 41) {  //Rotated Gaussian Latitude/longitude
                    ps.println("     Latitude of southern pole : "
                            + gdsv.getSpLat());
                    ps.println("    Longitude of southern pole : "
                            + gdsv.getSpLon());
                    ps.println("                Rotation angle : "
                            + gdsv.getRotationAngle());

                } else if (gdsv.getGdtn() == 42) {  //Stretched Gaussian
                    // Latitude/longitude
                    ps.println("              Latitude of pole : "
                            + gdsv.getPoleLat());
                    ps.println("             Longitude of pole : "
                            + gdsv.getPoleLon());
                    ps.println("             Stretching factor : "
                            + gdsv.getStretchingFactor());

                } else if (gdsv.getGdtn() == 43) {  //Stretched and Rotated Gaussian
                    // Latitude/longitude
                    ps.println("     Latitude of southern pole : "
                            + gdsv.getSpLat());
                    ps.println("    Longitude of southern pole : "
                            + gdsv.getSpLon());
                    ps.println("                Rotation angle : "
                            + gdsv.getRotationAngle());
                    ps.println("              Latitude of pole : "
                            + gdsv.getPoleLat());
                    ps.println("             Longitude of pole : "
                            + gdsv.getPoleLon());
                    ps.println("             Stretching factor : "
                            + gdsv.getStretchingFactor());
                }
                break;


            case 90:  // Space view perspective or orthographic
                ps.println("                     Grid Shape: " + gdsv.getShape()
                        + " " + Grib2Tables.codeTable3_2(gdsv.getShape()));
                if (gdsv.getShape() == 1) {
                    ps.println("         Spherical earth radius: "
                            + gdsv.getEarthRadius());

                } else if (gdsv.getShape() == 3) {
                    ps.println("        Oblate earth major axis: "
                            + gdsv.getMajorAxis());
                    ps.println("        Oblate earth minor axis: "
                            + gdsv.getMinorAxis());
                }
                ps.println("Number of points along parallel: " + gdsv.getNx());
                ps.println("Number of points along meridian: " + gdsv.getNy());
                ps.println("Latitude of sub-satellite point: " + gdsv.getLap());
                ps.println("  Longitude of sub-satellite pt: " + gdsv.getLop());
                ps.println("  Resolution & Component flags : "
                        + gdsv.getResolution());
                ps.println("                         Winds : " + winds);
                ps.println("      Dx i direction increment : " + gdsv.getDx());
                ps.println("      Dy j direction increment : " + gdsv.getDy());
                ps.println("                    Grid Units : " + gdsv.getGridUnits());
                ps.println("Xp-coordinate of sub-satellite : " + gdsv.getXp());
                ps.println("Yp-coordinate of sub-satellite : " + gdsv.getYp());
                ps.println("                 Scanning mode : "
                        + gdsv.getScanMode());
                ps.println("                   Basic angle : "
                        + gdsv.getAngle());
                ps.println("     Nr Altitude of the camera : "
                        + gdsv.getNr());
                ps.println("       Xo-coordinate of origin : " + gdsv.getXo());
                ps.println("       Yo-coordinate of origin : " + gdsv.getYo());

                break;


            case 204:  // Curvilinear orthographic grib
                ps.println("                     Grid Shape: " + gdsv.getShape()
                        + " " + Grib2Tables.codeTable3_2(gdsv.getShape()));
                if (gdsv.getShape() == 1) {
                    ps.println("         Spherical earth radius: "
                            + gdsv.getEarthRadius());

                } else if (gdsv.getShape() == 3) {
                    ps.println("        Oblate earth major axis: "
                            + gdsv.getMajorAxis());
                    ps.println("        Oblate earth minor axis: "
                            + gdsv.getMinorAxis());
                }
                ps.println("Number of points along parallel: " + gdsv.getNx());
                ps.println("Number of points along meridian: " + gdsv.getNy());
                ps.println("  Resolution & Component flags : "
                        + gdsv.getResolution());
                ps.println("                         Winds : " + winds);
                ps.println("                    Grid Units : " + gdsv.getGridUnits());
                ps.println("                 Scanning mode : "
                        + gdsv.getScanMode());

                break;

            default:
                ps.println("Unknown Grid Type" + gdsv.getGdtn());

        }  // end switch gdtn
    }      // end printGDS

    /**
     * Print a PDS
     *
     * @param is  Grib2IndicatorSection
     * @param pds Grib2ProductDefinitionSection
     * @param ps  PrintStream
     */
    public void printPDS(Grib2IndicatorSection is,
                          Grib2ProductDefinitionSection pds,
                          PrintStream ps) {

        Grib2Pds pdsv = pds.getPdsVars();

        int productDefinition = pdsv.getProductDefinitionTemplate();

        ps.println("            Product Definition : "
                + productDefinition + " "
                + Grib2Tables.codeTable4_0(productDefinition));
        ps.println("            Parameter Category : "
                + pdsv.getParameterCategory() + " "
                + ParameterTable.getCategoryName(is.getDiscipline(),
                pdsv.getParameterCategory()));
        ps.println("                Parameter Name : "
                + pdsv.getParameterNumber() + " "
                + ParameterTable.getParameterName(is.getDiscipline(),
                pdsv.getParameterCategory(), pdsv.getParameterNumber()));
        ps.println("               Parameter Units : "
                + ParameterTable.getParameterUnit(is.getDiscipline(),
                pdsv.getParameterCategory(), pdsv.getParameterNumber()));
        int tgp = pdsv.getGenProcessType();
        ps.println("       Generating Process Type : " + tgp + " "
                + Grib2Tables.codeTable4_3(tgp));
        ps.println("                  ForecastTime : "
                + pdsv.getForecastTime());
        ps.println("            First Surface Type : " + pdsv.getLevelType1() + " "
                + Grib2Tables.codeTable4_5(pdsv.getLevelType1()));
        ps.println("           First Surface value : "
                + pdsv.getLevelValue1());
        ps.println("           Second Surface Type : " + pdsv.getLevelType2() + " "
                + Grib2Tables.codeTable4_5(pdsv.getLevelType2()));
        ps.println("          Second Surface value : "
                + pdsv.getLevelValue2());

    }  // end printPDS

}
