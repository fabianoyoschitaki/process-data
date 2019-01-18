package br.com.javachallenge.processdata.util;

public class CityProcessor implements Processor {

	public void processLine(String desiredValue, String name, String city, String id) {
		if (desiredValue.equals(city)) {
			System.out.println(name + "," + id);
		}
	}
}
