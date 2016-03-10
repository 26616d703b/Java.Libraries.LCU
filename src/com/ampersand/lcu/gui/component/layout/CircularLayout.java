package com.ampersand.lcu.gui.component.layout;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

public class CircularLayout implements LayoutManager {

	/*
	 * Attributes
	 */

	private final boolean m_is_circle;

	/*
	 * Methods
	 */

	// CONSTRUCTORS

	public CircularLayout() {

		this(true);
	}

	public CircularLayout(boolean is_circle) {

		m_is_circle = is_circle;
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public void addLayoutComponent(String name, Component component) {
	}

	@Override
	public void layoutContainer(Container parent) {

		int x, y, w, h, s, c;
		final int n = parent.getComponentCount();
		final double parent_width = parent.getSize().width;
		final double parent_height = parent.getSize().height;
		final Insets insets = parent.getInsets();
		final int center_x = (int) (parent_width - (insets.left + insets.right)) / 2;
		final int center_y = (int) (parent_height - (insets.top + insets.bottom)) / 2;

		Component component = null;
		Dimension component_preferred_size = null;

		if (n == 1) {

			component = parent.getComponent(0);
			x = center_x - component.getWidth() / 2;
			y = center_y - component.getHeight() / 2;
			component_preferred_size = component.getPreferredSize();

			w = component_preferred_size.width;
			h = component_preferred_size.height;

			component.setBounds(x, y, w, h);
		} else {

			double r = Math.min(parent_width - (insets.left + insets.right),
					parent_height - (insets.top + insets.bottom)) / 2;

			r *= 0.75; // Multiply by .75 to account for extreme right and
						// bottom
						// Components
			for (int i = 0; i < n; i++) {

				component = parent.getComponent(i);
				component_preferred_size = component.getPreferredSize();

				if (m_is_circle) {

					c = (int) (r * Math.cos(2 * i * Math.PI / n));
					s = (int) (r * Math.sin(2 * i * Math.PI / n));
				} else {

					c = (int) (center_x * 0.75 * Math.cos(2 * i * Math.PI / n));
					s = (int) (center_y * 0.75 * Math.sin(2 * i * Math.PI / n));
				}

				x = c + center_x - component.getHeight() / 2;
				y = s + center_y - component.getHeight() / 2;

				w = component_preferred_size.width;
				h = component_preferred_size.height;

				component.setBounds(x, y, w, h);
			}
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {

		return parent.getSize();
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {

		return parent.getSize();
	}

	@Override
	public void removeLayoutComponent(Component component) {
	}
}
