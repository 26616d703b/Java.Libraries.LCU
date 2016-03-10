package com.ampersand.lcu.algorithms.sorting;

public final class NumberSorter {

	/*
	 * Methods
	 */

	// IMPLEMENTED METHODS

	// ----------------------------------------------------[ C
	// ]----------------------------------------------------//

	public static void compare(int[] tab, char sign) {

		display(selectionSort(tab), sign);
	}

	// ----------------------------------------------------[ D
	// ]----------------------------------------------------//

	public static void display(int[] tab, char sign) {

		if (sign == '<') {

			for (int i = 0; i < tab.length - 1; i++) {

				System.out.print(tab[i] + " < ");
			}

			System.out.print(tab[tab.length - 1]);
		} else {

			for (int i = tab.length - 1; i > 0; i--) {

				System.out.print(tab[i] + " > ");
			}

			System.out.print(tab[0]);
		}
	}

	// ----------------------------------------------------[ S
	// ]----------------------------------------------------//

	public static int[] selectionSort(int[] tab) {

		int length = tab.length;

		while (length > 0) {

			int max = 0;

			for (int i = 1; i < length; i++) {

				if (tab[i] > tab[max]) {

					max = i;
				}

				final int temp = tab[max];
				tab[max] = tab[length - 1];
				tab[length - 1] = temp;
			}

			length--;
		}

		return tab;
	}
}
