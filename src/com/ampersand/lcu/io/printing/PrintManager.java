package com.ampersand.lcu.io.printing;

import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;

public final class PrintManager {

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ P
	// ]----------------------------------------------------//

	public static void print(Printable printable) {

		final PrinterJob printer_job = PrinterJob.getPrinterJob();
		printer_job.setPrintable(printable);

		final HashPrintRequestAttributeSet printRequestSet = new HashPrintRequestAttributeSet();
		printRequestSet.add(OrientationRequested.LANDSCAPE);

		if (printer_job.printDialog(printRequestSet)) {

			try {

				printer_job.print();
			} catch (final PrinterException e) {

				System.err.println(e);
			}
		}
	}
}
