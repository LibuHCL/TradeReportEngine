/**
 * 
 */
package com.reportengine.utils;

import java.time.LocalDate;
import java.util.List;

import com.reportengine.beans.TradeInstruction;
import com.reportengine.services.IWorkingDays;

/**
 * This is the method which performs settlement calculation based on the
 * testdata passed as Input.
 * 
 * 
 * @author Libu
 *
 */
public class SettlementDateCalculator {

	public static void settlementDatesCalc(List<TradeInstruction> tradeInstruction) {

		for (TradeInstruction instruction : tradeInstruction) {
			settlementDateCalc(instruction);
		}

	}

	public static void settlementDateCalc(TradeInstruction instruction) {

		IWorkingDays workingDays = getWorkingDaysStrategy(instruction.getInstructionDetails().getCurrency());
		LocalDate settlementDate = workingDays
				.tradeFirstWorkingDay(instruction.getInstructionDetails().getSettlementDate());
		if (settlementDate != null) {
			instruction.getInstructionDetails().setSettlementDate(settlementDate);
		}
	}

	/**
	 * Select proper strategy based on the Currency
	 * 
	 * @param currency
	 *            the currency to choose
	 * @return the proper working days strategy
	 */
	private static IWorkingDays getWorkingDaysStrategy(String currency) {
		if ((currency.equals("AED")) || (currency.equals("SAR"))) {
			return MiddleEastCurrencyInstance.getInstance();
		}
		return NormalCountryWorkingDays.getInstance();
	}
}
