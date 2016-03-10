package com.ampersand.lcu.gui.component.panel.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

import com.ampersand.lcu.gui.component.button.HighlightButton;

public class DirectedMenuPane extends JPanel implements ActionListener {

	/*
	 * Attributes
	 */

	private int m_current_index;
	private final ArrayList<JComponent> m_components;

	// GUI

	private JPanel m_move;

	private HighlightButton m_next;
	private HighlightButton m_previous;
	private static final long serialVersionUID = 8197010427456309280L;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public DirectedMenuPane() {

		setLayout(new BorderLayout());

		m_current_index = -1;
		m_components = new ArrayList<JComponent>();
	}

	// ACCESSORS and MUTATORS

	public void addItem(JComponent component) {

		m_components.add(component);

		if (m_components.size() == 1) {

			m_current_index = 0;

			add(component, BorderLayout.CENTER);
		} else if (m_components.size() == 2) {

			m_next = new HighlightButton(
					new ImageIcon(getClass().getResource("res/icons/directed_menu_pane/right.png")), Color.WHITE,
					Color.ORANGE);

			m_next.addActionListener(this);
			m_next.setEnabled(true);

			m_previous = new HighlightButton(
					new ImageIcon(getClass().getResource("res/icons/directed_menu_pane/left.png")), Color.WHITE,
					Color.ORANGE);

			m_previous.addActionListener(this);
			m_previous.setEnabled(false);

			m_move = new JPanel(new GridLayout(2, 1));

			m_move.add(m_next);
			m_move.add(m_previous);

			add(m_move, BorderLayout.EAST);
		}
	}

	public void removeComponent(int index) {

		m_components.remove(index);
	}

	// RE-MPLEMENTED METHODS

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource().equals(m_next)) {

			if (!m_previous.isEnabled()) {

				m_previous.setEnabled(true);
			}

			remove(m_components.get(m_current_index));

			m_current_index++;

			if (m_current_index == m_components.size() - 1) {

				m_next.setEnabled(false);
			}

			add(m_components.get(m_current_index), BorderLayout.CENTER);

			updateUI();
		} else if (event.getSource().equals(m_previous)) {

			if (!m_next.isEnabled()) {

				m_next.setEnabled(true);
			}

			remove(m_components.get(m_current_index));

			m_current_index--;

			if (m_current_index == 0) {

				m_previous.setEnabled(false);
			}

			add(m_components.get(m_current_index), BorderLayout.CENTER);

			updateUI();
		}
	}
}
