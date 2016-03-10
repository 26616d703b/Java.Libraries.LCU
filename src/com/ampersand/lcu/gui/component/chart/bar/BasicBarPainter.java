package com.ampersand.lcu.gui.component.chart.bar;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;

import org.jfree.chart.renderer.category.BarPainter;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.ui.RectangleEdge;

public class BasicBarPainter implements BarPainter {

	/*
	 * Methods
	 */

	// RE-IMPLEMENTED METHODS

	@Override
	public void paintBar(Graphics2D g2d, BarRenderer renderer, int row, int column, RectangularShape bar,
			RectangleEdge base) {

		g2d.setColor((Color) renderer.getItemPaint(row, column));
		g2d.fill(bar);
	}

	@Override
	public void paintBarShadow(Graphics2D g2d, BarRenderer renderer, int row, int column, RectangularShape var,
			RectangleEdge base, boolean pegShadow) {

	}
}
