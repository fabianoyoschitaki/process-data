package br.com.javachallenge.processdata.util;

import java.util.HashSet;
import java.util.Set;

public class IdProcessor implements Processor {

	private Set<String> cities = new HashSet<>();

	public void processLine(String desiredValue, String name, String city, String id) {
		if (desiredValue.equals(id) && !cities.contains(city)) {
			System.out.println(city);
			cities.add(city);
		}
	}
}
