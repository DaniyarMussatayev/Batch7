package com.syntax.class07;

public class HW1 {
	public static void main(String[] args) {
		// Print numbers from 1 to 100 in 1 line with space

		// 1 way
		System.out.println("\n-------1nd way WHILE-----\n");
		int num = 1;

		while (num <= 100) {
			System.out.print(num + " ");
			num++;

		}
		// 2nd way
		System.out.println("\n-------2nd way DO WHILE-----\n");

		num = 1;

		do {
			System.out.print(num + " ");
			num++;
		} while (num <= 100);

		// 3rd way
		System.out.println("\n-------3nd way FOR-----\n");

		for (num = 1; num <= 100; num++) {
			System.out.print(num + " ");
		}

	}

}
