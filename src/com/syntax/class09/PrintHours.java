package com.syntax.class09;

public class PrintHours {
	public static void main(String[] args) {
		// Let us print the clock
		// 0:00
		// 0:01
		// 1:00
		// 23:59

		for (int x = 0; x <= 23; x++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(x + ":0" + j);
			}
			for (int k = 10; k <= 59; k++) {
				System.out.println(x + ":" + k);
			}
		}

	}

}
