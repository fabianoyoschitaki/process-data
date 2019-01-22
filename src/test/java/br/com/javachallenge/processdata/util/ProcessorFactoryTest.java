package br.com.javachallenge.processdata.util;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProcessorFactoryTest {
	@Test
	public void shouldReturnIdProcessorClass() {
		Processor processor = ProcessorFactory.getProcessor("ID");
		assertTrue(processor instanceof IdProcessor);
	}
	
	@Test
	public void shouldReturnCityProcessorClass() {
		Processor processor = ProcessorFactory.getProcessor("CITY");
		assertTrue(processor instanceof CityProcessor);
	}
	
	@Test
	public void shouldReturnNull() {
		Processor processor = ProcessorFactory.getProcessor("X");
		assertNull(processor);
	}
}
