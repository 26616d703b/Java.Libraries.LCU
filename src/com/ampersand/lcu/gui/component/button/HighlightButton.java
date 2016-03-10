package com.ampersand.lcu.gui.component.button;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;

import com.ampersand.lcu.gui.color.ColorPalette;
import com.ampersand.lcu.gui.font.FontManager;

public class HighlightButton extends JButton {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -8480878745895087440L;

	private Color m_default;
	private Color m_highlight;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public HighlightButton(String text) {

		super(text);

		initDefaultProperties();
	}

	public HighlightButton(Icon icon) {

		super(icon);

		initDefaultProperties();
	}

	public HighlightButton(String text, Icon icon) {

		super(text, icon);

		initDefaultProperties();
	}

	public HighlightButton(Icon icon, Color background_color, Color highlight_color) {

		super(icon);

		m_default = background_color;
		m_highlight = highlight_color;

		initCommonProperties();
	}

	public HighlightButton(String text, Color background_color, Color foreground_color) {

		super(text);

		initDefaultProperties();

		m_default = background_color;

		setForeground(foreground_color);
	}

	public HighlightButton(String text, Color background_color, Color foreground_color, Color highlight_color) {

		super(text);

		m_default = background_color;
		m_highlight = highlight_color;

		initCommonProperties();

		setForeground(foreground_color);
	}

	public HighlightButton(String text, Icon icon, Color background_color, Color foreground_color,
			Color highlight_color) {

		super(text, icon);

		m_default = background_color;
		m_highlight = highlight_color;

		initCommonProperties();

		setForeground(foreground_color);
	}

	// ACCESSORS and MUTATORS

	// DEFAULT COLOR

	public Color defaultColor() {

		return m_default;
	}

	public void setDefaultColor(Color default_color) {

		m_default = default_color;
	}

	// HIGHLIGHT COLOR

	public Color highlightColor() {

		return m_highlight;
	}

	public void setHighlightColor(Color highlight_color) {

		m_highlight = highlight_color;
	}

	// INISIALIZATIONS

	private void initCommonProperties() {

		setBorderPainted(false);
		setContentAreaFilled(false);
		setFocusable(false);
		setFont(FontManager.CENTURY_GOTHIC_20);
	}

	private void initDefaultProperties() {

		m_default = ColorPalette.WHITE;
		m_highlight = ColorPalette.LIGHT_GRAY;

		setBackground(m_default);

		initCommonProperties();
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public void paintComponent(Graphics g) {

		final Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		final ButtonModel model = getModel();

		final int width = getWidth();
		final int height = getHeight();

		if (!model.isEnabled()) {

			g2d.setColor(ColorPalette.GRAY);
			g2d.fillRect(0, 0, width, height);
		} else {

			g2d.setColor(m_default);
			g2d.fillRect(0, 0, width, height);

			if (model.isRollover()) {

				g2d.setColor(m_highlight);
				g2d.fillRect(0, 0, width, height);
			}
		}

		if (model.isPressed()) {

			g2d.setColor(ColorPalette.WHITE);
			g2d.fillRect(0, 0, width, height);
		}

		final RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0, 0, width - 1, height - 1, 10, 10);
		final Shape clip = g2d.getClip();

		g2d.clip(r2d);
		g2d.fillRect(0, 0, width, height);
		g2d.setClip(clip);
		g2d.setColor(ColorPalette.BLACK);

		g2d.drawRect(0, 0, width - 1, height - 1);
		g2d.drawRect(1, 1, width - 3, height - 3);

		g2d.dispose();

		super.paintComponent(g);
	}
}