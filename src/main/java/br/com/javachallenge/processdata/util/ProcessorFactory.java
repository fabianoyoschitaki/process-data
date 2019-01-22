package br.com.javachallenge.processdata.util;

/**
 * This class is a Factory (Creational Design Pattern) responsible
 * for creating Processor implementations. 
 * 
 * @author Fabiano Yoschitaki
 *
 */
public class ProcessorFactory {
	
	/**
	 * Returns a Processor implementation based on the specified type
	 *  
	 * @param type
	 * @return
	 */
	public static Processor getProcessor(String type) {
		if ("CITY".equals(type)) {
			return new CityProcessor();
		} else if ("ID".equals(type)) {
			return new IdProcessor();
		}
		return null;
	}
}
