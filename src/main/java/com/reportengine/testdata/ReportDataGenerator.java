/**
 * 
 */
package com.reportengine.testdata;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.reportengine.beans.TradeInstruction;
import com.reportengine.enums.Entity;
import com.reportengine.enums.InstructionDetails;
import com.reportengine.enums.PurchaseType;

/**
 * @author Libu
 *
 */
public class ReportDataGenerator {

	public static List<TradeInstruction> generateTestData() {

		List<TradeInstruction> details = new ArrayList<TradeInstruction>();
		details.add(new TradeInstruction(Entity.FOO.value(), PurchaseType.BUY,
				new InstructionDetails(BigDecimal.valueOf(0.50), "SGP", LocalDate.of(2016, 1, 1),
						LocalDate.of(2016, 1, 2), 200, BigDecimal.valueOf(100.25))));
		details.add(new TradeInstruction(Entity.BAR.value(), PurchaseType.SELL,
				new InstructionDetails(BigDecimal.valueOf(0.22), "AED", LocalDate.of(2016, 5, 1),
						LocalDate.of(2017, 7, 1), 450, BigDecimal.valueOf(150.5))));
		details.add(new TradeInstruction(Entity.QUUX.value(), PurchaseType.BUY,
				new InstructionDetails(BigDecimal.valueOf(1.50), "USD", LocalDate.of(2016, 6, 2),
						LocalDate.of(2016, 7, 3), 300, BigDecimal.valueOf(110.25))));
		details.add(new TradeInstruction(Entity.BAZ.value(), PurchaseType.SELL,
				new InstructionDetails(BigDecimal.valueOf(2.50), "INR", LocalDate.of(2016, 7, 3),
						LocalDate.of(2016, 8, 4), 400, BigDecimal.valueOf(120.25))));

		return details;

	}

}
