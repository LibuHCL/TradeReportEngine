/**
 * 
 */
package com.reportengine.enums;

/**
 * This is the enum which contains the type of purchase the client instructs
 * JPMorgan to execute in the market
 * 
 * @author Libu
 *
 */
public enum PurchaseType {

	BUY("B"), SELL("S"), UNKNOWN("");
	private String type;

	PurchaseType(String type) {
		this.type = type;
	}

	public String value() {
		return type;
	}

}
