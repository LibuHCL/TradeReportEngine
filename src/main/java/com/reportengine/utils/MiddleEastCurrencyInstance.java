/**
 * 
 */
package com.reportengine.utils;

/**
 * @author Libu
 *
 */
import java.time.DayOfWeek;

import com.reportengine.services.impl.WorkingDays;

public class MiddleEastCurrencyInstance extends WorkingDays {

	private static MiddleEastCurrencyInstance instance = null;

	// Singleton Design Pattern
	public static MiddleEastCurrencyInstance getInstance() {
		if (instance == null) {
			instance = new MiddleEastCurrencyInstance();
		}
		return instance;
	}

	private MiddleEastCurrencyInstance() {
		super();
	}

	@Override
	protected void middleEastWorkingDays() {
		this.map.put(DayOfWeek.SUNDAY, true);
		this.map.put(DayOfWeek.MONDAY, true);
		this.map.put(DayOfWeek.TUESDAY, true);
		this.map.put(DayOfWeek.WEDNESDAY, true);
		this.map.put(DayOfWeek.THURSDAY, true);
		this.map.put(DayOfWeek.FRIDAY, false);
		this.map.put(DayOfWeek.SATURDAY, false);
	}

}
