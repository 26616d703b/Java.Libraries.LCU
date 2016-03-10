package com.ampersand.lcu.gui.component.button;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;

public class FlatButton extends JButton {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = 2187645203915628365L;

	private int m_action_on_rollover;

	public static final int LIGHT = 0;
	public static final int DARKEN = 1;
	public static final int FOCUS = 2;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public FlatButton(String text) {

		super(text);

		initProperties();
	}

	public FlatButton(String text, int action_on_rollover) {

		super(text);

		initProperties();

		m_action_on_rollover = action_on_rollover;
	}

	public FlatButton(String text, Color background) {

		super(text);

		initProperties();

		setBackground(background);
	}

	public FlatButton(String text, Color background, int action_on_rollover) {

		super(text);

		initProperties();

		m_action_on_rollover = action_on_rollover;

		setBackground(background);
	}

	public FlatButton(String text, Color background, Color foreground) {

		super(text);

		initProperties();

		setBackground(background);
		setForeground(foreground);
	}

	public FlatButton(String text, Color background, Color foreground, int action_on_rollover) {

		super(text);

		initProperties();

		m_action_on_rollover = action_on_rollover;

		setBackground(background);
		setForeground(foreground);
	}

	public FlatButton(Icon icon) {

		super(icon);

		initProperties();
	}

	public FlatButton(Icon icon, int action_on_rollover) {

		super(icon);

		initProperties();

		m_action_on_rollover = action_on_rollover;
	}

	public FlatButton(Icon icon, Color background) {

		super(icon);

		initProperties();

		setBackground(background);
	}

	public FlatButton(Icon icon, Color background, int action_on_rollover) {

		super(icon);

		initProperties();

		m_action_on_rollover = action_on_rollover;

		setBackground(background);
	}

	public FlatButton(String text, Icon icon, Color background) {

		super(text, icon);

		initProperties();

		setBackground(background);
	}

	public FlatButton(String text, Icon icon, Color background, int action_on_rollover) {

		super(text, icon);

		initProperties();

		m_action_on_rollover = action_on_rollover;

		setBackground(background);
	}

	public FlatButton(String text, Icon icon, Color background, Color foreground) {

		super(text, icon);

		initProperties();

		setBackground(background);
		setForeground(foreground);
	}

	public FlatButton(String text, Icon icon, Color background, Color foreground, int action_on_rollover) {

		super(text, icon);

		initProperties();

		m_action_on_rollover = action_on_rollover;

		setBackground(background);
		setForeground(foreground);
	}

	// ACCESSORS and MUTATORS

	public int getActionOnRollover() {

		return m_action_on_rollover;
	}

	public void setActionOnRollover(int action) {

		m_action_on_rollover = action;
	}

	// IMPLEMENTED METHODS

	private void initProperties() {

		m_action_on_rollover = DARKEN;

		setBackground(Color.GRAY);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setFocusable(false);
		setFont(new Font("Century Gothic", Font.PLAIN, 20));
		setForeground(Color.WHITE);
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

			g2d.setColor(Color.GRAY);
			g2d.fillRect(0, 0, width, height);
		} else {

			g2d.setColor(getBackground());
			g2d.fillRect(0, 0, width, height);

			if (model.isRollover()) {

				switch (m_action_on_rollover) {

				case LIGHT:

					g2d.setColor(getBackground().brighter());
					g2d.fillRect(0, 0, width, height);

					break;

				case DARKEN:

					g2d.setColor(getBackground().darker());
					g2d.fillRect(0, 0, width, height);

					break;

				case FOCUS:

					g2d.setColor(Color.WHITE);
					g2d.drawRect(0, 0, width - 1, height - 1);

					g2d.setColor(getBackground());

					break;

				default:
					break;
				}
			}
		}

		if (model.isPressed()) {

			switch (m_action_on_rollover) {

			case LIGHT:

				g2d.setColor(getBackground().darker());

				break;

			case DARKEN:

				g2d.setColor(getBackground().brighter());

				break;

			case FOCUS:

				// DO NOTHING

				break;

			default:
				break;
			}

			g2d.fillRect(0, 0, width, height);
		}

		g2d.dispose();

		super.paintComponent(g);
	}
}
