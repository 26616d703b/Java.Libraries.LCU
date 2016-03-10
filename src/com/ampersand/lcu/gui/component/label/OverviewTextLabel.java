package com.ampersand.lcu.gui.component.label;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class OverviewTextLabel extends JLabel implements MouseListener {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -4843089521262436868L;

	private String m_default;
	private String m_rollover;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public OverviewTextLabel(String text, String rollover_text) {

		super.setText(text);

		addMouseListener(this);

		m_default = text;
		m_rollover = rollover_text;
	}

	public OverviewTextLabel(String text, String rollover_text, int horizontal_alignement) {

		super.setText(text);
		super.setHorizontalAlignment(horizontal_alignement);

		addMouseListener(this);

		m_default = text;
		m_rollover = rollover_text;
	}

	// ACCESSORS and MUTATORS

	// TEXT

	@Override
	public String getText() {

		return super.getText();
	}

	@Override
	public void setText(String text) {

		m_default = text;
	}

	// ROLLOVER TEXT

	public String getRolloverText() {

		return m_rollover;
	}

	public void setRolloverText(String text) {

		m_rollover = text;
	}

	// RE-IMPLEMENTED METHODS

	// MOUSE EVENT

	@Override
	public void mouseClicked(MouseEvent event) {
	}

	@Override
	public void mouseEntered(MouseEvent event) {

		super.setText(m_rollover);
	}

	@Override
	public void mouseExited(MouseEvent event) {

		super.setText(m_default);
	}

	@Override
	public void mousePressed(MouseEvent event) {
	}

	@Override
	public void mouseReleased(MouseEvent event) {
	}
}
