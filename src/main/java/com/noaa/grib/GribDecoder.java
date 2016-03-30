package com.noaa.grib;

import java.io.File;
import java.net.URI;

/**
 *
 * Home http://www.nco.ncep.noaa.gov/pmb/products/wave/  <code> 
 * java GridDecode http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glw.20160330/glw.grlc_2p5km.t00z.showGrib2
 * </code>
 *
 * @author humbertodias
 */
public class GribDecoder {

    public static void main(String... args) throws Throwable {
        if (args.length < 2) {
            throw new RuntimeException("Usage GRIB_URL_FILE");
        }

        URI gribUrlFile = URI.create(args[1]);
        File gribFile = Util.downloadFileFromURL(gribUrlFile);
        Util.showGrib2(gribFile);
    }

}
