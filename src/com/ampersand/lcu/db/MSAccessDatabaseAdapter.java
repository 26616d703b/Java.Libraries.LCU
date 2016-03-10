package com.ampersand.lcu.db;

public class MSAccessDatabaseAdapter extends ADatabaseAdapter {

	/**
	 *
	 */
	private static final long serialVersionUID = -2219336577867015847L;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public MSAccessDatabaseAdapter(MSAccessDatabase database) {

		m_database = database;
		m_database.connect();
	}

	public MSAccessDatabaseAdapter(String path, String user, String password) {

		m_database = new MSAccessDatabase(path, user, password);
		m_database.connect();
	}

	// ACCESSORS and MUTATORS

	// DATABASE

	@Override
	public MSAccessDatabase getDatabase() {

		return (MSAccessDatabase) m_database;
	}

	public void setDatabase(MSAccessDatabase database) {

		if (m_database != null && m_database.isConnected()) {

			m_database.disconnect();
		}

		m_database = database;
		m_database.connect();
	}
}
