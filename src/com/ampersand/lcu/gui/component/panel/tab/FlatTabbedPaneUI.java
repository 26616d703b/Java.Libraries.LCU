package com.ampersand.lcu.gui.component.panel.tab;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

import com.ampersand.lcu.gui.color.ColorPalette;

public class FlatTabbedPaneUI extends BasicTabbedPaneUI {

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public FlatTabbedPaneUI() {

	}

	// RE-IMPLEMENTED METHODS

	@Override
	protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex,
			Rectangle iconRect, Rectangle textRect, boolean isSelected) {
	}

	@Override
	protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {

		return fontHeight * 10;
	}

	@Override
	protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {

		return metrics.getFont().getSize() * 15;
	}

	@Override
	protected void paintText(Graphics g, int tabPlacement, Font font, FontMetrics metrics, int tabIndex, String title,
			Rectangle textRect, boolean isSelected) {

		font = new Font("Segoe UI", Font.PLAIN, font.getSize());

		g.setColor(ColorPalette.BLACK);
		g.setFont(font);
		g.drawString(title, textRect.x - font.getSize() / 2, textRect.y);
	}

	@Override
	protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h,
			boolean isSelected) {

		if (isSelected) {

			g.setColor(ColorPalette.ORANGE);
		}

		g.fillRect(x, y, w, h);
	}
}
