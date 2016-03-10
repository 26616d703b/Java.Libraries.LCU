package com.ampersand.lcu.gui.component.list;

import java.awt.Component;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class LabelsList extends JList<JLabel> implements Serializable {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -6118246987682726628L;

	private transient Hashtable<Object, ImageIcon> icon_table;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public LabelsList(Vector<JLabel> labels) {

		setModel(new LabeledListModel(labels));
		setCellRenderer(new LabeledListRenderer());
	}

	/*
	 * Attributes
	 */

	class LabeledListModel implements ListModel<JLabel>, Serializable {

		/**
		 *
		 */
		private static final long serialVersionUID = -4359240157551222822L;

		/*
		 * Methods
		 */

		// CONSTRUCTOR

		public LabeledListModel(Vector<JLabel> labels) {

			m_collection = labels;
		}

		// ACCESSORS and MUTATORS

		@Override
		public JLabel getElementAt(int index) {

			return m_collection.get(index);
		}

		@Override
		public int getSize() {

			return m_collection.size();
		}

		// RE-IMPLEMENTED METHODS

		@Override
		public void addListDataListener(ListDataListener list_data_listener) {
		}

		@Override
		public void removeListDataListener(ListDataListener list_data_listener) {
		}

		/*
		 * Attributes
		 */

		private final Vector<JLabel> m_collection;
	}

	class LabeledListRenderer extends DefaultListCellRenderer implements Serializable {

		/**
		 *
		 */
		private static final long serialVersionUID = -2036278181383658475L;

		/*
		 * Methods
		 */

		// CONSTRUCTOR

		public LabeledListRenderer() {

			icon_table = new Hashtable<Object, ImageIcon>();
		}

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {

			final JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected,
					cellHasFocus);

			if (value instanceof JLabel) {

				final ImageIcon icon = (ImageIcon) ((JLabel) value).getIcon();

				if (icon != null) {

					icon_table.put(value, icon);
				}

				label.setBorder(((JLabel) value).getBorder());
				label.setHorizontalAlignment(((JLabel) value).getHorizontalAlignment());
				label.setIcon(icon);
				label.setText(((JLabel) value).getText());
				label.setVerticalAlignment(((JLabel) value).getVerticalAlignment());
			}

			return label;
		}
	}
}
