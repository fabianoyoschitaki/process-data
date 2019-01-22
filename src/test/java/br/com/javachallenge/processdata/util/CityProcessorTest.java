package br.com.javachallenge.processdata.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CityProcessorTest {
	CityProcessor processor = new CityProcessor();

	@Test
	public void shouldPrintName123() {
		String result = processor.processLine("BARCELONA", "NAME", "BARCELONA", "123");
	    assertEquals("NAME,123", result);
	}
	
	@Test
	public void shouldReturnNull() {
		String result = processor.processLine("BUENOS AIRES", "NAME", "BARCELONA", "123");
	    assertNull(result);
	}
}
