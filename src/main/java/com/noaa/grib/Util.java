package com.noaa.grib;

import org.apache.log4j.Logger;
import ucar.grib.NoValidGribException;
import ucar.grib.grib1.Grib1Input;
import ucar.grib.grib2.Grib2Input;
import ucar.unidata.io.RandomAccessFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Paths;

public class Util {

    private Util(){

    }

    private static final Logger logger = Logger.getLogger(Util.class);

    public static boolean isLocalFile(String path) {
        return new File(path).exists();
    }

    public static File downloadFileIfNecessary(String filePath) throws Throwable {
        if (isLocalFile(filePath))
            return new File(filePath);
        else
            return downloadFileFromURL(filePath);
    }

    public static File downloadFileFromURL(String uri) throws Throwable {
        return downloadFileFromURL(URI.create(uri));
    }

    public static File downloadFileFromURL(URI uri) throws Throwable {
        String filename = Paths.get(uri.getPath()).getFileName().toString();
        String tmp = System.getProperty("java.io.tmpdir");
        File destination = new File(tmp, filename);
        downloadFileFromURL(uri.toURL(), destination);
        return destination;
    }

    public static void downloadFileFromURL(URL url, File destination) throws Throwable {
        logger.info("Downloading " + url.toExternalForm() + " in " + destination.getAbsolutePath());
        try (
                ReadableByteChannel rbc = Channels.newChannel(url.openStream());
                FileOutputStream fos = new FileOutputStream(destination)) {
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

        grib2Input.getProducts().forEach((r) -> System.out.println("Product.Header: " + r.getHeader()));

        System.out.println("Records.size:" + grib2Input.getRecords().size());

        grib2Input.getRecords().forEach((r) -> System.out.println("Record:" + r));

    }

    public static void showGrib2(File gridFile) throws IOException {

        Grib2Dumper grib2Dumper = new Grib2Dumper(gridFile);
        Grib2Input grib2Input = grib2Dumper.getInput();
        grib2Input.getProducts().forEach((p) -> grib2Dumper.printProduct(p, System.out));

        grib2Input.getRecords().forEach((r) -> {
            try {
                grib2Dumper.printRecord(r, System.out, true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

}
