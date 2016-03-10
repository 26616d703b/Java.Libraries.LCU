package com.ampersand.lcu.mail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.URLName;

import com.sun.mail.pop3.POP3SSLStore;

public class MailReader {

	/*
	 * Attributes
	 */

	public static final String GMAIL = "pop.gmail.com";
	public static final String LIVE = "pop3.live.com";
	public static final String YAHOO = "pop.mail.yahoo.com";
	public static final String YAHOO_PLUS = "plus.pop.mail.yahoo.com";

	private String m_user_address;
	private String m_user_password;
	private String m_host;

	private boolean m_connected;

	private Session m_session;
	private POP3SSLStore m_store;

	private Folder m_folder;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public MailReader(String user_address, String user_password) {

		m_user_address = user_address;
		m_user_password = user_password;
		m_host = MailReader.getHostByAddress(user_address);
	}

	// ACCESSORS and MUTATORS

	// CONNECTED

	public boolean isConnected() {

		return m_connected;
	}

	// USER ADDRESS

	public String getUserAddress() {

		return m_user_address;
	}

	public void setUserAddress(String address) {

		m_user_address = address;
	}

	// USER PASSWORD

	public String getUserPassword() {

		return m_user_password;
	}

	public void setUserPassword(String password) {

		m_user_password = password;
	}

	// HOST ADDRESS

	public String getHostAddress() {

		return m_host;
	}

	public void setHostAddress(String address) {

		m_host = address;
	}

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	public boolean connect() {

		if (m_connected) {

			System.err.println("<!> Connection already exists.");
		} else {

			final Properties properties = System.getProperties();

			m_session = Session.getDefaultInstance(properties, null);

			try {

				m_store = new POP3SSLStore(m_session, new URLName(""));
				m_store.connect(m_host, m_user_address, m_user_password);

				m_folder = m_store.getFolder("INBOX");
				m_folder.open(Folder.READ_ONLY);

				m_connected = true;

				System.out.println("<?> Successful connection!");
			} catch (final MessagingException e) {

				System.err.println(e);
			}
		}

		return m_connected;
	}

	// ----------------------------------------------------[ D
	// ]----------------------------------------------------//

	public boolean disconnect() {

		if (!m_connected) {

			System.err.println("<!> No existing connection.");
		} else {

			try {

				m_store.close();
				m_folder.close(true);

				m_connected = false;

				System.out.println("<?> Successful disconnection!");
			} catch (final MessagingException e) {

				System.err.println(e);
			}
		}

		return !m_connected;
	}

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	public static String getHostByAddress(String address) {

		String host_address = null;

		if (MailReader.isGoogleAddress(address)) {

			host_address = MailReader.GMAIL;
		} else if (MailReader.isMicrosoftAddress(host_address)) {

			host_address = MailReader.LIVE;
		} else if (MailReader.isYahooAddress(host_address)) {

			host_address = MailReader.YAHOO;
		}

		return host_address;
	}

	public int getMessageCount() {

		int messages = 0;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				messages = m_folder.getMessageCount();
			} catch (final MessagingException e) {

				System.err.println(e);
			}
		}

		return messages;
	}

	public int getNewMessageCount() {

		int messages = 0;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				messages = m_folder.getNewMessageCount();
			} catch (final MessagingException e) {

				System.err.println(e);
			}
		}

		return messages;
	}

	public Message getMessage(int message_number) {

		Message message = null;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				message = m_folder.getMessages()[message_number];
			} catch (final MessagingException e) {

				System.err.println(e);
			}
		}

		return message;
	}

	public Message[] getMessages() {

		Message[] messages = null;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				messages = m_folder.getMessages();
			} catch (final MessagingException e) {

				System.err.println(e);
			}
		}

		return messages;
	}

	public Object getMessageContent(int message_number) {

		Object content = null;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				content = m_folder.getMessages()[message_number].getContent();
			} catch (final MessagingException e) {

				System.err.println(e);
			} catch (final IOException e) {

				System.err.println(e);
			}
		}

		return content;
	}

	// ----------------------------------------------------[ I
	// ]----------------------------------------------------//

	public static boolean isGoogleAddress(String address) {

		return address.contains("@gmail");
	}

	public static boolean isMicrosoftAddress(String address) {

		return address.contains("@hotmail") || address.contains("@live") || address.contains("@windowslive");
	}

	public static boolean isYahooAddress(String address) {

		return address.contains("@rocketmail") || address.contains("@yahoo") || address.contains("@ymail");
	}
}
