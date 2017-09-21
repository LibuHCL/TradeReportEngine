/**
 * 
 */
package com.reportengine.services.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.reportengine.beans.TradeInstruction;
import com.reportengine.services.IReportDataGenerator;
import com.reportengine.utils.SettlementDateCalculator;
import com.reportengine.utils.TradeReportStats;

/**
 * @author Libu
 *
 */
public class ReportDataGeneratorImpl implements IReportDataGenerator {

	StringBuilder stringBuilder = new StringBuilder();

	@Override
	public String generateTestData(List<TradeInstruction> tradeInstruction) {
		SettlementDateCalculator.settlementDatesCalc(tradeInstruction);
		return null;
	}

	private static StringBuilder generateDailyOutgoingAmount(List<TradeInstruction> instructions,
			StringBuilder stringBuilder) {
		final Map<LocalDate, BigDecimal> dailyOutgoingAmount = TradeReportStats
				.calculateDailyOutgoingAmount(instructions);

		stringBuilder.append("\n----------------------------------------\n")
				.append("         Outgoing Daily Amount          \n")
				.append("----------------------------------------\n")
				.append("      Date       |    Trade Amount      \n")
				.append("----------------------------------------\n");

		for (LocalDate date : dailyOutgoingAmount.keySet()) {
			stringBuilder.append(date).append("       |      ").append(dailyOutgoingAmount.get(date)).append("\n");
		}

		return stringBuilder;
	}

	private static StringBuilder generateDailyIncomingAmount(List<TradeInstruction> instructions,
			StringBuilder stringBuilder) {
		final Map<LocalDate, BigDecimal> dailyOutgoingAmount = TradeReportStats
				.calculateDailyIncomingAmount(instructions);

		stringBuilder.append("\n----------------------------------------\n")
				.append("         Incoming Daily Amount          \n")
				.append("----------------------------------------\n")
				.append("      Date       |    Trade Amount      \n")
				.append("----------------------------------------\n");

		for (LocalDate date : dailyOutgoingAmount.keySet()) {
			stringBuilder.append(date).append("       |      ").append(dailyOutgoingAmount.get(date)).append("\n");
		}

		return stringBuilder;
	}

}
