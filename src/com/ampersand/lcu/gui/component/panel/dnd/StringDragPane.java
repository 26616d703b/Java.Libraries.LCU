package com.ampersand.lcu.gui.component.panel.dnd;

import javax.swing.JPanel;

import com.ampersand.lcu.dnd.string.StringTransferHandler;
import com.ampersand.lcu.dnd.string.StringTransferHandlerObserver;

public class StringDragPane extends JPanel implements StringTransferHandlerObserver {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -1901554834411560796L;

	private final StringTransferHandler m_string_transfer_handler;
	private String m_dropped_string;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public StringDragPane() {

		m_string_transfer_handler = new StringTransferHandler();
		m_string_transfer_handler.addObserver(this);

		setTransferHandler(m_string_transfer_handler);

		m_dropped_string = null;
	}

	// ACCESSORS and MUTATORS

	public String getDroppedString() {

		return m_dropped_string;
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public void update(String string) {

		m_dropped_string = string;
	}
}
