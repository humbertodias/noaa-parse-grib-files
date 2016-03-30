package com.noaa.grib;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Paths;
import org.apache.log4j.Logger;
import ucar.grib.NoValidGribException;
import ucar.grib.grib1.Grib1Input;
import ucar.grib.grib2.Grib2Input;
import ucar.unidata.io.RandomAccessFile;

public class Util {

    private static final Logger logger = Logger.getLogger(Util.class);

    public static File downloadFileFromURL(URI uri) throws Throwable {
        String tmp = System.getProperty("java.io.tmpdir");
        String filename = Paths.get(uri.getPath()).getFileName().toString();
        File destination = new File(tmp, filename);
        downloadFileFromURL(uri.toURL(), destination);
        return destination;
    }

    public static void downloadFileFromURL(URL url, File destination) throws Throwable {
        logger.info("Downloading " + url.getPath() + " in " + destination.getAbsolutePath());
        try (
                ReadableByteChannel rbc = Channels.newChannel(url.openStream());
                FileOutputStream fos = new FileOutputStream(destination);) {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }

    }

    public static ucar.unidata.io.RandomAccessFile toRandomAccessFile(File file) throws IOException {
        return toRandomAccessFile(file, "r");
    }

    public static ucar.unidata.io.RandomAccessFile toRandomAccessFile(File file, String mode) throws IOException {
        return new ucar.unidata.io.RandomAccessFile(file.getAbsolutePath(), mode);
    }

    
    public static void showGrib1(File gridFile) throws NoValidGribException, IOException {

        RandomAccessFile randomFile = Util.toRandomAccessFile(gridFile);
        
        //Create grib2Input file
        Grib1Input grib2Input = new Grib1Input(randomFile);

        grib2Input.scan(false, false);

        grib2Input.getProducts().stream().forEach((r) -> {
            System.out.println("Product.Header: " + r.getHeader());
        });

        System.out.println("Records.size:" + grib2Input.getRecords().size());

        grib2Input.getRecords().stream().forEach((r) -> {
            System.out.println("Record:" + r);
        });

    }

    public static void showGrib2(File gridFile) throws IOException {
        RandomAccessFile randomFile = Util.toRandomAccessFile(gridFile);
        //Create grib2Input file
        Grib2Input grib2Input = new Grib2Input(randomFile);

        grib2Input.scan(true, false);

        grib2Input.getProducts().stream().forEach((r) -> {
            System.out.println("Grib2Product:" + r);
        });

        grib2Input.getRecords().stream().forEach((r) -> {
            System.out.println("Grib2Record:" + r.getHeader());
        });

    }    
    
}
