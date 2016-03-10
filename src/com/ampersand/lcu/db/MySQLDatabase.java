package com.ampersand.lcu.db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDatabase extends ADatabase {

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public MySQLDatabase(String path) {

		super(path);

		m_username = "root";
	}

	public MySQLDatabase(String path, String username, String password) {

		super(path, username, password);
	}

	// ACCESSORS and MUTATORS

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	@Override
	public boolean connect() {

		if (m_connected) {

			System.err.println("<!> Connection already exists.");
		} else {

			try {

				Class.forName("com.mysql.jdbc.Driver");

				final String driver_path = "jdbc:mysql://" + m_path;

				m_connection = DriverManager.getConnection(driver_path, m_username, m_password);

				m_connected = true;

				System.out.println("<?> Opening database connection.");
			} catch (final ClassNotFoundException e) {

				System.err.println("<!> Cannot find the database driver classes.");
				System.err.println(e);
			} catch (final SQLException e) {

				System.err.println("<!> Cannot connect to this database.");
				System.err.println(e);
			}
		}

		return m_connected;
	}
}