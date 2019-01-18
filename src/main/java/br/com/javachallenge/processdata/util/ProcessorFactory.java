package br.com.javachallenge.processdata.util;

public class ProcessorFactory {
	public static Processor getProcessor(String type) {
        if ("CITY".equals(type)) {
            return new CityProcessor();
        } else if ("ID".equals(type)) {
            return new IdProcessor();
        }
        return null;
    }
}
