/**
 * 
 */
package com.reportengine.beans;

import java.math.BigDecimal;
import java.math.MathContext;

import com.reportengine.enums.InstructionDetails;
import com.reportengine.enums.PurchaseType;

/**
 * This is the Instruction which contains the details for which processing needs
 * to be performed from various clients
 * 
 * @author Libu
 *
 */
public class TradeInstruction {

	private String tradingEntity;

	private PurchaseType purchaseType;

	private InstructionDetails instructionDetails;

	private BigDecimal USDTradingAmount;

	private String type;

	public TradeInstruction(String tradingEntity, PurchaseType purchaseType, InstructionDetails instructionDetails) {
		this.tradingEntity = tradingEntity;
		this.purchaseType = purchaseType;
		this.instructionDetails = instructionDetails;
		this.USDTradingAmount = tradeAmountCalc(instructionDetails);
	}

	private static BigDecimal tradeAmountCalc(InstructionDetails instructionDetails) {
		MathContext mc = new MathContext(4);
		BigDecimal intermediateResult = instructionDetails.getPricePerUnit()
				.multiply(BigDecimal.valueOf(instructionDetails.getUnits()).movePointLeft(2), mc);
		return intermediateResult.multiply(instructionDetails.getAgreedFX(), mc);

	}

	public String getTradingEntity() {
		return tradingEntity;
	}

	public void setTradingEntity(String tradingEntity) {
		this.tradingEntity = tradingEntity;
	}

	public PurchaseType getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(PurchaseType purchaseType) {
		this.purchaseType = purchaseType;
	}

	public InstructionDetails getInstructionDetails() {
		return instructionDetails;
	}

	public void setInstructionDetails(InstructionDetails instructionDetails) {
		this.instructionDetails = instructionDetails;
	}

	public BigDecimal getUSDTradingAmount() {
		return USDTradingAmount;
	}

	public void setUSDTradingAmount(BigDecimal uSDTradingAmount) {
		USDTradingAmount = uSDTradingAmount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getTradeAmount() {
		return getInstructionDetails().getTradeAmount().setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}

}
