package com.ampersand.lcu.io.zip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public final class ZipUtils {

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	public static String[] getEntries(File file) {

		return ZipUtils.getEntries(file.getPath());
	}

	public static String[] getEntries(String file_path) {

		String[] entries_names = null;

		try {

			// Ouverture de l'archive
			final ZipFile zip_file = new ZipFile(file_path);

			// Extraction des entrées
			final Enumeration<?> entries = zip_file.entries();

			int i = 0;
			entries_names = new String[zip_file.size()];

			// Parcours des entrées
			while (entries.hasMoreElements()) {

				// Extraction entrée courante
				final ZipEntry zip_entry = (ZipEntry) entries.nextElement();

				// Extractions du nom
				entries_names[i] = zip_entry.getName();
				i++;
			}

			// Fermeture archive
			zip_file.close();
		} catch (final Exception e) {

			System.err.println(e);
		}

		return entries_names;
	}

	public static String getEntryInformation(File file, String entry_name, int information_type) {

		return getEntryInformations(file, entry_name)[information_type];
	}

	public static String[] getEntryInformations(File file, String entry_name) {

		return ZipUtils.getEntryInformations(file.getPath(), entry_name);
	}

	public static String getEntryInformation(String file_path, String entry_name, int information_type) {

		return getEntryInformations(file_path, entry_name)[information_type];
	}

	public static String[] getEntryInformations(String file_path, String entry_name) {

		String[] informations = null;

		try {

			final ZipFile zip_file = new ZipFile(file_path);
			final ZipEntry zip_entry = zip_file.getEntry(entry_name);

			if (zip_entry == null) {

				System.err.println("<!> Entry not found.");
			} else {

				informations = new String[9];
				informations[NAME] = zip_entry.getName();
				informations[SIZE] = String.valueOf(zip_entry.getSize());
				informations[COMPRESSED_SIZE] = String.valueOf(zip_entry.getCompressedSize());
				informations[DATE_TIME] = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
						.format(new Date(zip_entry.getTime()));
				informations[COMMENT] = zip_entry.getComment();
				informations[CRC] = String.valueOf(zip_entry.getCrc());

				if (zip_entry.getMethod() == ZipEntry.DEFLATED) {

					informations[METHOD] = "Deflate";
				} else {

					informations[METHOD] = "Unknown";
				}

				informations[EXTRA] = String.valueOf(zip_entry.getExtra());
				informations[RATIO] = String
						.valueOf((double) (zip_entry.getSize() - zip_entry.getCompressedSize()) / zip_entry.getSize());
			}

			zip_file.close();
		} catch (final IOException e) {

			System.err.println(e);
		}

		return informations;
	}

	// ----------------------------------------------------[ U
	// ]----------------------------------------------------//

	// UNZIP

	public static void unzip(File file) {

		ZipUtils.unzip(file.getPath());
	}

	public static void unzip(String source_file_path) {

		try {

			System.out.println("<?> Decompression launched.");

			// Fichier buffered_output_streamination
			BufferedOutputStream buffered_output_stream = null;

			// Ouverture fichier entrée
			final FileInputStream file_input_stream = new FileInputStream(source_file_path);

			// Ouverture fichier de buffer
			final BufferedInputStream buffered_input_stream = new BufferedInputStream(file_input_stream);

			// Ouverture archive Zip d'entrée
			final ZipInputStream zip_input_stream = new ZipInputStream(buffered_input_stream);

			// Entrée Zip
			ZipEntry zip_entry;

			// Parcours des entrées de l'archive
			while ((zip_entry = zip_input_stream.getNextEntry()) != null) {

				// Affichage du nom de l'entrée
				System.out.println("Extracting: " + zip_entry);

				int count;
				final byte data[] = new byte[DEFAULT_BUFFER_SIZE];

				// Création fichier
				final FileOutputStream file_output_stream = new FileOutputStream(zip_entry.getName());

				// Affectation buffer de sortie
				buffered_output_stream = new BufferedOutputStream(file_output_stream, DEFAULT_BUFFER_SIZE);

				// Ecriture sur disque
				while ((count = zip_input_stream.read(data, 0, DEFAULT_BUFFER_SIZE)) != -1) {

					buffered_output_stream.write(data, 0, count);
				}

				// Vidage du tampon
				buffered_output_stream.flush();

				// Fermeture fichier
				buffered_output_stream.close();
			}

			// Fermeture archive
			zip_input_stream.close();

			System.out.println("<?> Decompression successful.");

		} catch (final Exception e) {

			System.err.println(e);
		}
	}

	// ----------------------------------------------------[ Z
	// ]----------------------------------------------------//

	// ZIP

	public static void zip(File source_file, File destination_file) {

		ZipUtils.zip(source_file.getPath(), destination_file.getPath());
	}

	public static void zip(String source_file_path, String destination_file_path) {

		final String[] source_files_paths = { source_file_path };

		ZipUtils.zip(source_files_paths, destination_file_path);
	}

	public static void zip(File[] source_files, File destination_file) {

		final String[] source_files_paths = new String[source_files.length];

		for (int i = 0; i < source_files.length; i++) {

			source_files_paths[i] = source_files[i].getPath();
		}

		ZipUtils.zip(source_files_paths, destination_file.getPath());
	}

	public static void zip(String[] source_files_paths, String destination_file_path) {

		try {

			System.out.println("<?> Compression launched.");

			// Création d'un flux d'écriture sur fichier
			final FileOutputStream file_output_stream = new FileOutputStream(destination_file_path);

			// Calcul du checksum : Adler32 (plus rapide) ou CRC32
			final CheckedOutputStream checksum_output_stream = new CheckedOutputStream(file_output_stream,
					new Adler32());

			// Création d'un buffer d'écriture
			final BufferedOutputStream buffered_output_stream = new BufferedOutputStream(checksum_output_stream);

			// Création d'un flux d'écriture Zip
			final ZipOutputStream zip_output_stream = new ZipOutputStream(buffered_output_stream);

			// Spécification de la méthode de compression
			zip_output_stream.setMethod(ZipOutputStream.DEFLATED);

			// Spécifier la qualité de la compression 0..9
			zip_output_stream.setLevel(Deflater.BEST_COMPRESSION);

			// Buffer temporaire des données à écriture dans le flux de sortie
			final byte data[] = new byte[DEFAULT_BUFFER_SIZE];

			// Pour chacun des fichiers de la liste
			for (final String source_files_path : source_files_paths) {

				// En afficher le nom
				System.out.println("Adding: " + source_files_path);

				// Création d'un flux de lecture
				final FileInputStream file_input_stream = new FileInputStream(source_files_path);

				// Création d'un tampon de lecture sur ce flux
				final BufferedInputStream buffered_input_stream = new BufferedInputStream(file_input_stream,
						DEFAULT_BUFFER_SIZE);

				// Création d'une entrée Zip pour ce fichier
				final ZipEntry entry = new ZipEntry(source_files_path);

				// Ajout de cette entrée dans le flux d'écriture de l'archive
				// Zip
				zip_output_stream.putNextEntry(entry);

				// Ecriture du fichier par paquet de BUFFER octets dans le flux
				// d'écriture
				int count;

				while ((count = buffered_input_stream.read(data, 0, DEFAULT_BUFFER_SIZE)) != -1) {

					zip_output_stream.write(data, 0, count);
				}

				// Fermeture de l'entrée courante
				zip_output_stream.closeEntry();

				// Fermeture du flux de lecture
				buffered_input_stream.close();
			}

			// Fermeture du flux d'écriture
			zip_output_stream.close();
			buffered_output_stream.close();
			checksum_output_stream.close();
			file_output_stream.close();

			System.out.println("Checksum: " + checksum_output_stream.getChecksum().getValue());

			System.out.println("<?> Compression successful.");
		} catch (final Exception e) {

			System.err.println(e);
		}
	}

	/*
	 * Attributes
	 */

	public static final int NAME = 0;
	public static final int SIZE = 1;
	public static final int COMPRESSED_SIZE = 2;
	public static final int DATE_TIME = 3;
	public static final int COMMENT = 4;
	public static final int CRC = 5;
	public static final int METHOD = 6;
	public static final int EXTRA = 7;
	public static final int RATIO = 8;

	private static final int DEFAULT_BUFFER_SIZE = 2048;
}
