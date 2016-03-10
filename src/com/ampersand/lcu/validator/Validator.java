package com.ampersand.lcu.validator;

public enum Validator {

	// ----------------------------------------------------[ A
	// ]----------------------------------------------------//

	ALGERIAN_POSTAL_ADDRESS {

		@Override
		public boolean isValid(String address) {

			return address.matches("^(M|MME|MLLE)\\.?[A-Z ]+[A-Z0-9 ]+$");
		}
	},

	ALPHA {

		@Override
		public boolean isValid(String alpha) {

			return alpha.matches("^[a-zA-Z][a-zA-Z ]*$");
		}
	},

	ALPHA_NUMERIC {

		@Override
		public boolean isValid(String alpha_numeric) {

			return alpha_numeric.matches("^[0-9a-zA-Z][0-9a-zA-Z ]*$");
		}
	},

	// ----------------------------------------------------[ B
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ D
	// ]----------------------------------------------------//

	DATE {

		@Override
		public boolean isValid(String date) {

			return date.matches(
					"^((0?[13578]|10|12)(-|\\/)(([1-9])|(0[1-9])|([12])([0-9]?)|(3[01]?))(-|\\/)((19)([2-9])(\\d{1})|(20)([01])(\\d{1})|([8901])(\\d{1}))|(0?[2469]|11)(-|\\/)(([1-9])|(0[1-9])|([12])([0-9]?)|(3[0]?))(-|\\/)((19)([2-9])(\\d{1})|(20)([01])(\\d{1})|([8901])(\\d{1})))$");
		}
	},

	DATE_TIME {

		@Override
		public boolean isValid(String date_time) {

			return date_time.matches(
					"(?n:^(?=\\d)((?<day>31(?!(.0?[2469]|11))|30(?!.0?2)|29(?(.0?2)(?=.{3,4}(19|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|(16|[2468][048]|[3579][26])00))|0?[1-9]|1\\d|2[0-8])(?<sep>[/.-])(?<month>0?[1-9]|1[012])\2(?<year>(19|[2-9]\\d)\\d{2})(?:(?=\\x20\\d)\\x20|$))?(?<time>([01]\\d|2[0-3])(:[0-5]\\d){1})$)");
		}
	},

	DIGIT {

		@Override
		public boolean isValid(String digit) {

			return digit.matches("^[0-9]$");
		}
	},

	// ----------------------------------------------------[ E
	// ]----------------------------------------------------//

	E_MAIL_ADDRESS {

		@Override
		public boolean isValid(String e_mail) {

			return e_mail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
		}
	},

	// ----------------------------------------------------[ F
	// ]----------------------------------------------------//

	FILE_EXTENSION {

		@Override
		public boolean isValid(String file) {

			return file.matches("(?!\\.)[a-zA-Z]{1,4}$");
		}
	},

	FIRST_NAME {

		@Override
		public boolean isValid(String name) {

			return name.matches(
					"^((?:[A-Z](?:('|(?:[a-z]{1,3}))[A-Z])?[a-z]+)|(?:[A-Z]\\.))(?:([ -])((?:[A-Z](?:('|(?:[a-z]{1,3}))[A-Z])?[a-z]+)|(?:[A-Z]\\.)))?$");
		}
	},

	FLOAT {

		@Override
		public boolean isValid(String s_float) {

			return s_float.matches("^[+-]?\\d*\\.?\\d*$");
		}
	},

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ G
	// ]----------------------------------------------------//

	HEXADECIMAL {

		@Override
		public boolean isValid(String hexadecimal) {

			return hexadecimal.matches("^([0-9a-fA-F])+$");
		}
	},

	HOST_NAME {

		@Override
		public boolean isValid(String name) {

			return name.matches(
					"^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$");
		}
	},

	// ----------------------------------------------------[ I
	// ]----------------------------------------------------//

	INTEGER {

		@Override
		public boolean isValid(String s_integer) {

			return s_integer.matches("^[+-]?[1-9]+$");
		}
	},

	INTERNATIONAL_PHONE_NUMBER {

		@Override
		public boolean isValid(String number) {

			return number.matches("^(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*$");
		}
	},

	IP_ADDRESS {

		@Override
		public boolean isValid(String ip) {

			return ip.matches(
					"^(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])$");
		}
	},

	IP_MULTICAST_ADDRESS {

		@Override
		public boolean isValid(String ip) {

			return ip.matches("^2(?:2[4-9]|3\\d)(?:\\.(?:25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d?|0)){3}$");
		}
	},

