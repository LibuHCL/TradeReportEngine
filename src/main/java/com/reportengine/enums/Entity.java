/**
 * 
 */
package com.reportengine.enums;

/**
 * This is the enum which maintains the list of entitys which has been sent by
 * various clients to JPMorgan to process with respect to International Market
 * 
 * @author Libu
 *
 */
public enum Entity {
	FOO("foo"), BAR("bar"), QUUX("quux"), BAZ("baz"), UNKNOWN("");

	private String entityValue;

	Entity(String entityValue) {
		this.entityValue = entityValue;
	}

	public String value() {
		return entityValue;
	}

}
