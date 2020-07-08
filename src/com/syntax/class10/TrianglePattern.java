package com.syntax.class10;

public class TrianglePattern {
	public static void main(String[] args) {
		// lets print the following triangle
		// *
		// **
		// ***
		// ****
		// *****

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= 5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		for (int x = 1; x <= 5; x++) {

			for (int c = 1; c <= x; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int x = 4; x >= 1; x--) {

			for (int c = x; c >= 1; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
