package com.ampersand.lcu.dnd.file;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class FileTransferHandler extends TransferHandler {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = 2925390290174982089L;

	private ArrayList<FileTransferHandlerObserver> m_observers;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public FileTransferHandler() {

		m_observers = new ArrayList<FileTransferHandlerObserver>();
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public boolean canImport(JComponent component, DataFlavor[] data_flavor) {

		for (final DataFlavor element : data_flavor) {

			if (element.equals(DataFlavor.javaFileListFlavor)) {

				return true;
			}
		}

		return false;
	}

	@Override
	public boolean importData(JComponent component, Transferable transferable) {

		if (hasFileFlavor(transferable.getTransferDataFlavors())) {

			try {

				@SuppressWarnings("unchecked")
				final List<File> files = (List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);

				notifyObservers(files);

				return true;
			} catch (final Exception e) {

				e.printStackTrace();
			}

			return false;
		}

		return false;
	}

	// IMPLEMENTED METHODS

	private boolean hasFileFlavor(DataFlavor[] data_flavor) {

		boolean result = false;

		for (final DataFlavor flavor : data_flavor) {

			result = DataFlavor.javaFileListFlavor.equals(flavor);

			if (result) {

				break;
			}
		}

		return result;
	}

	public void addObserver(FileTransferHandlerObserver observer) {

		m_observers.add(observer);
	}

	public void notifyObservers(List<File> files) {

		for (final FileTransferHandlerObserver observer : m_observers) {

			observer.update(files);
		}
	}

	public void removeObservers() {

		m_observers = new ArrayList<FileTransferHandlerObserver>();
	}
}
