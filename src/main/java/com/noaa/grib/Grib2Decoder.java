package com.noaa.grib;

import java.io.File;

/**
 *
 * @see http://www.nco.ncep.noaa.gov/pmb/products/wave/
 * <code>
 * java GridDecoder http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glwu.20180214/glwu.grlc_2p5km_sr.t02z.grib2
 * </code>
 *
 * @author humbertodias
 */
public class Grib2Decoder {

	public static void main(String[] args) throws Throwable {
		validateArgs(args);
		File gribFile = Util.downloadFileIfNecessary(args[0]);
		Grib2Dumper grib2Dumper = new Grib2Dumper(gribFile);
		grib2Dumper.dump(System.out, false);
	}

	private static void validateArgs(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException("Usage: GRIB2_URL_OR_FILE");
		}
	}

}
