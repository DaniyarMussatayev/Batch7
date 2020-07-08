package com.syntax.class08;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Do you want apply for a credit card?");
			String answer = scanner.next();

			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Thank you!");
				break;
			}
		}
	}

}
