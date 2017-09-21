/**
 * 
 */
package com.reportengine.enums;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Libu
 *
 */
public class InstructionDetails {

	private BigDecimal agreedFX;

	private String currency;

	private LocalDate instructionDate;

	private LocalDate settlementDate;

	private Integer units;

	private BigDecimal pricePerUnit;
	
	private BigDecimal tradeAmount;

	public InstructionDetails(BigDecimal agreedFX, String currency, LocalDate instructionDate, LocalDate settlementDate,
			Integer units, BigDecimal pricePerUnit) {

		this.agreedFX = agreedFX;
		this.currency = currency;
		this.instructionDate = instructionDate;
		this.settlementDate = settlementDate;
		this.units = units;
		this.pricePerUnit = pricePerUnit;
	}

	public BigDecimal getAgreedFX() {
		return agreedFX;
	}

	public void setAgreedFX(BigDecimal agreedFX) {
		this.agreedFX = agreedFX;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public LocalDate getInstructionDate() {
		return instructionDate;
	}

	public void setInstructionDate(LocalDate instructionDate) {
		this.instructionDate = instructionDate;
	}

	public LocalDate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(LocalDate settlementDate) {
		this.settlementDate = settlementDate;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public BigDecimal getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public BigDecimal getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(BigDecimal tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	

}
