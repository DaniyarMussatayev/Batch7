package com.syntax.class10;

public class DollarMagic {
	public static void main(String[] args) {
		for (int r = 1; r <= 5; r++) { // the outer loop controls the rows

			for (int c = 1; c <= 4; c++) {
				if (r == 1 || r == 5) {
					System.out.print("$");
				} else {
					if (c == 1 || c == 4) {
						System.out.print("$");
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}
	}
// HW re-do this task without using nested if
// Hint you should use logical && + ||
}
