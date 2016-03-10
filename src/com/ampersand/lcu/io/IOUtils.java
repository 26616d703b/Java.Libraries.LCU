package com.ampersand.lcu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.channels.FileChannel;

public final class IOUtils {

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// IN

	// ----------------------------------------------------[ R
	// ]----------------------------------------------------//

	// READING OBJECTS

	public static Object readObjectFromFile(File file) {

		return IOUtils.readObjectFromFile(file.getPath());
	}

	public static Object readObjectFromFile(String file_path) {

		FileInputStream file_input_stream = null;
		ObjectInputStream object_input_stream = null;
		Object object = null;

		try {

			file_input_stream = new FileInputStream(file_path);
			object_input_stream = new ObjectInputStream(file_input_stream);
			object = object_input_stream.readObject();

			object_input_stream.close();
		} catch (final ClassNotFoundException e) {

			System.err.println(e);
		} catch (final IOException e) {

			System.err.println(e);
		}

		return object;
	}

	// READING STRING

	public static String readStringFromFile(File file) {

		return IOUtils.readStringFromFile(file.getPath());
	}

	public static String readStringFromFile(String file_path) {

		BufferedReader buffered_reader = null;
		StringBuilder data = null;
		String line = null;

		try {

			buffered_reader = new BufferedReader(new FileReader(file_path));

			data = new StringBuilder();
			line = buffered_reader.readLine();

			while (line != null) {

				data.append(line);
				data.append("\n");
				line = buffered_reader.readLine();
			}
		} catch (final FileNotFoundException e) {

			System.err.println(e);
		} catch (final IOException e) {

			System.err.println(e);
		} finally {

			try {

				buffered_reader.close();
			} catch (final IOException e) {

				System.err.println(e);
			}
		}

		return data.toString();
	}

	// OUT

	// ----------------------------------------------------[ W
	// ]----------------------------------------------------//

	// WRITING OBJECTS

	public static void writeObjectToFile(File file, Serializable object) {

		IOUtils.writeObjectToFile(file.getPath(), object);
	}

	public static void writeObjectToFile(String file_path, Serializable object) {

		FileOutputStream file_output_stream = null;
		ObjectOutputStream object_output_stream = null;

		try {

			file_output_stream = new FileOutputStream(file_path);

			object_output_stream = new ObjectOutputStream(file_output_stream);
			object_output_stream.writeObject(object);
		} catch (final IOException e) {

			System.err.println(e);
		} finally {

			try {

				object_output_stream.flush();
				object_output_stream.close();
			} catch (final IOException e) {

				System.err.println(e);
			}
		}
	}

	// WRITING STRINGS

	public static void writeStringToFile(File file, String data) {

		IOUtils.writeStringToFile(file.getPath(), data);
	}

	public static void writeStringToFile(String file_path, String data) {

		BufferedWriter buffered_writer = null;

		try {

			buffered_writer = new BufferedWriter(new FileWriter(file_path));
			buffered_writer.write(data);
		} catch (final FileNotFoundException e) {

			System.err.println(e);
		} catch (final IOException e) {

			System.err.println(e);
		} finally {

			try {

				buffered_writer.close();
			} catch (final IOException e) {

				System.err.println(e);
			}
		}
	}

	public static void writeStringToEndOfFile(File file, String data) {

		IOUtils.writeStringToEndOfFile(file.getPath(), data);
	}

	public static void writeStringToEndOfFile(String file_path, String data) {

		BufferedWriter buffered_writer = null;
		String old = null;

		try {

			old = IOUtils.readStringFromFile(file_path);

			buffered_writer = new BufferedWriter(new FileWriter(file_path));
			buffered_writer.write(old + data);
		} catch (final FileNotFoundException e) {

			System.err.println(e);
		} catch (final IOException e) {

			System.err.println(e);
		} finally {

			try {

				buffered_writer.close();
			} catch (final IOException e) {

				System.err.println(e);
			}
		}
	}

	// IN - OUT

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	// COPY

	public static void copyFile(File source_file, File target_file) {

		IOUtils.copyFile(source_file.getPath(), target_file.getPath());
	}

	@SuppressWarnings("resource")
	public static void copyFile(String source_file_path, String target_file_path) {

		FileChannel source_file_channel;
		FileChannel target_file_channel;

		try {

			source_file_channel = new FileInputStream(source_file_path).getChannel();
			target_file_channel = new FileOutputStream(target_file_path).getChannel();

			System.out.println("<?> Copy launched.");

			long count = 0;
			final long size = source_file_channel.size();

			while ((count += target_file_channel.transferFrom(source_file_channel, count, size - count)) < size) {
				;
			}

			source_file_channel.close();
			target_file_channel.close();

			System.out.println("<?> Copy done.");
		} catch (final FileNotFoundException e) {

			System.err.println(e);
		} catch (final IOException e) {

			System.err.println(e);
		}
	}

	// ----------------------------------------------------[ M
	// ]----------------------------------------------------//

	// MOVE

	public static void moveFile(File old_file, File new_file_name) {

		if (old_file.renameTo(new_file_name)) {

			System.out.println("<?> The file was moved successfully.");
		} else {

			System.out.println("<!> The File was not moved.");
		}
	}

	public static void moveFile(String old_file_path, String new_file_path) {

		IOUtils.moveFile(new File(old_file_path), new File(new_file_path));
	}

	// ----------------------------------------------------[ R
	// ]----------------------------------------------------//

	// RENAME

	public static void renameFile(File file, String new_name) {

		int i;
		final String file_path = file.getAbsolutePath();

		for (i = file_path.length() - 1; i > 0; i--) {

			if (file_path.charAt(i) == '\\') {

				break;
			}
		}

		String new_file_path = file_path.substring(0, i + 1);
		new_file_path += new_name;

		if (file.renameTo(new File(new_file_path))) {

			System.out.println("<?> The File was renamed successfuly.");
		} else {

			System.out.println("<!> The File was not renamed.");
		}
	}

	public static void renameFile(String file_path, String new_file_name) {

		IOUtils.renameFile(new File(file_path), new_file_name);
	}
}
