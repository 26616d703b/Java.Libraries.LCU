package com.ampersand.lcu.algorithms.counting;

public final class WordCounter {

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	public static int countOccurences(String text, String word) {

		int j = 0;
		int occurences = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == word.charAt(j)) {

				j++;

				if (j == word.length()) {

					j = 0;

					if (i - word.length() + 1 == 0 && text.charAt(i + 1) == ' '
							|| i + 1 == text.length()
									&& (text.charAt(i - word.length()) == ' ' || text.charAt(i - word.length()) == '\'')
							|| (text.charAt(i - word.length()) == ' ' || text.charAt(i - word.length()) == '\'')
									&& text.charAt(i + 1) == ' ') {

						occurences++;
					}
				}
			} else {

				j = 0;
			}
		}

		return occurences;
	}
}
