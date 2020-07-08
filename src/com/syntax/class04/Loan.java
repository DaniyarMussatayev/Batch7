package com.syntax.class04;

import java.util.Scanner;

public class Loan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%S:%n", "please enter amount of loan you need");

		try {

			int amount = scanner.nextInt();
			if (amount <= 200_000) {
				System.out.printf("%s", "Your loan is approved!");
			} else {
				System.out.printf("%s", "Sorry, your loan is not approved.");
			}
		}

		catch (Exception e) {
			System.out.println("Invalid input. Please enter whole numbers only.");
		}

		scanner.close();
	}

}
