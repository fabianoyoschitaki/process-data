package br.com.javachallenge.processdata.util;

/**
 * This class implements Processor interface. It processes lines for when CITY
 * argument is specified.
 * 
 * @author Fabiano Yoschitaki
 *
 */
public class CityProcessor implements Processor {

	/**
	 * This method prints name and id to STDOUT if desiredValue is equals to city
	 */
	public void processLine(String desiredValue, String name, String city, String id) {
		if (desiredValue.equals(city)) {
			System.out.println(name + "," + id);
		}
	}
}
