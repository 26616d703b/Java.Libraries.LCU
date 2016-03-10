package com.ampersand.lcu.db;

public class SQLiteDatabaseAdapter extends ADatabaseAdapter {

	/**
	 *
	 */
	private static final long serialVersionUID = 6614185463791886184L;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public SQLiteDatabaseAdapter(SQLiteDatabase database) {

		m_database = database;
		m_database.connect();
	}

	public SQLiteDatabaseAdapter(String path, String user, String password) {

		m_database = new SQLiteDatabase(path, user, password);
		m_database.connect();
	}

	// ACCESSORS and MUTATORS

	@Override
	public SQLiteDatabase getDatabase() {

		return (SQLiteDatabase) m_database;
	}

	public void setDatabase(SQLiteDatabase database) {

		if (m_database != null && m_database.isConnected()) {

			m_database.disconnect();
		}

		m_database = database;
		m_database.connect();
	}
}
