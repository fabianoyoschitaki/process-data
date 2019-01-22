package br.com.javachallenge.processdata.util;

/**
 * Formats that can be used
 * 
 * @author Fabiano Yoschitaki
 *
 */
public enum FormatType {
	/**
	 * Format F1
	 */
	FORMAT_ONE("F1", ","), 
	
	/**
	 * Format F2
	 */
	FORMAT_TWO("F2", ";");

	private String value;
	private String delimiter;

	FormatType(String value, String delimiter) {
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
