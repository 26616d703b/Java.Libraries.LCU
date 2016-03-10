package com.ampersand.lcu.dnd.string;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class StringTransferHandler extends TransferHandler {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = 3175046355046149455L;

	private ArrayList<StringTransferHandlerObserver> m_observers;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public StringTransferHandler() {

		m_observers = new ArrayList<StringTransferHandlerObserver>();
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public boolean canImport(JComponent component, DataFlavor[] data_flavor) {

		for (final DataFlavor element : data_flavor) {

			if (element.equals(DataFlavor.stringFlavor)) {

				return true;
			}
		}

		return false;
	}

	@Override
	public boolean importData(JComponent component, Transferable transferable) {

		if (hasStringFlavor(transferable.getTransferDataFlavors())) {

			try {

				final String data = (String) transferable.getTransferData(DataFlavor.stringFlavor);

				notifyObservers(data);
			} catch (final Exception e) {

				e.printStackTrace();
			}
		}

		return false;
	}

	// IMPLEMENTED METHODS

	private boolean hasStringFlavor(DataFlavor[] data_flavor) {

		boolean result = false;

		for (final DataFlavor flavor : data_flavor) {

			result = DataFlavor.stringFlavor.equals(flavor);

			if (result) {

				break;
			}
		}

		return result;
	}

	public void addObserver(StringTransferHandlerObserver observer) {

		m_observers.add(observer);
	}

	public void notifyObservers(String string) {

		for (final StringTransferHandlerObserver observer : m_observers) {

			observer.update(string);
		}
	}

	public void removeObservers() {

		m_observers = new ArrayList<StringTransferHandlerObserver>();
	}
}
