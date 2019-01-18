package br.com.javachallenge.processdata.util;

public enum FormatType {
	FORMAT_ONE("F1", ","), 
	FORMAT_TWO("F2", ";");
	
	private String value;
	private String delimiter;
	
	FormatType(String value, String delimiter){
		this.value = value;
		this.delimiter = delimiter;
	}
	
	public String getValue() {
		return value;
	}

	public String getDelimiter() {
		return delimiter;
	}
}
