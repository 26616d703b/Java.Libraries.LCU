package com.ampersand.lcu.gui.component.button;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;

import com.ampersand.lcu.gui.color.ColorPalette;

public class RoundButton extends JButton {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = 3298120136141491750L;

	private Shape m_shape;

	/*
	 * Methods
	 */

	// CONSTRUCTORS

	public RoundButton(String text) {

		super(text);

		// These statements enlarge the button so that it
		// becomes a circle rather than an oval.

		final Dimension size = getPreferredSize();
		size.width = size.height = Math.max(size.width, size.height);

		setPreferredSize(size);

		// This call causes the JButton not to paint
		// the background.
		// This allows us to paint a round background.
		setContentAreaFilled(false);
	}

	// RE-IMPLEMENTED METHODS

	// Paint the round background and label.

	@Override
	protected void paintComponent(Graphics g) {

		if (getModel().isArmed()) {
			// You might want to make the highlight color
			// a property of the RoundButton class.
			g.setColor(ColorPalette.LIGHT_GRAY);
		} else {

			g.setColor(getBackground());
		}

		g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);

		// This call will paint the label and the
		// focus rectangle.
		super.paintComponent(g);
	}

	// Paint the border of the button using a simple stroke.
	@Override
	protected void paintBorder(Graphics g) {

		final Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(getForeground());
		g2d.setStroke(new BasicStroke(3));

		g2d.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
	}

	@Override
	public boolean contains(int x, int y) {
		// If the button has changed size,
		// make a new shape object.
		if (m_shape == null || !m_shape.getBounds().equals(getBounds())) {

			m_shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		}

		return m_shape.contains(x, y);
	}
}