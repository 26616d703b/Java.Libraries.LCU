package com.ampersand.lcu.gui.component.field;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import com.ampersand.lcu.validator.Validator;

public class TextValidationField extends JPanel {

	/*
	 * Attributes
	 */
	private static final long serialVersionUID = -2635230718535992739L;

	private Validator m_validator;

	private final FieldCaretListener m_caret_listener;

	private JTextField m_field;
	private JPasswordField m_password_field;

	private final JLabel m_state;
	private final ImageIcon m_empty;
	private final ImageIcon m_valid;
	private final ImageIcon m_invalid;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public TextValidationField(Validator validator) {

		setLayout(new BorderLayout());

		m_validator = validator;
		m_caret_listener = new FieldCaretListener();

		// NORTH

		// EAST

		m_empty = new ImageIcon(getClass().getResource("res/icons/text_validation_field/empty.png"));
		m_valid = new ImageIcon(getClass().getResource("res/icons/text_validation_field/valid.png"));
		m_invalid = new ImageIcon(getClass().getResource("res/icons/text_validation_field/invalid.png"));

		m_state = new JLabel(m_empty);

		add(m_state, BorderLayout.EAST);

		// WEST

		// CENTER

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			m_password_field = new JPasswordField();
			m_password_field.addCaretListener(m_caret_listener);
			m_password_field.setFont(new Font("Century Gothic", Font.PLAIN, 16));

			add(m_password_field, BorderLayout.CENTER);

			setPreferredSize(m_password_field.getPreferredSize());
		} else {

			m_field = new JTextField();
			m_field.addCaretListener(m_caret_listener);
			m_field.setFont(new Font("Century Gothic", Font.PLAIN, 16));

			add(m_field, BorderLayout.CENTER);

			setPreferredSize(m_field.getPreferredSize());
		}

		// SOUTH

	}

	// ACCESSORS and MUTATORS

	// EDITABLE

	public boolean isEditable() {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			return m_password_field.isEditable();
		} else {

			return m_field.isEditable();
		}
	}

	public void setEditable(boolean editable) {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			m_password_field.setEditable(editable);
		} else {

			m_field.setEditable(editable);
		}
	}

	// EMPTY

	public boolean isEmpty() {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			return m_password_field.getPassword().length == 0;
		} else {

			return m_field.getText().isEmpty();
		}
	}

	// ENABLED

	@Override
	public boolean isEnabled() {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			return m_password_field.isEnabled();
		} else {

			return m_field.isEnabled();
		}
	}

	@Override
	public void setEnabled(boolean enabled) {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			m_password_field.setEnabled(enabled);
		} else {

			m_field.setEnabled(enabled);
		}
	}

	// FONT

	@Override
	public synchronized Font getFont() {

		if (m_validator == null) {

			return super.getFont();
		} else {

			if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

				return m_password_field.getFont();
			} else {

				return m_field.getFont();
			}
		}
	}

	@Override
	public synchronized void setFont(Font font) {

		super.setFont(font);

		if (m_validator != null) {

			if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

				m_password_field.setFont(font);
			} else {

				m_field.setFont(font);
			}
		}
	}

	// HORIZONTAL ALIGNMENT

	public void setHorizontalAlignment(int text_alignment) {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			m_password_field.setHorizontalAlignment(text_alignment);
		} else {

			m_field.setHorizontalAlignment(text_alignment);
		}
	}

	// TEXT

	public String getText() {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			return String.valueOf(m_password_field.getPassword());
		} else {

			return m_field.getText();
		}
	}

	public void setText(String text) {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			m_password_field.setText(text);
			m_password_field.getCaretListeners()[0].caretUpdate(null);
		} else {

			m_field.setText(text);
			m_field.getCaretListeners()[0].caretUpdate(null);
		}
	}

	// VALIDATOR

	public Validator getValidator() {

		return m_validator;
	}

	public void setValidator(Validator validator) {

		m_validator = validator;

		CaretListener[] caret_listeners;

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			caret_listeners = m_password_field.getCaretListeners();
		} else {

			caret_listeners = m_field.getCaretListeners();
		}

		for (final CaretListener caret_listener : caret_listeners) {

			caret_listener.caretUpdate(null);
		}
	}

	// RE-IMPLEMENTED METHODS

	@Override
	public synchronized void addKeyListener(KeyListener key_listener) {

		if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

			m_password_field.addKeyListener(key_listener);
		} else {

			m_field.addKeyListener(key_listener);
		}
	}

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ I
	// ]----------------------------------------------------//

	public boolean inputIsValid() {

		if (m_validator.equals(Validator.NO_RESTRICTION)) {

			return true;
		} else {

			if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

				return m_validator.isValid(String.valueOf(m_password_field.getPassword()));
			} else {

				return m_validator.isValid(m_field.getText());
			}
		}
	}

	// LISTENERS

	public class FieldCaretListener implements CaretListener {

		@Override
		public void caretUpdate(CaretEvent event) {

			if (m_validator.equals(Validator.NO_RESTRICTION)) {

				m_state.setIcon(m_empty);
			} else {

				if (m_validator.equals(Validator.PASSWORD) || m_validator.equals(Validator.WEAK_PASSWORD)) {

					if (!m_password_field.isEnabled()) {

						m_state.setIcon(m_empty);
					} else {

						if (m_password_field.getPassword().length == 0) {

							m_state.setIcon(m_empty);
						} else {

							if (m_validator.isValid(String.valueOf(m_password_field.getPassword()))) {

								m_state.setIcon(m_valid);
							} else {

								m_state.setIcon(m_invalid);
							}
						}
					}
				} else {

					if (!m_field.isEnabled()) {

						m_state.setIcon(m_empty);
					} else {

						if (m_field.getText().isEmpty()) {

							m_state.setIcon(m_empty);
						} else {

							if (m_validator.isValid(m_field.getText())) {

								m_state.setIcon(m_valid);
							} else {

								m_state.setIcon(m_invalid);
							}
						}
					}
				}
			}
		}
	}
}
