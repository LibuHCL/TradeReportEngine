/**
 * 
 */
package com.reportengine.services;

import java.time.LocalDate;

/**
 * @author ldrldc1
 *
 */
public interface IWorkingDays {
	
	LocalDate tradeFirstWorkingDay(LocalDate date);

}
