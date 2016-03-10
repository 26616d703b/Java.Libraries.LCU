package com.ampersand.lcu.gui.font;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public final class FontManager {

	/*
	 * Attributes
	 */

	public static final Font CALIBRI_16 = new Font("Calibri", Font.PLAIN, 16);
	public static final Font CALIBRI_18 = new Font("Calibri", Font.PLAIN, 18);
	public static final Font CALIBRI_20 = new Font("Calibri", Font.PLAIN, 20);
	public static final Font CALIBRI_30 = new Font("Calibri", Font.PLAIN, 30);
	public static final Font CALIBRI_50 = new Font("Calibri", Font.PLAIN, 50);
	public static final Font CALIBRI_BOLD_16 = new Font("Calibri", Font.BOLD, 16);
	public static final Font CALIBRI_BOLD_18 = new Font("Calibri", Font.BOLD, 18);
	public static final Font CALIBRI_BOLD_20 = new Font("Calibri", Font.BOLD, 20);
	public static final Font CALIBRI_BOLD_30 = new Font("Calibri", Font.BOLD, 30);
	public static final Font CALIBRI_BOLD_50 = new Font("Calibri", Font.BOLD, 50);
	public static final Font CALIBRI_ITALIC_16 = new Font("Calibri", Font.ITALIC, 16);
	public static final Font CALIBRI_ITALIC_18 = new Font("Calibri", Font.ITALIC, 18);
	public static final Font CALIBRI_ITALIC_20 = new Font("Calibri", Font.ITALIC, 20);
	public static final Font CALIBRI_ITALIC_30 = new Font("Calibri", Font.ITALIC, 30);
	public static final Font CALIBRI_ITALIC_50 = new Font("Calibri", Font.ITALIC, 50);

	public static final Font CENTURY_GOTHIC_16 = new Font("Century Gothic", Font.PLAIN, 16);
	public static final Font CENTURY_GOTHIC_18 = new Font("Century Gothic", Font.PLAIN, 18);
	public static final Font CENTURY_GOTHIC_20 = new Font("Century Gothic", Font.PLAIN, 20);
	public static final Font CENTURY_GOTHIC_30 = new Font("Century Gothic", Font.PLAIN, 30);
	public static final Font CENTURY_GOTHIC_50 = new Font("Century Gothic", Font.PLAIN, 50);
	public static final Font CENTURY_GOTHIC_BOLD_16 = new Font("Century Gothic", Font.BOLD, 16);
	public static final Font CENTURY_GOTHIC_BOLD_18 = new Font("Century Gothic", Font.BOLD, 18);
	public static final Font CENTURY_GOTHIC_BOLD_20 = new Font("Century Gothic", Font.BOLD, 20);
	public static final Font CENTURY_GOTHIC_BOLD_30 = new Font("Century Gothic", Font.BOLD, 30);
	public static final Font CENTURY_GOTHIC_BOLD_50 = new Font("Century Gothic", Font.BOLD, 50);
	public static final Font CENTURY_GOTHIC_ITALIC_16 = new Font("Century Gothic", Font.ITALIC, 16);
	public static final Font CENTURY_GOTHIC_ITALIC_18 = new Font("Century Gothic", Font.ITALIC, 18);
	public static final Font CENTURY_GOTHIC_ITALIC_20 = new Font("Century Gothic", Font.ITALIC, 20);
	public static final Font CENTURY_GOTHIC_ITALIC_30 = new Font("Century Gothic", Font.ITALIC, 30);
	public static final Font CENTURY_GOTHIC_ITALIC_50 = new Font("Century Gothic", Font.ITALIC, 50);

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	public static Font createTrueType(String file_path) {

		Font true_type_font = null;

		try {

			true_type_font = Font.createFont(Font.TRUETYPE_FONT, new File(file_path));
		} catch (final FontFormatException e) {

			System.err.println(e);
		} catch (final IOException e) {

			System.err.println(e);
		}

		return true_type_font;
	}

	public static Font createTrueType(File file) {

		Font true_type_font = null;

		try {

			true_type_font = Font.createFont(Font.TRUETYPE_FONT, file);
		} catch (final FontFormatException e) {

			System.err.println(e);
		} catch (final IOException e) {

			System.err.println(e);
		}

		return true_type_font;
	}

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	public static String[] getAvailableFontFamilyNames() {

		return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	}
}
