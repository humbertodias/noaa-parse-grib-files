# Parsing Grib Files

Java Way to download and parse GRIB files.

**NOAA - National Oceanic and Atmospheric Administration**

1. NOAA Servers 

	[http://www.nco.ncep.noaa.gov/pmb/products/](http://www.nco.ncep.noaa.gov/pmb/products/)

2. Global Forecast System (GFS)

	[http://www.nco.ncep.noaa.gov/pmb/products/gfs/](http://www.nco.ncep.noaa.gov/pmb/products/gfs/)

3. FTP Wave files

	[http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/](http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/)
	
4. File formats

	[http://www.nco.ncep.noaa.gov/pmb/products/wave](http://www.nco.ncep.noaa.gov/pmb/products/wave/)


## Prerequires

1. Git 2.6+
2. Maven 3+
3. Java 8+


## How to Play

Clone

```
git clone https://github.com/humbertodias/noaa-parse-grib-files.git
```
Inside the folder

```
cd noaa-parse-grib-files
```

File Source Information

[http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glwu.20180214/glwu.grlc_2p5km_sr.t02z.grib2](http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glwu.20180214/glwu.grlc_2p5km_sr.t02z.grib2)

**Directory format**

```
/glw.20180214
YYYY
MM
DD
```

***File format***

[glw.grlc_2p5km.t00z.grib2](http://www.nco.ncep.noaa.gov/pmb/products/wave/glw.grlc_2p5km.t00z.grib2.shtml)

Run

```
mvn compile exec:java \
-Dexec.mainClass="com.noaa.grib.Grib2Decoder" \
-Dexec.args="http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glwu.20180224/glwu.grlc_2p5km.t01z.grib2"
```


## Output

```
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building noaa-grib-ucar 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ grid-decoder ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ grid-decoder ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/humbertodias/git/noaa-parse-grib-files/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ grid-decoder ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/humbertodias/git/noaa-parse-grib-files/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ grid-decoder ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ grid-decoder ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ grid-decoder ---
[INFO] Building jar: /Users/humbertodias/git/noaa-parse-grib-files/target/grid-decoder-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- exec-maven-plugin:1.4.0:java (default-cli) @ grid-decoder ---
2018-02-20 20:23:06 INFO  Util:32 - Downloading http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glwu.20180214/glwu.grlc_2p5km_sr.t02z.grib2 in /tmp/glwu.grlc_2p5km_sr.t02z.grib2
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 27840
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2018-02-14T02:00:00Z
                Product Status : 0 Operational products
                  Product Type : 1 Forecast products
         Number of data points : 209741
                     Grid Name : 30 Lambert_Conformal
                    Grid Shape : 6 Earth spherical with radius of 6,371,229.0 m
                            Nx : 581
                            Ny : 361
                           La1 : 41.53071
                           Lo1 : 267.364
  Resolution & Component flags : 0
                         Winds : True
                           LaD : 25.0
                           LoV : 265.0
                            Dx : 2539.703
                            Dy : 2539.703
                    Grid Units : m
             Projection center : 0
                 Scanning mode : 64
                        Latin1 : 25.0
                        Latin2 : 25.0
                         SpLat : -90.0
                         SpLon : 0.0
            Product Definition : 0 Analysis/forecast at horizontal level/layer at a point in time
            Parameter Category : 0 Waves
                Parameter Name : 9 Mean_period_of_swell_waves
               Parameter Units : s
       Generating Process Type : 2 Forecast
                  ForecastTime : 48
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 44279
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2018-02-14T02:00:00Z
                Product Status : 0 Operational products
                  Product Type : 1 Forecast products
         Number of data points : 209741
                     Grid Name : 30 Lambert_Conformal
                    Grid Shape : 6 Earth spherical with radius of 6,371,229.0 m
                            Nx : 581
                            Ny : 361
                           La1 : 41.53071
                           Lo1 : 267.364
  Resolution & Component flags : 0
                         Winds : True
                           LaD : 25.0
                           LoV : 265.0
                            Dx : 2539.703
                            Dy : 2539.703
                    Grid Units : m
             Projection center : 0
                 Scanning mode : 64
                        Latin1 : 25.0
                        Latin2 : 25.0
                         SpLat : -90.0
                         SpLon : 0.0
            Product Definition : 0 Analysis/forecast at horizontal level/layer at a point in time
            Parameter Category : 0 Waves
                Parameter Name : 4 Direction_of_wind_waves
               Parameter Units : degrees
       Generating Process Type : 2 Forecast
                  ForecastTime : 48
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 35903
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2018-02-14T02:00:00Z
                Product Status : 0 Operational products
                  Product Type : 1 Forecast products
         Number of data points : 209741
                     Grid Name : 30 Lambert_Conformal
                    Grid Shape : 6 Earth spherical with radius of 6,371,229.0 m
                            Nx : 581
                            Ny : 361
                           La1 : 41.53071
                           Lo1 : 267.364
  Resolution & Component flags : 0
                         Winds : True
                           LaD : 25.0
                           LoV : 265.0
                            Dx : 2539.703
                            Dy : 2539.703
                    Grid Units : m
             Projection center : 0
                 Scanning mode : 64
                        Latin1 : 25.0
                        Latin2 : 25.0
                         SpLat : -90.0
                         SpLon : 0.0
            Product Definition : 0 Analysis/forecast at horizontal level/layer at a point in time
            Parameter Category : 0 Waves
                Parameter Name : 7 Direction_of_swell_waves
               Parameter Units : degrees
       Generating Process Type : 2 Forecast
                  ForecastTime : 48
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 28607
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2018-02-14T02:00:00Z
                Product Status : 0 Operational products
                  Product Type : 1 Forecast products
         Number of data points : 209741
                     Grid Name : 30 Lambert_Conformal
                    Grid Shape : 6 Earth spherical with radius of 6,371,229.0 m
                            Nx : 581
                            Ny : 361
                           La1 : 41.53071
                           Lo1 : 267.364
  Resolution & Component flags : 0
                         Winds : True
                           LaD : 25.0
                           LoV : 265.0
                            Dx : 2539.703
                            Dy : 2539.703
                    Grid Units : m
             Projection center : 0
                 Scanning mode : 64
                        Latin1 : 25.0
                        Latin2 : 25.0
                         SpLat : -90.0
                         SpLon : 0.0
            Product Definition : 0 Analysis/forecast at horizontal level/layer at a point in time
            Parameter Category : 0 Waves
                Parameter Name : 7 Direction_of_swell_waves
               Parameter Units : degrees
       Generating Process Type : 2 Forecast
                  ForecastTime : 48
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 03:51 min
[INFO] Finished at: 2018-02-20T19:19:31Z
[INFO] Final Memory: 18M/161M
[INFO] ------------------------------------------------------------------------
          
```

## References

1. [Processing Grib Data](http://donpedro.lediouris.net/software/processing.grib/index.html)

2. [Applications](http://st-martin-basic.blogspot.com.br/2012/01/applications-pour-lire-et-explorer-les.html)

3. [zyGrib](http://www.zygrib.org/)

4. [Grib 1 - Format](http://www.wmo.int/pages/prog/www/WMOCodes/Guides/GRIB/GRIB1-Contents.html)

5. [Grib 2 - Format](https://www.wmo.int/pages/prog/www/WMOCodes/Guides/GRIB/GRIB2_062006.pdf)
