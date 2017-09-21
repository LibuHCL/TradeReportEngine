/**
 * 
 */
package com.reportengine.utils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.reportengine.beans.TradeInstruction;
import com.reportengine.enums.PurchaseType;

/**
 * @author Libu
 *
 */

public class TradeReportStats {

	private final static Predicate<TradeInstruction> outgoingInstructionsPredicate = instruction -> instruction
			.getType().equals(PurchaseType.BUY.value());

	private final static Predicate<TradeInstruction> incomingInstructionsPredicate = instruction -> instruction
			.getType().equals(PurchaseType.SELL.value());

	public static Map<LocalDate, BigDecimal> calculateDailyOutgoingAmount(List<TradeInstruction> instructions) {
		return calculateDailyAmount(instructions, outgoingInstructionsPredicate);
	}

	public static Map<LocalDate, BigDecimal> calculateDailyIncomingAmount(List<TradeInstruction> instructions) {
		return calculateDailyAmount(instructions, incomingInstructionsPredicate);
	}

	public static Map<LocalDate, BigDecimal> calculateDailyAmount(List<TradeInstruction> instructions,
			Predicate<TradeInstruction> predicate) {

		return (Map<LocalDate, BigDecimal>) instructions.stream().filter(predicate);

	}

}
