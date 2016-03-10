package com.ampersand.lcu.db;

public class MySQLDatabaseAdapter extends ADatabaseAdapter {

	/**
	 *
	 */

	private static final long serialVersionUID = 3743327365999440598L;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public MySQLDatabaseAdapter(MySQLDatabase database) {

		m_database = database;
		m_database.connect();
	}

	public MySQLDatabaseAdapter(String path, String user, String password) {

		m_database = new MySQLDatabase(path, user, password);
		m_database.connect();
	}

	// ACCESSORS and MUTATORS

	@Override
	public MySQLDatabase getDatabase() {

		return (MySQLDatabase) m_database;
	}

	public void setDatabase(MySQLDatabase database) {

		if (m_database != null && m_database.isConnected()) {

			m_database.disconnect();
		}

		m_database = database;
		m_database.connect();
	}
}
