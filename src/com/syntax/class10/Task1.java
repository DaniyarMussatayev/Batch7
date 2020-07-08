package com.syntax.class10;

public class Task1 {
	public static void main(String[] args) {

		// please print the following pattern
		// 55555
		// 4444
		// 333
		// 22
		// 1
		for (int r = 5; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("---------------");
		// please print the following pattern
		// 54321
		// 4321
		// 321
		// 21
		// 1
		for (int a = 5; a >= 1; a--) {
			for (int b = a; b >= 1; b--) {
				System.out.print(b);

			}
			System.out.println();
		}
		System.out.println("---------------");
		// 1
		// 21
		// 321
		// 4321
		// 54321
		// 4321
		// 321
		// 21
		// 1

		for (int k = 1; k <= 5; k++) {
			for (int m = k; m >= 1; m--) {
				System.out.print(m);

			}
			System.out.println();
		}

		for (int k = 4; k >= 1; k--) {
			for (int m = k; m >= 1; m--) {
				System.out.print(m);

			}
			System.out.println();
		}

	}

}
