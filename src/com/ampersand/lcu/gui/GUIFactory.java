package com.ampersand.lcu.gui;

import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public final class GUIFactory {

	/*
	 * Attributes
	 */

	public static final int DIALOG_PREFERRED_WIDTH = 600;
	public static final int DIALOG_PREFERRED_HEIGHT = 400;

	public static final int FRAME_PREFERRED_WIDTH = 1024;
	public static final int FRAME_PREFERRED_HEIGHT = 680;

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	public static JDialog createDialog() {

		final JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setModal(true);
		dialog.setSize(DIALOG_PREFERRED_WIDTH, DIALOG_PREFERRED_HEIGHT);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(Frame parent) {

		final JDialog dialog = new JDialog(parent);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setModal(true);
		dialog.setSize(DIALOG_PREFERRED_WIDTH, DIALOG_PREFERRED_HEIGHT);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(int width, int height) {

		final JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setModal(true);
		dialog.setSize(width, height);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(Frame parent, int width, int height) {

		final JDialog dialog = new JDialog(parent);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setModal(true);
		dialog.setSize(width, height);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(String title, int width, int height) {

		final JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setModal(true);
		dialog.setSize(width, height);
		dialog.setTitle(title);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(Frame parent, String title, int width, int height) {

		final JDialog dialog = new JDialog(parent, title);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setModal(true);
		dialog.setSize(width, height);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(String title, int width, int height, ImageIcon icon) {

		final JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setIconImage(icon.getImage());
		dialog.setModal(true);
		dialog.setSize(width, height);
		dialog.setTitle(title);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(Frame parent, String title, int width, int height, ImageIcon icon) {

		final JDialog dialog = new JDialog(parent, title);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setIconImage(icon.getImage());
		dialog.setModal(true);
		dialog.setSize(width, height);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(String title, int width, int height, boolean modal) {

		final JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setModal(modal);
		dialog.setSize(width, height);
		dialog.setTitle(title);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(Frame parent, String title, int width, int height, boolean modal) {

		final JDialog dialog = new JDialog(parent, title, modal);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setSize(width, height);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(String title, int width, int height, ImageIcon icon, boolean modal) {

		final JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setIconImage(icon.getImage());
		dialog.setModal(modal);
		dialog.setSize(width, height);
		dialog.setTitle(title);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	public static JDialog createDialog(Frame parent, String title, int width, int height, ImageIcon icon,
			boolean modal) {

		final JDialog dialog = new JDialog(parent, title, modal);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setIconImage(icon.getImage());
		dialog.setSize(width, height);
		dialog.setLocationRelativeTo(null);

		return dialog;
	}

	// Frame

	public static JFrame createFrame() {

		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(FRAME_PREFERRED_WIDTH, FRAME_PREFERRED_HEIGHT);
		frame.setLocationRelativeTo(null);

		return frame;
	}

	public static JFrame createFrame(int width, int height) {

		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);

		return frame;
	}

	public static JFrame createFrame(String title, int width, int height) {

		final JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);

		return frame;
	}

	public static JFrame createFrame(String title, int width, int height, ImageIcon icon) {

		final JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(icon.getImage());
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);

		return frame;
	}
}
