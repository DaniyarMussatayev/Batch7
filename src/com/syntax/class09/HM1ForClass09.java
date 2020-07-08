package com.syntax.class09;

public class HM1ForClass09 {
	public static void main(String[] args) {
		// Print the following pattern:
		// 54321
		// 54321
		// 54321
		// 54321
		for (int row = 1; row <= 4; row++) {
			for (int col = 5; col >= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
