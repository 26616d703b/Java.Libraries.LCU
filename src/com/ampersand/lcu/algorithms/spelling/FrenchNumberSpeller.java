package com.ampersand.lcu.algorithms.spelling;

public final class FrenchNumberSpeller {

	/*
	 * Attributes
	 */

	private static String[] m_digits = { "zero", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf",
			"dix" };

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ S
	// ]----------------------------------------------------//

	public static String spell(char digit) {

		return m_digits[Integer.valueOf(String.valueOf(digit))];
	}

	public static String spell(String number) {

		String result = null;

		switch (number.length()) {

		case 1:

			result = spell(number.charAt(0));

			break;

		case 2:

			if (number.charAt(0) == '1') {

				if (number.charAt(1) == '0') {

					result = "dix";
				} else if (number.charAt(1) == '1') {

					result = "onze";
				} else if (number.charAt(1) == '2') {

					result = "douze";
				} else if (number.charAt(1) == '3') {

					result = "treize";
				} else if (number.charAt(1) == '4') {

					result = "quatorze";
				} else if (number.charAt(1) == '5') {

					result = "quinze";
				} else if (number.charAt(1) == '6') {

					result = "seize";
				} else {

					result = "dix-" + spell(number.charAt(1));
				}
			} else if (number.charAt(0) == '2') {

				if (number.charAt(1) == '0') {

					result = "vingt";
				} else {

					result = "vingt-" + spell(number.charAt(1));
				}
			} else if (number.charAt(0) == '3') {

				if (number.charAt(1) == '0') {

					result = "trente";
				} else {

					result = "trente-" + spell(number.charAt(1));
				}
			} else if (number.charAt(0) == '4') {

				if (number.charAt(1) == '0') {

					result = "quarante";
				} else {

					result = "quarante-" + spell(number.charAt(1));
				}
			} else if (number.charAt(0) == '5') {

				if (number.charAt(1) == '0') {

					result = "cinquante";
				} else {

					result = "cinquante-" + spell(number.charAt(1));
				}
			} else if (number.charAt(0) == '6') {

				if (number.charAt(1) == '0') {

					result = "soixante";
				} else {

					result = "soixante-" + spell(number.charAt(1));
				}
			} else if (number.charAt(0) == '7') {

				if (number.charAt(1) == '0') {

					result = "soixante-dix";
				} else {

					result = "soixante-" + spell("1" + number.charAt(1));
				}
			} else if (number.charAt(0) == '8') {

				if (number.charAt(1) == '0') {

					result = "quatre-vingt";
				} else {

					result = "quatre-vingt-" + spell(number.charAt(1));
				}
			} else if (number.charAt(0) == '9') {

				if (number.charAt(1) == '0') {

					result = "quatre-vingt-dix";
				} else {

					result = "quatre-vingt-" + spell("1" + number.charAt(1));
				}
			}

			break;

		case 3:

			if (number.charAt(0) == '1') {

				if (number.charAt(1) == '0') {

					if (number.charAt(2) == '0') {

						result = "cent";
					} else {

						result = "cent-" + spell(number.charAt(2));
					}
				} else {

					result = "cent-" + spell(number.substring(1));
				}
			} else {

				result = spell(number.charAt(0)) + "-cent";

				if (number.charAt(1) == '0') {

					result += "-" + spell(number.charAt(2));
				} else {

					result += "-" + spell(number.substring(1));
				}
			}

			break;

		case 4:

			if (number.charAt(0) == '1') {

				if (number.charAt(1) == '0') {

					if (number.charAt(2) == '0') {

						if (number.charAt(3) == '0') {

							result = "mille";
						} else {

							result = "mille-" + spell(number.charAt(3));
						}
					} else {

						result = "mille-" + spell(number.substring(2));
					}
				} else {

					result = "mille-" + spell(number.substring(1));
				}
			} else {

				result = spell(number.charAt(0)) + "-mille-" + spell(number.substring(1));
			}
		}

		return result;
	}
}