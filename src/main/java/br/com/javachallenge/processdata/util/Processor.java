package br.com.javachallenge.processdata.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public interface Processor {
	default void processFile(String filterValue, File inputFile) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		String line = null;
		FormatType currentFormatType = null;
		while (reader.ready()) {
			line = reader.readLine().trim();
			if (FormatType.FORMAT_ONE.getValue().equals(line)) {
				currentFormatType = FormatType.FORMAT_ONE;
			} else if (FormatType.FORMAT_TWO.getValue().equals(line)) {
				currentFormatType = FormatType.FORMAT_TWO;
			} else {
				String[] tokens = line.substring(2).split(currentFormatType.getDelimiter());
				processLine(filterValue, tokens[0].trim(), tokens[1].trim(), tokens[2].trim().replace("-", ""));
			}
		}
		reader.close();
	}

	void processLine(String desiredValue, String name, String city, String id);
}
