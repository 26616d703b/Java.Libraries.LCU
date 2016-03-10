package com.ampersand.lcu.gui.component.label;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;

public class OverviewLabel extends JLabel implements MouseListener {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -4843089521262436868L;

	private String m_text;
	private String m_rollover_text;

	private Icon m_icon;
	private Icon m_rollover_icon;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public OverviewLabel(String text, String rollover_text, Icon icon, Icon rollover_icon, int horizontal_alignment) {

		super.setText(text);
		super.setIcon(icon);
		super.setHorizontalAlignment(horizontal_alignment);

		addMouseListener(this);

		m_text = text;
		m_rollover_text = rollover_text;

		m_icon = icon;
		m_rollover_icon = rollover_icon;
	}

	// ACCESSORS and MUTATORS

	// TEXT

	@Override
	public String getText() {

		return super.getText();
	}

	@Override
	public void setText(String text) {

		m_text = text;
	}

	// ROLLOVER TEXT

	public String getRolloverText() {

		return m_rollover_text;
	}

	public void setRolloverText(String text) {

		m_rollover_text = text;
	}

	// ICON

	@Override
	public Icon getIcon() {

		return super.getIcon();
	}

	@Override
	public void setIcon(Icon icon) {

		m_icon = icon;

		super.setIcon(icon);
	}

	// ROLLOVER ICON

	public Icon getRolloverIcon() {

		return m_rollover_icon;
	}

	public void setRolloverIcon(Icon icon) {

		m_rollover_icon = icon;
	}

	// RE-IMPLEMENTED METHODS

	// MOUSE EVENT

	@Override
	public void mouseClicked(MouseEvent event) {
	}

	@Override
	public void mouseEntered(MouseEvent event) {

		super.setIcon(m_rollover_icon);
		super.setText(m_rollover_text);
	}

	@Override
	public void mouseExited(MouseEvent event) {

		super.setIcon(m_icon);
		super.setText(m_text);
	}

	@Override
	public void mousePressed(MouseEvent event) {
	}

	@Override
	public void mouseReleased(MouseEvent event) {
	}
}
