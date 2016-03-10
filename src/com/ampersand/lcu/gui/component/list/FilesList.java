package com.ampersand.lcu.gui.component.list;

import java.awt.Component;
import java.io.File;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class FilesList extends JList<File> implements Serializable {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = 5175464104650039918L;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public FilesList(Vector<File> files) {

		if (files == null) {

			files = new Vector<>();
		}

		setModel(new FilesListModel(files));
		setCellRenderer(new FilesListRenderer());
	}

	/*
	 * Attributes
	 */

	class FilesListModel implements ListModel<File>, Serializable {

		/**
		 *
		 */
		private static final long serialVersionUID = -3011889677250803228L;

		/*
		 * Methods
		 */

		// CONSTRUCTOR

		public FilesListModel(Vector<File> files) {

			m_collection = files;
		}

		// ACCESSORS and MUTATORS

		@Override
		public File getElementAt(int index) {

			return m_collection.get(index);
		}

		@Override
		public int getSize() {

			return m_collection.size();
		}

		// RE-IMPLEMENTED METHODS

		@Override
		public void addListDataListener(ListDataListener list_data_listener) {
		}

		@Override
		public void removeListDataListener(ListDataListener list_data_listener) {
		}

		/*
		 * Attributes
		 */

		private final Vector<File> m_collection;
	}

	class FilesListRenderer extends DefaultListCellRenderer implements Serializable {

		/**
		 *
		 */
		private static final long serialVersionUID = -2036278181383658475L;

		/*
		 * Methods
		 */

		// CONSTRUCTOR

		// RE-IMPLEMENTED METHODS

		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {

			final JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected,
					cellHasFocus);

			if (value instanceof File) {

				final String file_path = ((File) value).getPath().toLowerCase();

				// ARCHIVE

				if (file_path.endsWith(".rar") || file_path.endsWith(".zip") || file_path.endsWith(".7z")) {

					if (file_path.endsWith(".rar")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/rar-32.png")));
					} else if (file_path.endsWith(".zip")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/zip-32.png")));
					}
				}

				// AUDIO

				else if (file_path.endsWith(".aac") || file_path.endsWith(".m2a") || file_path.endsWith(".m4a")
						|| file_path.endsWith(".mp2") || file_path.endsWith(".mp3") || file_path.endsWith(".ogg")
						|| file_path.endsWith(".wav") || file_path.endsWith(".wma")) {

					if (file_path.endsWith(".mp3")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/mp3-32.png")));
					} else if (file_path.endsWith(".ogg")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/ogg-32.png")));
					} else if (file_path.endsWith(".wma")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/wma-32.png")));
					} else {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/audio_file-32.png")));
					}
				}

				// DISC IMAGE

				else if (file_path.endsWith(".iso")) {

					label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/cd-32.png")));
				}

				// DOCUMENT

				else if (file_path.endsWith(".docx") || file_path.endsWith(".pdf") || file_path.endsWith(".pptx")
						|| file_path.endsWith(".txt") || file_path.endsWith(".xlsx")) {

					if (file_path.endsWith(".docx")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/word-32.png")));
					} else if (file_path.endsWith(".pdf")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/pdf-32.png")));
					} else if (file_path.endsWith(".pptx")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/powerpoint-32.png")));
					} else if (file_path.endsWith(".xlsx")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/exel-32.png")));
					} else {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/note-32.png")));
					}
				}

				// IMAGE

				else if (file_path.endsWith(".bmp") || file_path.endsWith(".gif") || file_path.endsWith(".jpg")
						|| file_path.endsWith("jpeg") || file_path.endsWith(".png")) {

					if (file_path.endsWith(".gif")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/gif-32.png")));
					} else if (file_path.endsWith(".jpg")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/jpg-32.png")));
					} else if (file_path.endsWith(".png")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/png-32.png")));
					} else {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/image_file-32.png")));
					}
				}

				// PROGRAM

				else if (file_path.endsWith(".exe")) {

					label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/exe-32.png")));
				}

				// VIDEO

				else if (file_path.endsWith(".3gp") || file_path.endsWith(".avi") || file_path.endsWith(".flv")
						|| file_path.endsWith(".mov") || file_path.endsWith(".mp4") || file_path.endsWith(".mpeg")
						|| file_path.endsWith(".mpg")) {

					if (file_path.endsWith(".avi")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/avi-32.png")));
					} else if (file_path.endsWith(".flv")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/flv-32.png")));
					} else if (file_path.endsWith(".mov")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/mov-32.png")));
					} else if (file_path.endsWith(".mpeg") || file_path.endsWith(".mpg")) {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/mpg-32.png")));
					} else {

						label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/video_file-32.png")));
					}
				} else {

					label.setIcon(new ImageIcon(getClass().getResource("res/icons/files_list/file-32.png")));
				}

				label.setText(" " + ((File) value).getName());
			}

			return label;
		}
	}
}
