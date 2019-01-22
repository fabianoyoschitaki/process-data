package br.com.javachallenge.processdata.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ProcessorTest {
	Processor processor = new IdProcessor();

	@Test
	public void shouldPrintBarcelona() {
		String result = processor.processLine("123", "NAME", "BARCELONA", "123");
	    assertEquals("BARCELONA", result);
	}
	
	@Test
	public void shouldReturnNull() {
		String result = processor.processLine("456", "NAME", "BARCELONA", "123");
	    assertNull(result);
	}
}
