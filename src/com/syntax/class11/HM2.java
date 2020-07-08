package com.syntax.class11;

public class HM2 {
	public static void main(String[] args) {
		// Create an array of countries: north america countries, south america
		// countries
		// europe countries, asian countries, african countries.
		// Then print all values from that array using 2 different loops and calculate
		// how many
		// total countries been stored.
		String[][] countries = { { "USA", "Canada" }, { "Brazil", "Columbia" }, { "Germany", "France" },
				{ "China", "Turkey" }, };

		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {
				System.out.print(countries[row][col] + " ");
			}
			System.out.println();

			System.out.println("==========2 way=============");

			for (String[] print : countries) {
				for (String print1 : print) {
					System.out.print(print1 + " ");
				}
				System.out.println();
			}
		}
		int i = countries.length;
		int j = countries[0].length;
		int total = i * j;
		System.out.println("The total countries in array is " + total);

	}

}
