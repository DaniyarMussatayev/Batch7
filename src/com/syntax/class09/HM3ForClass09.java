package com.syntax.class09;

public class HM3ForClass09 {
	public static void main(String[] args) {
		// Print the following pattern:
		// 55555
		// 4444
		// 333
		// 22
		// 1

		for (int row = 5; row >= 1; row--) {
			for (int col = row; col >= 1; col--) {
				System.out.print(row);
			}
			System.out.println();
		}

		System.out.println("________________________________________________________________________________________");

		/// Print the following pattern:
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {

				System.out.print("*");

			}
			System.out.println("");
		}

	}
}
