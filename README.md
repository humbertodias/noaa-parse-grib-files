# NOAA Parse Grib Files
Java Way to download and parse GRIB files

**NOAA - National Oceanic and Atmospheric Administration**

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
mvn package exec:java -Dexec.mainClass="com.noaa.grib.GribDecoder" -Dexec.args="http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glw.20160330/glw.grlc_2p5km.t00z.showGrib2"
```


## Output

![Preview](doc/pong.gif)
