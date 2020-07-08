package com.syntax.class08;

public class BreakAndContinue {
	public static void main(String[] args) {
		// we are counting from 1 to 10. We want to stop the loop
		// when we reach 4

		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
