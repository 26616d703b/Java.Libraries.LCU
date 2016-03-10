package com.ampersand.lcu.io.printing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class BasicPrintable implements Printable {

	/*
	 * Methods
	 */

	// RE-IMPLEMENTED METHODS

	// ----------------------------------------------------[ P
	// ]----------------------------------------------------//

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

		if (pageIndex > 0) {

			return Printable.NO_SUCH_PAGE;
		} else {

			final Graphics2D g2d = (Graphics2D) graphics;
			g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

			return Printable.PAGE_EXISTS;
		}
	}
}
