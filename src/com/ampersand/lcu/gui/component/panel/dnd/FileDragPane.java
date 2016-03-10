package com.ampersand.lcu.gui.component.panel.dnd;

import java.io.File;
import java.util.List;

import javax.swing.JPanel;

import com.ampersand.lcu.dnd.file.FileTransferHandler;
import com.ampersand.lcu.dnd.file.FileTransferHandlerObserver;

public class FileDragPane extends JPanel implements FileTransferHandlerObserver {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -1901554834411560796L;

	private final FileTransferHandler m_file_transfer_handler;
	private List<File> m_dropped_files;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public FileDragPane() {

		m_file_transfer_handler = new FileTransferHandler();
		m_file_transfer_handler.addObserver(this);

		setTransferHandler(m_file_transfer_handler);

		m_dropped_files = null;
	}

	// ACCESSORS and MUTATORS

	public List<File> getDroppedFiles() {

		return m_dropped_files;
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public void update(List<File> files) {

		m_dropped_files = files;
	}
}
