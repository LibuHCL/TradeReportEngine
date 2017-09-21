/**
 * 
 */
package com.reportengine.utils;

import java.util.function.Predicate;

import com.reportengine.beans.TradeInstruction;
import com.reportengine.enums.PurchaseType;

/**
 * @author Libu
 *
 */
public class TradeReportPredicates {

	public final static Predicate<TradeInstruction> outgoingPredicate = instruction -> instruction.getType()
			.equals(PurchaseType.BUY.value());

	public final static Predicate<TradeInstruction> incomingPredicate = instruction -> instruction.getType()
			.equals(PurchaseType.SELL.value());

}
