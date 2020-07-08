package com.syntax.class07;

public class HM4 {
	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)

		// 1st way
		int x = 20;
		while (x <= 50) {
			if (x % 2 == 1) {
				System.out.println(x);
			}
			x++;
		}
		System.out.println("-------------------------------------------------");
		// 2nd way
		int y = 20;
		do {
			if (y % 2 == 1) {
				System.out.println(y);
			}
			y++;
		} while (y <= 50);
	}
}