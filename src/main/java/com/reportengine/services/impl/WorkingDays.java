/**
 * 
 */
package com.reportengine.services.impl;

/**
 * @author Libu
 *
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.reportengine.services.IWorkingDays;

public abstract class WorkingDays implements IWorkingDays {
	protected Map<DayOfWeek, Boolean> map = new HashMap();

	protected abstract void middleEastWorkingDays();

	public WorkingDays() {
		middleEastWorkingDays();
	}

	public LocalDate tradeFirstWorkingDay(LocalDate date) {

		if (map.values().stream().noneMatch(b -> b)) {
			return null;
		}

		return firstWorkingDayTrade(date);
	}

	public LocalDate firstWorkingDayTrade(LocalDate date) {
		final DayOfWeek inputDay = date.getDayOfWeek();

		// in case the given date is working date, just return this
		if (map.get(inputDay)) {
			return date;
		} else {
			// otherwise look for the next working date (Recursively)
			return firstWorkingDayTrade(date.plusDays(1));
		}
	}
}
