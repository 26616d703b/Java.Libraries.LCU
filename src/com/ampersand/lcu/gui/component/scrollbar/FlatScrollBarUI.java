package com.ampersand.lcu.gui.component.scrollbar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class FlatScrollBarUI extends BasicScrollBarUI {

	/*
	 * Attributes
	 */

	private Color m_bar_color;
	private Color m_button_color;
	private Color m_border_color;

	/*
	 * Methods
	 */

	// CONSTRUCTORS

	public FlatScrollBarUI() {

		super();

		m_bar_color = Color.LIGHT_GRAY;
		m_button_color = Color.LIGHT_GRAY;
		m_border_color = Color.LIGHT_GRAY;
	}

	public FlatScrollBarUI(Color bar_and_button_color) {

		super();

		m_bar_color = bar_and_button_color;
		m_button_color = bar_and_button_color;
		m_border_color = bar_and_button_color;
	}

	public FlatScrollBarUI(Color bar_color, Color button_color) {

		super();

		m_bar_color = bar_color;
		m_button_color = button_color;
		m_border_color = Color.BLACK;
	}

	public FlatScrollBarUI(Color bar_color, Color button_color, Color border_color) {

		super();

		m_bar_color = bar_color;
		m_button_color = button_color;
		m_border_color = border_color;
	}

	// ACCESSORS and MUTATORS

	// BAR COLOR

	public Color getBarColor() {

		return m_bar_color;
	}

	public void setBarColor(Color color) {

		m_bar_color = color;
	}

	// BUTTON COLOR

	public Color getButtonColor() {

		return m_button_color;
	}

	public void setButtonColor(Color color) {

		m_button_color = color;
	}

	// BORDER COLOR

	public Color getBorderColor() {

		return m_border_color;
	}

	public void setBorderColor(Color color) {

		m_border_color = color;
	}

	// RE-IMPLEMENTED METHODS

	@Override
	protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {

		super.paintTrack(g, c, trackBounds);
	}

	@Override
	protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {

		thumbColor = m_bar_color;
		thumbDarkShadowColor = m_border_color;
		thumbHighlightColor = m_border_color;
		thumbLightShadowColor = m_border_color;

		super.paintThumb(g, c, thumbBounds);
	}

	@Override
	protected JButton createIncreaseButton(int orientation) {

		final JButton button = super.createIncreaseButton(orientation);
		button.setBackground(m_button_color);
		button.setBorder(new LineBorder(m_border_color, 2));

		return button;
	}

	@Override
	protected JButton createDecreaseButton(int orientation) {

		final JButton button = super.createDecreaseButton(orientation);
		button.setBackground(m_button_color);
		button.setBorder(new LineBorder(m_border_color, 2));

		return button;
	}
}
