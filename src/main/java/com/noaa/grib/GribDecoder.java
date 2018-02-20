package com.noaa.grib;

import java.io.File;
import java.net.URI;

import ucar.grib.grib2.Grib2Dump;

/**
 *
 * Home http://www.nco.ncep.noaa.gov/pmb/products/wave/ <code> 
 * java GridDecoder http://www.ftp.ncep.noaa.gov/data/nccf/com/wave/prod/glwu.20180214/glwu.grlc_2p5km_sr.t02z.grib2
 * </code>
 *
 * @author humbertodias
 */
public class GribDecoder {

	public static void main(String ... args) throws Throwable {

		if (args.length < 1) {
			throw new RuntimeException("Usage GRIB2_URL_FILE");
		}

		URI gribUrlFile = URI.create(args[0]);
		File gribFile = Util.downloadFileFromURL(gribUrlFile);

		String[] pargs = new String[] { gribFile.getAbsolutePath() };
		Grib2Dump.main(pargs);
	}

}
