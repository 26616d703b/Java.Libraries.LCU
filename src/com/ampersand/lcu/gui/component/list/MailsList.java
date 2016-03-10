package com.ampersand.lcu.gui.component.list;

import java.awt.Component;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class MailsList extends JList<String> implements Serializable {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = 8039079374262422233L;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public MailsList(Vector<String> addresses) {

		setModel(new EMailsListModel(addresses));
		setCellRenderer(new EMailsListRenderer());
	}

	/*
	 * Attributes
	 */

	class EMailsListModel implements ListModel<String>, Serializable {

		/**
		 *
		 */
		private static final long serialVersionUID = -1554835590073442567L;

		/*
		 * Methods
		 */

		// CONSTRUCTOR

		public EMailsListModel(Vector<String> addresses) {

			m_collection = addresses;
		}

		// ACCESSORS and MUTATORS

		@Override
		public String getElementAt(int index) {

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

		private final Vector<String> m_collection;
	}

	class EMailsListRenderer extends DefaultListCellRenderer implements Serializable {

		/**
		 *
		 */
		private static final long serialVersionUID = -2036278181383658475L;

		/*
		 * Methods
		 */

		// CONSTRUCTOR

		// RE-IMPLEMENTED METHODS

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {

			final JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected,
					cellHasFocus);

			if (value instanceof String) {

				final String address = ((String) value).toLowerCase();

				// GMAIL

				if (address.contains("@gmail")) {

					label.setIcon(new ImageIcon(getClass().getResource("res/icons/emails_list/gmail-32.png")));
				}

				// LIVE

				else if (address.contains("@hotmail") || address.contains("@live")
						|| address.contains("@windowslive")) {

					label.setIcon(new ImageIcon(getClass().getResource("res/icons/emails_list/msmail-32.png")));
				}

				// YAHOO

				else if (address.contains("@rocketmail") || address.contains("@yahoo") || address.contains("@ymail")) {

					label.setIcon(new ImageIcon(getClass().getResource("res/icons/emails_list/ymail-32.png")));
				}

				label.setText(" " + address);
			}

			return label;
		}
	}
}