	// ----------------------------------------------------[ J
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ K
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ L
	// ]----------------------------------------------------//

	LAST_NAME {

		@Override
		public boolean isValid(String name) {

			return name.matches(
					"^((?:[A-Z](?:('|(?:[a-z]{1,3}))[A-Z])?[a-z]+)|(?:[A-Z]\\.))(?:([ -])((?:[A-Z](?:('|(?:[a-z]{1,3}))[A-Z])?[a-z]+)|(?:[A-Z]\\.)))?$");
		}
	},

	LOGIN {

		@Override
		public boolean isValid(String login) {

			return login.matches("^[a-zA-Z_][a-zA-Z0-9_]*$");
		}
	},

	// ----------------------------------------------------[ M
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ N
	// ]----------------------------------------------------//

	NO_RESTRICTION {

		@Override
		public boolean isValid(String text) {

			return true;
		}
	},

	// ----------------------------------------------------[ O
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ P
	// ]----------------------------------------------------//

	PASSWORD {

		@Override
		public boolean isValid(String password) {

			return password.matches("^(?=[^\\d_].*?\\d)\\w(\\w|[!@#$%]){7,20}");
		}
	},

	PERCENT {

		@Override
		public boolean isValid(String percent) {

			return percent.matches("^100$|^\\s*(\\d{0,2})((\\.|\\,)(\\d*))?\\s*\\%?\\s*$");
		}
	},

	PORT_NUMBER {

		@Override
		public boolean isValid(String port) {

			return port.matches("^(0|([1-9]\\d{0,3}|[1-5]\\d{4}|[6][0-5][0-5]([0-2]\\d|[3][0-5])))$");
		}
	},

	// ----------------------------------------------------[ Q
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ R
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ S
	// ]----------------------------------------------------//

	SQL_QUERY {

		@Override
		public boolean isValid(String query) {

			return query.matches(
					"(SELECT\\s[\\w\\*\\)\\(\\,\\s]+\\sFROM\\s[\\w]+)| (UPDATE\\s[\\w]+\\sSET\\s[\\w\\,\\'\\=]+)| (INSERT\\sINTO\\s[\\d\\w]+[\\s\\w\\d\\)\\(\\,]*\\sVALUES\\s\\([\\d\\w\\'\\,\\)]+)| (DELETE\\sFROM\\s[\\d\\w\\'\\=]+)");
		}
	},

	// ----------------------------------------------------[ T
	// ]----------------------------------------------------//

	TIME {

		@Override
		public boolean isValid(String time) {

			return time.matches(
					"^((([0]?[1-9]|1[0-2])(:|\\.)[0-5][0-9]((:|\\.)[0-5][0-9])?( )?(AM|am|aM|Am|PM|pm|pM|Pm))|(([0]?[0-9]|1[0-9]|2[0-3])(:|\\.)[0-5][0-9]((:|\\.)[0-5][0-9])?))$");
		}
	},

	// ----------------------------------------------------[ U
	// ]----------------------------------------------------//

	UNSIGNED_INTEGER {

		@Override
		public boolean isValid(String u_integer) {

			return u_integer.matches("^\\+?[0-9]+$");
		}
	},

	UNSIGNED_FLOAT {

		@Override
		public boolean isValid(String u_float) {

			return u_float.matches("^+?\\d*\\.?\\d*$");
		}
	},

	URL {

		@Override
		public boolean isValid(String url) {

			return url.matches("(https?://)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([/\\w \\.-]*)*/?$");
		}
	},

	// ----------------------------------------------------[ V
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ W
	// ]----------------------------------------------------//

	WEAK_PASSWORD {

		@Override
		public boolean isValid(String password) {

			return password.matches("^.+$");
		}
	},

	// ----------------------------------------------------[ X
	// ]----------------------------------------------------//

	// ----------------------------------------------------[ Y
	// ]----------------------------------------------------//

	YOUTUBE_URL {

		@Override
		public boolean isValid(String password) {

			return password.matches("^https?://\\w{0,3}.?youtube+\\.\\w{2,3}/watch\\?v=[\\w-]{11}");
		}
	};

	// ----------------------------------------------------[ Z
	// ]----------------------------------------------------//

	//

	public boolean isValid(String string_to_validate) {
		throw new AbstractMethodError();
	}
}
