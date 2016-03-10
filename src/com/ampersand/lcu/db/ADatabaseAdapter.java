package com.ampersand.lcu.db;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public abstract class ADatabaseAdapter extends AbstractTableModel {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -3443629393315569662L;

	protected ADatabase m_database;
	protected ResultSetMetaData m_meta_data;

	protected boolean m_cell_editable;

	protected String[] m_headers;
	protected Vector<Object> m_data;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	// ACCESSORS and MUTATORS

	// DATABASE

	public abstract ADatabase getDatabase();

	// CELL_EDITABLE

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {

		return m_cell_editable;
	}

	public void setCellEditable(boolean editable) {

		m_cell_editable = editable;
	}

	// RE-IMPLEMENTED METHODS

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	@Override
	public int getColumnCount() {

		// return m_headers == null ? 0 : m_headers.length;
		return m_headers.length;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {

		int column_type = 0;

		try {

			column_type = m_meta_data.getColumnType(columnIndex + 1);
		} catch (final SQLException e) {

			System.err.println(e);
		}

		switch (column_type) {

		case Types.CHAR:
		case Types.VARCHAR:
		case Types.LONGVARCHAR:
			return String.class;

		case Types.BIT:
		case Types.BOOLEAN:
			return Boolean.class;

		case Types.TINYINT:
		case Types.SMALLINT:
		case Types.INTEGER:
			return Integer.class;

		case Types.BIGINT:
			return Long.class;

		case Types.DECIMAL:
		case Types.DOUBLE:
		case Types.FLOAT:
		case Types.NUMERIC:
		case Types.REAL:
			return Double.class;

		case Types.DATE:
			return Date.class;

		case Types.TIME:
			return Time.class;

		case Types.TIMESTAMP:
			return Timestamp.class;

		default:
			return Object.class;
		}
	}

	@Override
	public String getColumnName(int column) {

		// return m_headers == null || m_headers[column] == null ? "NULL" :
		// m_headers[column];
		return m_headers[column];
	}

	@Override
	public int getRowCount() {

		// return m_data == null ? 0 : m_data.size();
		return m_data.size();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return ((Vector<Object>) m_data.elementAt(rowIndex)).elementAt(columnIndex);
	}

	// ----------------------------------------------------[ S
	// ]----------------------------------------------------//

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

		try {

			final String table_name = m_meta_data.getTableName(columnIndex + 1);

			if (table_name == null) {

				System.out.println("<?> Table name returned null.");
			}

			final String column_name = getColumnName(columnIndex);
			String query = "UPDATE " + table_name + " SET " + column_name + " = "
					+ representationOf(columnIndex, aValue) + " WHERE ";

			for (int j = 0; j < getColumnCount(); j++) {

				final String current_column_name = getColumnName(j);

				if (current_column_name.equals("")) {

					continue;
				}

				if (j != 0) {

					query = query + " AND ";
				}

				query += current_column_name + " = " + representationOf(j, getValueAt(rowIndex, j));
			}

			m_database.executeUpdate(query);
		} catch (final SQLException e) {

			System.err.println("<!> Update failed!");
		}

		@SuppressWarnings("unchecked")
		final Vector<Object> dataRow = (Vector<Object>) m_data.elementAt(rowIndex);
		dataRow.setElementAt(aValue, columnIndex);
	}

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ E
	// ]----------------------------------------------------//

	public void executeQuery(String query) {

		if (!m_database.isConnected()) {

			System.err.println("<!> No existing database connection.");
		} else {

			final ResultSet result_set = m_database.executeSelection(query);

			try {

				m_meta_data = result_set.getMetaData();

				final int columns = m_meta_data.getColumnCount();

				m_headers = new String[columns];

				for (int i = 0; i < columns; i++) {

					m_headers[i] = m_meta_data.getColumnName(i + 1);
				}

				m_data = new Vector<Object>();

				while (result_set.next()) {

					final Vector<Object> current_row_data = new Vector<Object>();

					for (int i = 1; i <= getColumnCount(); i++) {

						current_row_data.addElement(result_set.getObject(i));
					}

					m_data.addElement(current_row_data);
				}
			} catch (final SQLException e) {

				System.err.println(e);
			}

			fireTableChanged(null);
		}
	}

	// ----------------------------------------------------[ R
	// ]----------------------------------------------------//

	public String representationOf(int column, Object value) {

		int type;

		if (value == null) {

			return "NULL";
		}

		try {

			type = m_meta_data.getColumnType(column + 1);
		} catch (final SQLException e) {

			return value.toString();
		}

		switch (type) {

		case Types.BOOLEAN:
		case Types.BIT:
			return ((Boolean) value).booleanValue() ? "1" : "0";

		case Types.DECIMAL:
		case Types.INTEGER:
		case Types.DOUBLE:
		case Types.FLOAT:
		case Types.NUMERIC:
		case Types.REAL:
			return value.toString();

		case Types.DATE:
		case Types.TIME:
			return value.toString();

		default:
			return "\'" + value.toString() + "\'";
		}
	}
}
