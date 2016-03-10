package com.ampersand.lcu.db;

import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDatabase extends ADatabase {

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public SQLiteDatabase(String path) {

		super(path);
	}

	public SQLiteDatabase(String path, String username, String password) {

		super(path, username, password);
	}

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	@Override
	public boolean connect() {

		if (m_connected) {

			System.err.println("<!> Connection already exists.");
		} else {

			try {

				Class.forName("org.sqlite.JDBC");

				final String driver_path = "jdbc:sqlite:" + m_path;

				final File file = new File(m_path);

				m_connection = DriverManager.getConnection(driver_path, m_username, m_password);

				m_connected = true;

				if (file.exists()) {

					System.out.println("<?> Opening database connection.");
				}
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
