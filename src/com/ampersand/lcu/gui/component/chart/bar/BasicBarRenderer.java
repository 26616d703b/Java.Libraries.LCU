package com.ampersand.lcu.gui.component.chart.bar;

import java.awt.Color;
import java.awt.Paint;

import org.jfree.chart.LegendItem;
import org.jfree.chart.renderer.category.BarRenderer;

import com.ampersand.lcu.gui.color.ColorPalette;
import com.ampersand.lcu.gui.font.FontManager;

public class BasicBarRenderer extends BarRenderer {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = 1466106569669671273L;

	private final Paint[] m_colors;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public BasicBarRenderer() {

		final Color[] colors = ColorPalette.getDefaults();

		m_colors = colors;

		setBarPainter(new BasicBarPainter());
	}

	public BasicBarRenderer(Paint[] colors) {

		m_colors = colors;

		setBarPainter(new BasicBarPainter());
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public Paint getItemPaint(int row, int column) {

		return m_colors[row % m_colors.length];
	}

	@Override
	public LegendItem getLegendItem(int datasetIndex, int series) {

		final LegendItem item = super.getLegendItem(datasetIndex, series);
		item.setLabelFont(FontManager.CENTURY_GOTHIC_16);
		item.setFillPaint(m_colors[series % m_colors.length]);

		return item;
	}
}
