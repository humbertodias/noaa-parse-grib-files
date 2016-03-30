# NOAA Parse Grib Files

Java Way to download and parse GRIB files

**NOAA - National Oceanic and Atmospheric Administration**


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

Run

```
mvn package exec:java -Dexec.mainClass="com.noaa.grib.GribDecoder" -Dexec.args="http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glw.20160330/glw.grlc_2p5km.t00z.grib2"
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
2016-03-30 13:29:03 INFO  Util:30 - Downloading /data/nccf/com/wave/prod/glw.20160330/glw.grlc_2p5km.t00z.grib2 in /var/folders/md/npktfbdn5md26lrb63x2355w0000gn/T/glw.grlc_2p5km.t00z.grib2

             Projection center : 0
                 Scanning mode : 64
                        Latin1 : 25.0
                        Latin2 : 25.0
                         SpLat : -90.0
                         SpLon : 0.0
            Product Definition : 0 Analysis/forecast at horizontal level/layer at a point in time
            Parameter Category : 0 Waves
                Parameter Name : 11 Primary_wave_mean_period
               Parameter Units : s
       Generating Process Type : 2 Forecast
                  ForecastTime : 82
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 84971
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 10 Primary_wave_direction
               Parameter Units : degrees
       Generating Process Type : 2 Forecast
                  ForecastTime : 82
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 43868
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 5 Significant_height_of_wind_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 82
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 37837
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 8 Significant_height_of_swell_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 82
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 28179
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 8 Significant_height_of_swell_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 82
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 50128
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 6 Mean_period_of_wind_waves
               Parameter Units : s
       Generating Process Type : 2 Forecast
                  ForecastTime : 82
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 42466
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 82
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 30053
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 82
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 72214
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 82
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 61408
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 82
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 32890
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 82
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 0 Meteorological products
                  GRIB Edition : 2
                   GRIB length : 59022
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
            Parameter Category : 2 Momentum
                Parameter Name : 1 Wind_speed
               Parameter Units : m s-1
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 0 Meteorological products
                  GRIB Edition : 2
                   GRIB length : 77809
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
            Parameter Category : 2 Momentum
                Parameter Name : 0 Wind_direction
               Parameter Units : degrees
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 0 Meteorological products
                  GRIB Edition : 2
                   GRIB length : 55927
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
            Parameter Category : 2 Momentum
                Parameter Name : 2 U-component_of_wind
               Parameter Units : m s-1
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 0 Meteorological products
                  GRIB Edition : 2
                   GRIB length : 59455
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
            Parameter Category : 2 Momentum
                Parameter Name : 3 V-component_of_wind
               Parameter Units : m s-1
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 45799
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 3 Significant_height_of_combined_wind_waves_and_swell
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 54156
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 11 Primary_wave_mean_period
               Parameter Units : s
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 85488
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 10 Primary_wave_direction
               Parameter Units : degrees
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 44075
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 5 Significant_height_of_wind_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 37759
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 8 Significant_height_of_swell_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 28225
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 8 Significant_height_of_swell_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 50436
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 6 Mean_period_of_wind_waves
               Parameter Units : s
       Generating Process Type : 2 Forecast
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 42666
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 83
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 29922
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 83
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 72645
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 83
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 60919
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 83
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 32594
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 83
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 0 Meteorological products
                  GRIB Edition : 2
                   GRIB length : 59406
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
            Parameter Category : 2 Momentum
                Parameter Name : 1 Wind_speed
               Parameter Units : m s-1
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 0 Meteorological products
                  GRIB Edition : 2
                   GRIB length : 78053
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
            Parameter Category : 2 Momentum
                Parameter Name : 0 Wind_direction
               Parameter Units : degrees
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 0 Meteorological products
                  GRIB Edition : 2
                   GRIB length : 54991
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
            Parameter Category : 2 Momentum
                Parameter Name : 2 U-component_of_wind
               Parameter Units : m s-1
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 0 Meteorological products
                  GRIB Edition : 2
                   GRIB length : 58894
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
            Parameter Category : 2 Momentum
                Parameter Name : 3 V-component_of_wind
               Parameter Units : m s-1
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 45885
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 3 Significant_height_of_combined_wind_waves_and_swell
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 54096
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 11 Primary_wave_mean_period
               Parameter Units : s
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 85750
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 10 Primary_wave_direction
               Parameter Units : degrees
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 44513
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 5 Significant_height_of_wind_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 37673
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 8 Significant_height_of_swell_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 28317
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 8 Significant_height_of_swell_waves
               Parameter Units : m
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 50940
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                Parameter Name : 6 Mean_period_of_wind_waves
               Parameter Units : s
       Generating Process Type : 2 Forecast
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 42823
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 84
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 30058
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 84
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 73611
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 84
            First Surface Type : 1 Ground or water surface
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 60280
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 84
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 1.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
--------------------------------------------------------------------
                        Header : GRIB2
                    Discipline : 10 Oceanographic products
                  GRIB Edition : 2
                   GRIB length : 32857
            Originating Center : 7 US National Weather Service - NCEP(WMC)
        Originating Sub-Center : 0
Significance of Reference Time : 1 Start of forecast
                Reference Time : 2016-03-23T00:00:00Z
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
                  ForecastTime : 84
            First Surface Type : 241 Ordered Sequence of Data
           First Surface value : 2.0
           Second Surface Type : 255 Missing
          Second Surface value : 0.0
```