/**
 * 
 */
package com.reportengine.main;

import java.util.List;

import com.reportengine.beans.TradeInstruction;
import com.reportengine.services.IReportDataGenerator;
import com.reportengine.services.impl.ReportDataGeneratorImpl;
import com.reportengine.testdata.ReportDataGenerator;

/**
 * @author Libu
 *
 */
public class TradeReportEngineApp {

	/**
	 * This is the class from which application run starts
	 * 
	 * @param args
	 */

	private TradeReportEngineApp() {

	}

	public static void main(String[] args) {
		final List<TradeInstruction> instruction = ReportDataGenerator.generateTestData();
		IReportDataGenerator report = new ReportDataGeneratorImpl();
		System.out.println(report.generateTestData(instruction));
	}

}
