package com.ampersand.lcu.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public abstract class ADatabase {

	/*
	 * Attributes
	 */

	protected boolean m_connected;

	protected String m_path;
	protected String m_username;
	protected String m_password;

	protected Connection m_connection;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public ADatabase(String path) {

		m_path = path;
		m_username = new String();
		m_password = new String();
	}

	public ADatabase(String path, String username, String password) {

		m_path = path;
		m_username = username;
		m_password = password;
	}

	// ACCESSORS and MUTATORS

	// CONNECTED

	public boolean isConnected() {

		return m_connected;
	}

	// PATH

	public String getPath() {

		return m_path;
	}

	public void setPath(String path) {

		m_path = path;
	}

	// USERNAME

	public String getUsername() {

		return m_username;
	}

	public void setUsername(String username) {

		m_username = username;
	}

	// PASSWORD

	public String getPassword() {

		return m_password;
	}

	public void setPassword(String password) {

		m_password = password;
	}

	// CONNECTION

	public Connection getConnection() {

		return m_connection;
	}

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	public abstract boolean connect();

	public boolean contains(String table_name) {

		ResultSet result_set = null;

		if (!m_connected) {

			System.err.println("<!> No existing connection.");
		} else {

			result_set = executeSelection("SELECT * FROM " + table_name);
		}

		return result_set != null;
	}

	// ----------------------------------------------------[ D
	// ]----------------------------------------------------//

	public boolean disconnect() {

		if (!m_connected) {

			System.err.println("<!> No existing connection.");
		} else {

			try {

				m_connection.close();

				System.out.println("<?> Closing database connection.");

				m_connected = false;
			} catch (final SQLException e) {

				System.err.println("<!> Unable to disconnect from the database.");
			}
		}

		return !m_connected;
	}

	// ----------------------------------------------------[ E
	// ]----------------------------------------------------//

	@SuppressWarnings("unused")
	public ResultSet executeSelection(String query) {

		ResultSet result_set = null;

		if (!m_connected) {

			System.err.println("<!> No existing connection. You need to log in.");
		} else {

			Statement statement = null;

			try {

				statement = m_connection.createStatement();

				result_set = statement.executeQuery(query);
			} catch (final SQLException e) {

				try {

					if (result_set != null) {

						result_set.close();
					}

					statement.close();
				} catch (final SQLException ex) {

					System.err.println(ex);
				}
			}
		}

		return result_set;
	}

	public void executeUpdate(String query) {

		if (!m_connected) {

			System.err.println("<!> No existing connection. You need to log in.");
		} else {

			Statement statement = null;

			try {

				statement = m_connection.createStatement();
				statement.executeUpdate(query);
			} catch (final SQLException e) {

				try {

					statement.close();
				} catch (final SQLException ex) {

					System.err.println(ex);
				}
			}
		}
	}

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	public String getName() {

		String name = null;

		if (!m_connected) {

			System.err.println("<!> No existing connection.");
		} else {

			try {

				name = m_connection.getCatalog();
			} catch (final SQLException e) {

				System.err.println(e);
			}
		}

		return name;
	}

	public Vector<String> getPrimaryKeyColumnNames(String table_name) {

		final Vector<String> column_names = new Vector<String>();

		try {

			final ResultSet result_set = m_connection.getMetaData().getPrimaryKeys(m_connection.getCatalog(),
					m_connection.getSchema(), table_name);

			while (result_set.next()) {

				column_names.add(result_set.getString("COLUMN_NAME"));
			}
		} catch (final SQLException e) {

			System.err.println(e);
		}

		return column_names;
	}

	public String getSchema() {

		String name = null;

		if (!m_connected) {

			System.err.println("<!> No existing connection.");
		} else {

			try {

				name = m_connection.getSchema();
			} catch (final SQLException e) {

				System.err.println(e);
			}
		}

		return name;
	}

	public Vector<String> getTableNames() {

		Vector<String> table_names = null;

		if (!m_connected) {

			System.err.println("<!> No existing connection.");
		} else {

			final ResultSet result_set = executeSelection("SHOW TABLES");

			table_names = new Vector<String>();

			try {

				while (result_set.next()) {

					table_names.addElement(result_set.getString("Tables_in_" + m_connection.getCatalog()));
				}
			} catch (final SQLException e) {

				System.err.println(e);
			}
		}

		return table_names;
	}
}