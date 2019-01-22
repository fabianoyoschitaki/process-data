package br.com.javachallenge.processdata.util;

import java.util.HashSet;
import java.util.Set;

/**
 * This class implements Processor interface.
 * 
 * It processes lines for when ID argument is specified. 
 * 
 * @author Fabiano Yoschitaki
 *
 */
public class IdProcessor implements Processor {

	private Set<String> cities = new HashSet<>();

	/**
	 * This method prints city to STDOUT if desiredValue is equals to id
	 * and if city is not repeated 
	 */
	public void processLine(String desiredValue, String name, String city, String id) {
		if (desiredValue.equals(id) && !cities.contains(city)) {
			System.out.println(city);
			cities.add(city);
		}
	}
}
