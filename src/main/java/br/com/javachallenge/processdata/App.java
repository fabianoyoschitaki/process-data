package br.com.javachallenge.processdata;

import java.io.File;
import java.io.IOException;

import br.com.javachallenge.processdata.util.Processor;
import br.com.javachallenge.processdata.util.ProcessorFactory;

/**
 * Hello world!
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
