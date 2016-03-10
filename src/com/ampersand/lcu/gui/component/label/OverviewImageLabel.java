package com.ampersand.lcu.gui.component.label;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;

public class OverviewImageLabel extends JLabel implements MouseListener {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -4843089521262436868L;

	private Icon m_default;
	private Icon m_rollover;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public OverviewImageLabel(Icon default_icon, Icon rollover_icon) {

		super.setIcon(default_icon);

		addMouseListener(this);

		m_default = default_icon;
		m_rollover = rollover_icon;
	}

	public OverviewImageLabel(Icon default_icon, Icon rollover_icon, int horizontal_alignment) {

		super.setIcon(default_icon);
		super.setHorizontalAlignment(horizontal_alignment);

		addMouseListener(this);

		m_default = default_icon;
		m_rollover = rollover_icon;
	}

	// ACCESSORS and MUTATORS

	// ICON

	@Override
	public Icon getIcon() {

		return super.getIcon();
	}

	@Override
	public void setIcon(Icon icon) {

		m_default = icon;

		super.setIcon(icon);
	}

	// ROLLOVER ICON

	public Icon getRolloverIcon() {

		return m_rollover;
	}

	public void setRolloverIcon(Icon icon) {

		m_rollover = icon;
	}

	// RE-IMPLEMENTED METHODS

	// MOUSE EVENT

	@Override
	public void mouseClicked(MouseEvent event) {
	}

	@Override
	public void mouseEntered(MouseEvent event) {

		super.setIcon(m_rollover);
	}

	@Override
	public void mouseExited(MouseEvent event) {

		super.setIcon(m_default);
	}

	@Override
	public void mousePressed(MouseEvent event) {
	}

	@Override
	public void mouseReleased(MouseEvent event) {
	}
}
