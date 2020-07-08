package com.syntax.class07;

public class HM3 {
	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)

		// 1st way
		int x = 20;
		while (x > 1) {
			if (x % 2 == 0) {
				System.out.println(x);
			}
			x--;
		}
		System.out.println("_____________________________________________________________");
		// 2nd way
		int y = 21;
		do {
			y--;
			System.out.println(y);
			y--;
		} while (y > 1);

	}
}
