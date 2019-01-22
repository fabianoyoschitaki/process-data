package br.com.javachallenge.processdata;

import java.io.File;
import java.io.IOException;

import br.com.javachallenge.processdata.util.Processor;
import br.com.javachallenge.processdata.util.ProcessorFactory;

/**
 * This class contains the main method of the application.
 * 
 * Expected args values are: 
 * 
 * 1. {FILE} CITY {CITY_NAME}
 * 2. {FILE} ID {ID_VALUE}
 * 
 * @author Fabiano Yoschitaki
 *
 */
public class App {
	public static void main(String[] args) {
		if (args.length < 3) {
			throw new RuntimeException("File name and CITY/ID arguments must be passed.");
		}

		String fileName = args[0];
		String processorType = args[1];
		String processorValue = args[2];

		Processor processor = ProcessorFactory.getProcessor(processorType);
		try {
			processor.processFile(processorValue, new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
