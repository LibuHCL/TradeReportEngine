/**
 * 
 */
package com.reportengine.utils;

import java.time.DayOfWeek;

import com.reportengine.services.impl.WorkingDays;

/**
 * @author Libu
 *
 */
public class NormalCountryWorkingDays extends WorkingDays {

	private static NormalCountryWorkingDays instance = null;

	public static NormalCountryWorkingDays getInstance() {
		if (instance == null) {
			instance = new NormalCountryWorkingDays();
		}
		return instance;
	}

	private NormalCountryWorkingDays() {
		super();
	}

	@Override
	protected void middleEastWorkingDays() {
		this.map.put(DayOfWeek.MONDAY, true);
		this.map.put(DayOfWeek.TUESDAY, true);
		this.map.put(DayOfWeek.WEDNESDAY, true);
		this.map.put(DayOfWeek.THURSDAY, true);
		this.map.put(DayOfWeek.FRIDAY, true);
		this.map.put(DayOfWeek.SATURDAY, false);
		this.map.put(DayOfWeek.SUNDAY, false);
	}

}
