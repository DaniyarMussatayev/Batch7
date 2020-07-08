package com.syntax.class07;

public class HW2 {
	public static void main(String[] args) {
		// Print even numbers from 20 to 1
		// 1st way
		System.out.print("--------1st way WHILE----------\n");

		int num = 20;
		while (num % 2 == 0 && num >= 2) {
			System.out.print(num + " ");
			num -= 2;
		}
		System.out.print("\n--------2st way DO WHILE----------\n");
		// 2nd way
		num = 20;
		do {
			System.out.print(num + " ");
			num -= 2;
		} while (num >= 2);
	}
}
