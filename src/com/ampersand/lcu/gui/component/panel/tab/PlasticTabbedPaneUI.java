package com.ampersand.lcu.gui.component.panel.tab;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class PlasticTabbedPaneUI extends BasicTabbedPaneUI {

	/*
	 * Attributes
	 */

	private Color m_select_color;
	private Color m_start_color;
	private Color m_end_color;

	private final int m_incl_tab = 12;
	private final int m_ancho_foco_h = 4;
	private final int m_anchi_carpetas = 18;

	private Polygon m_shape;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public PlasticTabbedPaneUI() {

		m_start_color = Color.ORANGE;
		m_end_color = Color.ORANGE.brighter();
	}

	public PlasticTabbedPaneUI(Color color) {

		m_start_color = color;
		m_end_color = color;
	}

	public PlasticTabbedPaneUI(Color start_color, Color end_color) {

		m_start_color = start_color;
		m_end_color = end_color;
	}

	// ACCESSORS and MUTATORS

	// START COLOR

	public Color getStartColor() {

		return m_start_color;
	}

	public void setStartColor(Color color) {

		m_start_color = color;
	}

	// END COLOR

	public Color getEndColor() {

		return m_end_color;
	}

	public void setEndColor(Color color) {

		m_end_color = color;
	}

	// SELECT COLOR

	public Color getSelectColor() {

		return m_select_color;
	}

	public void setSelectColor(Color select_color) {

		m_select_color = select_color;
	}

	// RE-IMPLEMENTED METHODS

	public static ComponentUI createUI(JComponent c) {

		return new PlasticTabbedPaneUI();
	}

	@Override
	protected void installDefaults() {

		super.installDefaults();

		m_select_color = Color.WHITE;
		tabAreaInsets.right = m_anchi_carpetas;
	}

	@Override
	protected void layoutLabel(int tabPlacement, FontMetrics metrics, int tabIndex, String title, Icon icon,
			Rectangle tabRect, Rectangle iconRect, Rectangle textRect, boolean isSelected) {

		final Rectangle tabRectPeq = new Rectangle(tabRect);
		tabRectPeq.width -= m_incl_tab;

		super.layoutLabel(tabPlacement, metrics, tabIndex, title, icon, tabRectPeq, iconRect, textRect, isSelected);
	}

	@Override
	protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {

		if (runCount > 1) {

			final int lines[] = new int[runCount];

			for (int i = 0; i < runCount; i++) {

				lines[i] = rects[tabRuns[i]].y + (tabPlacement == TOP ? maxTabHeight : 0);
			}

			Arrays.sort(lines);

			if (tabPlacement == TOP) {

				int fila = runCount;

				for (int i = 0; i < lines.length - 1; i++, fila--) {

					final Polygon carp = new Polygon();
					carp.addPoint(0, lines[i]);
					carp.addPoint(tabPane.getWidth() - 2 * fila - 2, lines[i]);
					carp.addPoint(tabPane.getWidth() - 2 * fila, lines[i] + 3);

					if (i < lines.length - 2) {

						carp.addPoint(tabPane.getWidth() - 2 * fila, lines[i + 1]);
						carp.addPoint(0, lines[i + 1]);
					} else {

						carp.addPoint(tabPane.getWidth() - 2 * fila, lines[i] + rects[selectedIndex].height);
						carp.addPoint(0, lines[i] + rects[selectedIndex].height);
					}

					carp.addPoint(0, lines[i]);

					g.setColor(hazAlfa(fila));
					g.fillPolygon(carp);

					g.setColor(darkShadow.darker());
					g.drawPolygon(carp);
				}
			} else {

				int fila = 0;

				for (int i = 0; i < lines.length - 1; i++, fila++) {

					final Polygon carp = new Polygon();
					carp.addPoint(0, lines[i]);
					carp.addPoint(tabPane.getWidth() - 2 * fila - 1, lines[i]);

					carp.addPoint(tabPane.getWidth() - 2 * fila - 1, lines[i + 1] - 3);
					carp.addPoint(tabPane.getWidth() - 2 * fila - 3, lines[i + 1]);
					carp.addPoint(0, lines[i + 1]);

					carp.addPoint(0, lines[i]);

					g.setColor(hazAlfa(fila + 2));
					g.fillPolygon(carp);

					g.setColor(darkShadow.darker());
					g.drawPolygon(carp);
				}
			}
		}

		super.paintTabArea(g, tabPlacement, selectedIndex);
	}

	@Override
	protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h,
			boolean isSelected) {

		final Graphics2D g2D = (Graphics2D) g;
		GradientPaint gradientShadow;

		int xp[] = null;
		int yp[] = null;

		switch (tabPlacement) {

		case LEFT:

			xp = new int[] { x, x, x + w, x + w, x };
			yp = new int[] { y, y + h - 3, y + h - 3, y, y };
			gradientShadow = new GradientPaint(x, y, m_start_color, x, y + h, m_end_color);

			break;

		case RIGHT:

			xp = new int[] { x, x, x + w - 2, x + w - 2, x };
			yp = new int[] { y, y + h - 3, y + h - 3, y, y };
			gradientShadow = new GradientPaint(x, y, m_start_color, x, y + h, m_end_color);

			break;

		case BOTTOM:

			xp = new int[] { x, x, x + 3, x + w - m_incl_tab - 6, x + w - m_incl_tab - 2, x + w - m_incl_tab, x + w - 3,
					x };
			yp = new int[] { y, y + h - 3, y + h, y + h, y + h - 1, y + h - 3, y, y };
			gradientShadow = new GradientPaint(x, y, m_start_color, x, y + h, m_end_color);

			break;

		case TOP:

		default:

			xp = new int[] { x, x, x + 3, x + w - m_incl_tab - 6, x + w - m_incl_tab - 2, x + w - m_incl_tab, x + w,
					x };
			yp = new int[] { y + h, y + 3, y, y, y + 1, y + 3, y + h, y + h };
			gradientShadow = new GradientPaint(0, 0, m_start_color, 0, y + h / 4, m_end_color);

			break;
		}
		;

		m_shape = new Polygon(xp, yp, xp.length);

		if (isSelected) {

			g2D.setColor(m_select_color);
			g2D.setPaint(gradientShadow);
		} else {

			g2D.setColor(m_select_color);
		}

		g2D.fill(m_shape);

		if (runCount > 1) {

			g2D.setColor(hazAlfa(getRunForTab(tabPane.getTabCount(), tabIndex) - 1));
			g2D.fill(m_shape);
		}

		g2D.fill(m_shape);
	}

	@Override
	protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {

		return 8 + m_incl_tab + super.calculateTabWidth(tabPlacement, tabIndex, metrics);
	}

	@Override
	protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {

		if (tabPlacement == LEFT || tabPlacement == RIGHT) {

			return super.calculateTabHeight(tabPlacement, tabIndex, fontHeight);
		} else {

			return m_ancho_foco_h + super.calculateTabHeight(tabPlacement, tabIndex, fontHeight);
		}
	}

	@Override
	protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h,
			boolean isSelected) {
	}

	@Override
	protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex,
			Rectangle iconRect, Rectangle textRect, boolean isSelected) {

		if (tabPane.hasFocus() && isSelected) {

			g.setColor(UIManager.getColor("ScrollBar.thumbShadow"));
			g.drawPolygon(m_shape);
		}
	}

	protected Color hazAlfa(int fila) {

		int alfa = 0;

		if (fila >= 0) {

			alfa = 50 + (fila > 7 ? 70 : 10 * fila);
		}

		return new Color(0, 0, 0, alfa);
	}
}