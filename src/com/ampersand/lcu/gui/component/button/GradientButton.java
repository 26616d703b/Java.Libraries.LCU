package com.ampersand.lcu.gui.component.button;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;

public class GradientButton extends JButton {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -7511382588302945226L;

	private GradientPaint m_gradient_paint;

	private Color m_start_color;
	private Color m_end_color;
	private Color m_roll_over_color;
	private Color m_pressed_color;
	private int m_direction;
	private boolean m_rounded;

	public static final int HORIZONTAL = 0;
	public static final int VERTICAL = 1;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public GradientButton(String text) {

		super(text);

		initProperties();
	}

	public GradientButton(Icon icon) {

		super(icon);

		initProperties();
	}

	public GradientButton(String text, Icon icon) {

		super(icon);

		initProperties();
	}

	public GradientButton(String text, Color start_color, Color end_color, Color roll_over_color, Color pressed_color,
			int gradient_direction, boolean rounded) {

		super(text);

		m_start_color = start_color;
		m_end_color = end_color;
		m_roll_over_color = roll_over_color;
		m_pressed_color = pressed_color;
		m_direction = gradient_direction;
		m_rounded = rounded;

		initDefaultProperties();
	}

	public GradientButton(Icon icon, Color start_color, Color end_color, Color roll_over_color, Color pressed_color,
			int gradient_direction, boolean rounded) {

		super(icon);

		m_start_color = start_color;
		m_end_color = end_color;
		m_roll_over_color = roll_over_color;
		m_pressed_color = pressed_color;
		m_direction = gradient_direction;
		m_rounded = rounded;

		initDefaultProperties();
	}

	public GradientButton(String text, Icon icon, Color start_color, Color end_color, Color roll_over_color,
			Color pressed_color, int gradient_direction, boolean rounded) {

		super(text, icon);

		m_start_color = start_color;
		m_end_color = end_color;
		m_roll_over_color = roll_over_color;
		m_pressed_color = pressed_color;
		m_direction = gradient_direction;
		m_rounded = rounded;

		initDefaultProperties();
	}

	// ACCESSORS and MUTATORS

	// START COLOR

	public Color getStartColor() {

		return m_start_color;
	}

	public void setStartColor(Color color) {

		m_start_color = color;
	}

	// END COLOR

	public Color getEndColor() {

		return m_end_color;
	}

	public void setEndColor(Color pressed_color) {

		m_end_color = m_pressed_color;
	}

	// GRADIENT DIRECTION

	public int getGradientDirection() {

		return m_direction;
	}

	public void setGradientDirection(int gradient_direction) {

		m_direction = gradient_direction;
	}

	// ROUNDED

	public boolean isRounded() {

		return m_rounded;
	}

	public void setRounded(boolean rounded) {

		m_rounded = rounded;
	}

	// INISIALIZATIONS

	public void initDefaultProperties() {

		setBorderPainted(false);
		setContentAreaFilled(false);
		setFocusable(false);
		setForeground(Color.BLACK);
	}

	public void initProperties() {

		m_start_color = Color.WHITE;
		m_end_color = Color.DARK_GRAY;
		m_roll_over_color = Color.ORANGE;
		m_pressed_color = Color.RED;
		m_direction = VERTICAL;
		m_rounded = false;

		initDefaultProperties();
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public void paintComponent(Graphics g) {

		final Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		final int height = getHeight();
		final int width = getWidth();

		final ButtonModel model = getModel();

		if (!model.isEnabled()) {

			setForeground(Color.GRAY);

			m_gradient_paint = new GradientPaint(0, 0, Color.LIGHT_GRAY, 0, height, Color.LIGHT_GRAY, true);
		} else {

			setForeground(Color.BLACK);

			if (model.isRollover()) {

				switch (m_direction) {

				case 0:

					m_gradient_paint = new GradientPaint(0, 0, m_start_color, width, 0, m_roll_over_color, true);

					break;

				case 1:

					m_gradient_paint = new GradientPaint(0, 0, m_start_color, 0, height, m_roll_over_color, true);

					break;

				default:
					break;
				}
			} else {

				switch (m_direction) {

				case 0:

					m_gradient_paint = new GradientPaint(0, 0, m_start_color, width, 0, m_end_color, true);

					break;

				case 1:

					m_gradient_paint = new GradientPaint(0, 0, m_start_color, 0, height, m_end_color, true);

					break;

				default:
					break;
				}
			}
		}

		g2d.setPaint(m_gradient_paint);

		GradientPaint p1;
		GradientPaint p2;

		if (model.isPressed()) {

			switch (m_direction) {

			case 0:

				m_gradient_paint = new GradientPaint(0, 0, m_start_color, width, 0, m_pressed_color, true);

				break;

			case 1:

				m_gradient_paint = new GradientPaint(0, 0, m_start_color, 0, height, m_pressed_color, true);

				break;

			default:
				break;
			}

			g2d.setPaint(m_gradient_paint);

			p1 = new GradientPaint(0, 0, Color.BLACK, 0, height - 1, Color.DARK_GRAY);
			p2 = new GradientPaint(0, 1, new Color(0, 0, 0, 50), 0, height - 3, new Color(255, 255, 255, 100));
		} else {

			p1 = new GradientPaint(0, 0, Color.DARK_GRAY, 0, height - 1, Color.BLACK);
			p2 = new GradientPaint(0, 1, new Color(255, 255, 255, 100), 0, height - 3, new Color(0, 0, 0, 50));

			m_gradient_paint = new GradientPaint(0, 0, m_start_color, 0, height, m_end_color, true);
		}

		final RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0, 0, width - 1, height - 1, 10, 10);
		final Shape clip = g2d.getClip();

		g2d.clip(r2d);
		g2d.fillRect(0, 0, width, height);
		g2d.setClip(clip);
		g2d.setPaint(p1);

		if (m_rounded) {

			g2d.drawRoundRect(0, 0, width - 1, height - 1, 10, 10);
			g2d.drawRoundRect(1, 1, width - 3, height - 3, 10, 10);
		} else {

			g2d.drawRect(0, 0, width - 1, height - 1);
			g2d.drawRect(1, 1, width - 3, height - 3);
		}

		g2d.setPaint(p2);
		g2d.dispose();

		super.paintComponent(g);
	}
}
