package com.ampersand.lcu.gui.component.panel.rating;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RatingStarsPane extends JPanel implements MouseListener {

	/*
	 * Attributes
	 */

	public static final int SMALL = 0;
	public static final int MEDIUM = 1;
	public static final int BIG = 2;

	private int m_locked_at;

	// GUI

	private final JLabel[] m_stars;

	private final JLabel m_rate;

	private ImageIcon m_star_icon;
	private ImageIcon m_filled_star_icon;
	private static final long serialVersionUID = -3314290136604294346L;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public RatingStarsPane(int stars, int star_size) {

		setLayout(new GridLayout(1, stars + 1));

		switch (star_size) {

		case 0:

			m_star_icon = new ImageIcon(getClass().getResource("res/icons/rating_stars_pane/empty_star-32.png"));
			m_filled_star_icon = new ImageIcon(
					getClass().getResource("res/icons/rating_stars_pane/filled_star-32.png"));

			break;

		case 1:

			m_star_icon = new ImageIcon(getClass().getResource("res/icons/rating_stars_pane/empty_star-48.png"));
			m_filled_star_icon = new ImageIcon(
					getClass().getResource("res/icons/rating_stars_pane/filled_star-48.png"));

			break;

		case 2:

			m_star_icon = new ImageIcon(getClass().getResource("res/icons/rating_stars_pane/empty_star-64.png"));
			m_filled_star_icon = new ImageIcon(
					getClass().getResource("res/icons/rating_stars_pane/filled_star-64.png"));

			break;

		default:
			break;
		}

		m_stars = new JLabel[stars];

		for (int i = 0; i < stars; i++) {

			m_stars[i] = new JLabel(m_star_icon);
			m_stars[i].addMouseListener(this);

			add(m_stars[i]);
		}

		m_rate = new JLabel("0 / " + m_stars.length, SwingConstants.CENTER);
		m_rate.setFont(new Font("Century Gothic", Font.PLAIN, 18));

		add(m_rate);
	}

	// RE-IMPLEMENTED METHODS

	// MOUSE EVENT

	@Override
	public void mouseClicked(MouseEvent event) {

		final JLabel selected_label = (JLabel) event.getSource();

		for (int i = 0; i < m_stars.length; i++) {

			if (m_stars[i] == selected_label) {

				for (int j = 0; j <= i; j++) {

					m_stars[j].setIcon(m_filled_star_icon);
				}

				for (int k = i + 1; k < m_stars.length; k++) {

					m_stars[k].setIcon(m_star_icon);
				}

				m_locked_at = i;
			}
		}

		m_rate.setText(m_locked_at + 1 + " / " + m_stars.length);
	}

	@Override
	public void mouseEntered(MouseEvent event) {

		final JLabel selected_label = (JLabel) event.getSource();

		for (int i = 0; i < m_stars.length; i++) {

			if (m_stars[i] == selected_label) {

				for (int j = 0; j <= i; j++) {

					m_stars[j].setIcon(m_filled_star_icon);
				}

				for (int k = i + 1; k < m_stars.length; k++) {

					if (k > m_locked_at) {

						m_stars[k].setIcon(m_star_icon);
					}
				}
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent event) {

		for (int i = m_locked_at + 1; i < m_stars.length; i++) {

			m_stars[i].setIcon(m_star_icon);
		}
	}

	@Override
	public void mousePressed(MouseEvent event) {
	}

	@Override
	public void mouseReleased(MouseEvent event) {
	}

	// IMPLEMENTED METHODS

	public String getQuotient() {

		return m_rate.getText();
	}

	public float getRate() {

		return (float) (m_locked_at + 1) / m_stars.length;
	}
}
