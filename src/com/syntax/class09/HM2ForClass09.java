package com.syntax.class09;

public class HM2ForClass09 {
	public static void main(String[] args) {
		// print
		// 5555
		// 4444
		// 3333
		// 2222
		// 1111

		for (int row = 5; row >= 1; row--) {
			for (int col = 5; col >= 1; col--) {
				System.out.print(row);
			}
			System.out.println();
		}
	}
}
