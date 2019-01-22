package br.com.javachallenge.processdata.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * This interface provides processLine method, implemented by different classes
 * based on the type of processing passed when running the application.
 * 
 * @author Fabiano Yoschitaki
 *
 */
public interface Processor {

	/**
	 * Default method to read a specific text format file
	 * 
	 * @param filterValue
	 * @param inputFile
	 * @throws IOException
	 */
	default void processFile(String filterValue, File inputFile) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
			String line = null;
			FormatType currentFormatType = null;
			while (reader.ready()) {
				line = reader.readLine().trim();
				if (FormatType.FORMAT_ONE.getValue().equals(line)) {
					currentFormatType = FormatType.FORMAT_ONE;
				} else if (FormatType.FORMAT_TWO.getValue().equals(line)) {
					currentFormatType = FormatType.FORMAT_TWO;
				} else if (line.startsWith("D ")){
					String[] tokens = line.substring(2).split(currentFormatType.getDelimiter());
					String result = processLine(filterValue, tokens[0].trim(), tokens[1].trim(), tokens[2].trim().replace("-", ""));
					if (result != null) {
						System.out.println(result);
					}
				}
			}
		}
	}

	/**
	 * This method processes a single String line and returns the result
	 * 
	 * @param desiredValue
	 * @param name
	 * @param city
	 * @param id
	 */
	String processLine(String desiredValue, String name, String city, String id);
}
