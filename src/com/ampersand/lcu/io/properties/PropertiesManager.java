package com.ampersand.lcu.io.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Vector;

public final class PropertiesManager {

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ L
	// ]----------------------------------------------------//

	// loadProperty(*, *, [*])

	public static String loadProperty(String properties_file_path, String key) {

		return loadProperties(properties_file_path).getProperty(key);
	}

	public static String loadProperty(String properties_file_path, String key, String default_value) {

		return loadProperties(properties_file_path).getProperty(key, default_value);
	}

	public static String loadProperty(File properties_file, String key) {

		return loadProperties(properties_file).getProperty(key);
	}

	public static String loadProperty(File properties_file, String key, String default_value) {

		return loadProperties(properties_file).getProperty(key, default_value);
	}

	// loadProperties(*)

	public static Properties loadProperties(String properties_file_path) {

		final Properties properties = new Properties();

		FileInputStream input_stream = null;

		try {

			input_stream = new FileInputStream(properties_file_path);
		} catch (final FileNotFoundException e) {

			System.err.println(e);
		}

		try {

			properties.load(input_stream);
			input_stream.close();
		} catch (final IOException e) {

			System.err.println(e);
		}

		return properties;
	}

	public static Properties loadProperties(File properties_file) {

		final Properties properties = new Properties();

		FileInputStream input_stream = null;

		try {

			input_stream = new FileInputStream(properties_file);
		} catch (final FileNotFoundException e) {

			System.err.println(e);
		}

		try {

			properties.load(input_stream);
			input_stream.close();
		} catch (final IOException e) {

			System.err.println(e);
		}

		return properties;
	}

	// ----------------------------------------------------[ R
	// ]----------------------------------------------------//

	// removeProperty(*, *)

	public static void removeProperty(String properties_file_path, String key) {

		loadProperties(properties_file_path).remove(key);
	}

	public static void removeProperty(File properties_file, String key) {

		loadProperties(properties_file).remove(key);
	}

	// ----------------------------------------------------[ S
	// ]----------------------------------------------------//

	// saveProperty(*, *, *)

	public static void saveProperty(String properties_file_path, Object key, Object value) {

		final Properties properties = new Properties();

		FileOutputStream output_stream = null;

		try {

			output_stream = new FileOutputStream(properties_file_path);
		} catch (final FileNotFoundException e) {

			System.err.println(e);
		}

		properties.put(key, value);

		try {

			properties.store(output_stream, null);
			output_stream.close();
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	public static void saveProperty(File properties_file, Object key, Object value) {

		final Properties properties = new Properties();

		FileOutputStream output_stream = null;

		try {

			output_stream = new FileOutputStream(properties_file);
		} catch (final FileNotFoundException e) {

			System.err.println(e);
		}

		properties.put(key, value);

		try {

			properties.store(output_stream, null);
			output_stream.close();
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	// saveProperties(*)

	public static void saveProperties(String properties_file_path, Object[] keys, Object[] values) {

		if (keys.length == values.length) {

			final Properties properties = new Properties();

			FileOutputStream output_stream = null;

			try {

				output_stream = new FileOutputStream(properties_file_path);
			} catch (final FileNotFoundException e) {

				System.err.println(e);
			}

			for (int i = 0; i < values.length; i++) {

				properties.put(keys[i], values[i]);
			}

			try {

				properties.store(output_stream, null);
				output_stream.close();
			} catch (final IOException e) {

				System.err.println(e);
			}
		} else {

			System.err.println("<!> Array sizes are not the same...");
		}
	}

	public static void saveProperties(String properties_file_path, Vector<Object> keys, Vector<Object> values) {

		if (keys.size() == values.size()) {

			final Properties properties = new Properties();

			FileOutputStream output_stream = null;

			try {

				output_stream = new FileOutputStream(properties_file_path);
			} catch (final FileNotFoundException e) {

				System.err.println(e);
			}

			for (int i = 0; i < keys.size(); i++) {

				properties.put(keys.get(i), values.get(i));
			}

			try {

				properties.store(output_stream, null);
				output_stream.close();
			} catch (final IOException e) {

				System.err.println(e);
			}
		} else {

			System.err.println("<!> Vectors sizes are not the same...");
		}
	}

	public static void saveProperties(File properties_file, Object[] keys, Object[] values) {

		if (keys.length == values.length) {

			final Properties properties = new Properties();

			FileOutputStream output_stream = null;

			try {

				output_stream = new FileOutputStream(properties_file);
			} catch (final FileNotFoundException e) {

				System.err.println(e);
			}

			for (int i = 0; i < values.length; i++) {

				properties.put(keys[i], values[i]);
			}

			try {

				properties.store(output_stream, null);
				output_stream.close();
			} catch (final IOException e) {

				System.err.println(e);
			}
		} else {

			System.err.println("<!> Array sizes are not the same...");
		}
	}

	public static void saveProperties(File properties_file, Vector<Object> keys, Vector<Object> values) {

		if (keys.size() == values.size()) {

			final Properties properties = new Properties();

			FileOutputStream output_stream = null;

			try {

				output_stream = new FileOutputStream(properties_file);
			} catch (final FileNotFoundException e) {

				System.err.println(e);
			}

			for (int i = 0; i < keys.size(); i++) {

				properties.put(keys.get(i), values.get(i));
			}

			try {

				properties.store(output_stream, null);
				output_stream.close();
			} catch (final IOException e) {

				System.err.println(e);
			}
		} else {

			System.err.println("<!> Vectors sizes are not the same...");
		}
	}
}
