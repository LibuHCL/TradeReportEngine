/**
 * 
 */
package com.reportengine.services;

import java.util.List;

import com.reportengine.beans.TradeInstruction;

/**
 * @author Libu
 *
 */
public interface IReportDataGenerator {

	public String generateTestData(List<TradeInstruction> tradeInstruction);

}
