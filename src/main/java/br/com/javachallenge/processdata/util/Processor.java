package br.com.javachallenge.processdata.util;

import java.io.File;
import java.io.IOException;

public interface Processor {
	default void processFile(String filterValue, File inputFile) throws IOException{
		
	}
	
	void processLine(String desiredValue, String name, String city, String id);
}
