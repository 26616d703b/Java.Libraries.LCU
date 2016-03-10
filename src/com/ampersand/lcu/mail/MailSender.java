package com.ampersand.lcu.mail;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailSender {

	/*
	 * Attributes
	 */

	public static final String GMAIL = "smtp.gmail.com";
	public static final String LIVE = "smtp.live.com";
	public static final String YAHOO = "smtp.mail.yahoo.com";
	public static final String YAHOO_PLUS = "plus.smtp.mail.yahoo.com";

	private String m_user_address;
	private String m_user_password;
	private String m_host;

	private boolean m_connected;

	private Session m_session;
	private Transport m_transport;

	/*
	 * Methods
	 */

	// CONSTRUCTOR

	public MailSender(String user_address, String user_password) {

		m_user_address = user_address;
		m_user_password = user_password;
		m_host = MailSender.getHostByAddress(user_address);
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

			final Properties properties = new Properties();
			properties.setProperty("mail.transport.protocol", "smtp");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.enable", "true");

			if (m_host == MailSender.GMAIL || m_host == MailSender.YAHOO) {

				properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				properties.setProperty("mail.smtp.socketFactory.fallback", "false");
				properties.setProperty("mail.smtp.socketFactory.port", "465");
				properties.setProperty("mail.smtp.port", "465");
			} else if (m_host == MailSender.LIVE) {

				properties.setProperty("mail.smtp.port", "587");
			}

			m_session = Session.getDefaultInstance(properties);

			try {

				m_transport = m_session.getTransport();
				m_transport.connect(m_host, m_user_address, m_user_password);

				m_connected = true;

				System.out.println("<?> Successful connection!");
			} catch (final NoSuchProviderException e) {

				System.err.println(e);
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

				m_transport.close();

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

		if (MailSender.isGoogleAddress(address)) {

			host_address = MailSender.GMAIL;
		} else if (MailSender.isMicrosoftAddress(address)) {

			host_address = MailSender.LIVE;
		} else if (MailSender.isYahooAddress(address)) {

			host_address = MailSender.YAHOO;
		}

		return host_address;
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

	// ----------------------------------------------------[ S
	// ]----------------------------------------------------//

	public boolean send(String recipient_address, String message_subject, String message_text) {

		boolean sent = false;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				final MimeMessage message = new MimeMessage(m_session);
				message.setFrom(new InternetAddress(m_user_address));
				message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient_address));
				message.setSubject(message_subject);
				message.setText(message_text, "utf-8");
				message.setSentDate(new Date());

				m_transport.sendMessage(message, message.getAllRecipients());

				System.out.println("<?> Message sent successfully!");

				sent = true;
			} catch (final NoSuchProviderException e) {

				System.err.println(e);
			} catch (final AddressException e) {

				System.err.println(e);
			} catch (final MessagingException e) {

				System.err.println(e);
			}
		}

		return sent;
	}

	public boolean send(Vector<String> recipients_addresses, String message_subject, String message_text) {

		boolean sent = false;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				final Address[] addresses = new Address[recipients_addresses.size()];

				int i = 0;

				for (final String address : recipients_addresses) {

					addresses[i] = new InternetAddress(address);

					i++;
				}

				final MimeMessage message = new MimeMessage(m_session);
				message.setFrom(new InternetAddress(m_user_address));
				message.setRecipients(Message.RecipientType.TO, addresses);
				message.setSubject(message_subject);
				message.setText(message_text, "utf-8");
				message.setSentDate(new Date());

				m_transport.sendMessage(message, message.getAllRecipients());

				sent = true;
			} catch (final NoSuchProviderException e) {

				System.err.println(e);
			} catch (final AddressException e) {

				System.err.println(e);
			} catch (final MessagingException e) {

				System.err.println(e);
			}
		}

		return sent;
	}

	public boolean send(String recipient_address, String message_subject, String message_text, File attachment) {

		boolean sent = false;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				final MimeBodyPart text_part = new MimeBodyPart();
				text_part.setText(message_text);

				final MimeBodyPart attachment_part = new MimeBodyPart();
				attachment_part.attachFile(attachment);

				final MimeMultipart multipart = new MimeMultipart();
				multipart.addBodyPart(text_part);
				multipart.addBodyPart(attachment_part);

				final MimeMessage message = new MimeMessage(m_session);
				message.setFrom(new InternetAddress(m_user_address));
				message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient_address));
				message.setSubject(message_subject);

				message.setContent(multipart);

				message.setSentDate(new Date());

				m_transport.sendMessage(message, message.getAllRecipients());

				System.out.println("<?> Message sent successfully!");

				sent = true;
			} catch (final NoSuchProviderException e) {

				System.err.println(e);
			} catch (final AddressException e) {

				System.err.println(e);
			} catch (final MessagingException e) {

				System.err.println(e);
			} catch (final IOException e) {

				System.err.println(e);
			}
		}

		return sent;
	}

	public boolean send(String recipient_address, String message_subject, String message_text,
			Vector<File> attachments) {

		boolean sent = false;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				final MimeBodyPart text_part = new MimeBodyPart();
				text_part.setText(message_text);

				final MimeBodyPart[] attachments_parts = new MimeBodyPart[attachments.size()];

				final MimeMultipart multipart = new MimeMultipart();
				multipart.addBodyPart(text_part);

				int i = 0;

				for (final File file : attachments) {

					attachments_parts[i] = new MimeBodyPart();
					attachments_parts[i].attachFile(file);
					multipart.addBodyPart(attachments_parts[i]);

					i++;
				}

				final MimeMessage message = new MimeMessage(m_session);
				message.setFrom(new InternetAddress(m_user_address));
				message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient_address));
				message.setSubject(message_subject);

				message.setContent(multipart);

				message.setSentDate(new Date());

				m_transport.sendMessage(message, message.getAllRecipients());

				System.out.println("<?> Message sent successfully!");

				sent = true;
			} catch (final NoSuchProviderException e) {

				System.err.println(e);
			} catch (final AddressException e) {

				System.err.println(e);
			} catch (final MessagingException e) {

				System.err.println(e);
			} catch (final IOException e) {

				System.err.println(e);
			}
		}

		return sent;
	}

	public boolean send(Vector<String> recipients_addresses, String message_subject, String message_text,
			Vector<File> attachments) {

		boolean sent = false;

		if (!m_connected) {

			System.err.println("<!> You must first login!");
		} else {

			try {

				final MimeBodyPart text_part = new MimeBodyPart();
				text_part.setText(message_text);

				final MimeBodyPart[] attachments_parts = new MimeBodyPart[attachments.size()];

				final MimeMultipart multipart = new MimeMultipart();
				multipart.addBodyPart(text_part);

				int i = 0;

				for (final File file : attachments) {

					attachments_parts[i] = new MimeBodyPart();
					attachments_parts[i].attachFile(file);

					multipart.addBodyPart(attachments_parts[i]);

					i++;
				}

				final Address[] addresses = new Address[recipients_addresses.size()];

				i = 0;

				for (final String address : recipients_addresses) {

					addresses[i] = new InternetAddress(address);

					i++;
				}

				final MimeMessage message = new MimeMessage(m_session);
				message.setFrom(new InternetAddress(m_user_address));
				message.setRecipients(Message.RecipientType.TO, addresses);
				message.setSubject(message_subject);

				message.setContent(multipart);

				message.setSentDate(new Date());

				m_transport.sendMessage(message, message.getAllRecipients());

				System.out.println("<?> Message sent successfully!");

				sent = true;
			} catch (final NoSuchProviderException e) {

				System.err.println(e);
			} catch (final AddressException e) {

				System.err.println(e);
			} catch (final MessagingException e) {

				System.err.println(e);
			} catch (final IOException e) {

				System.err.println(e);
			}
		}

		return sent;
	}
}
