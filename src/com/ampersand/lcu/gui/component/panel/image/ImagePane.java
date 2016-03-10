package com.ampersand.lcu.gui.component.panel.image;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePane extends JPanel {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -6515586379670312504L;

	private BufferedImage m_background_image;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public ImagePane(String background_image_path) {

		try {

			m_background_image = ImageIO.read(new File(background_image_path));
		} catch (final IOException e) {

			e.printStackTrace();
		}
	}

	public ImagePane(Image background_image) {

		m_background_image = new BufferedImage(background_image.getWidth(null), background_image.getHeight(null),
				BufferedImage.TYPE_INT_ARGB);

		m_background_image.getGraphics().drawImage(background_image, 0, 0, null);
	}

	// ACCESSORS and MUTATORS

	// BACKGROUND IMAGE

	public Image getBackgroundImage() {

		return m_background_image;
	}

	public void setBackgroundImage(String background_image_path) {

		try {

			m_background_image = ImageIO.read(new File(background_image_path));
		} catch (final IOException e) {

			e.printStackTrace();
		}
	}

	public void setBackgroundImage(Image background_image) {

		m_background_image = new BufferedImage(background_image.getWidth(null), background_image.getHeight(null),
				BufferedImage.TYPE_INT_ARGB);

		m_background_image.getGraphics().drawImage(background_image, 0, 0, null);
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		if (m_background_image != null) {

			g.drawImage(m_background_image, getWidth() / 2 - m_background_image.getWidth(null) / 2,
					getHeight() / 2 - m_background_image.getHeight(null) / 2, null);
		}
	}
}
