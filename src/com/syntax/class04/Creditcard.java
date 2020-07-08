package com.syntax.class04;

import java.util.Scanner;

public class Creditcard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s?%n", "Do you have a creditcard");
		String answer = scanner.next();

		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Do you want a creditcard?");
		} else if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance of the creditcard?");
			double balance = scanner.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off immediately.");
			} else {
				System.out.println("You can spend more.");
			}
		} else {
			System.out.println("Please enter YES or NO only.");
		}

		System.out.println("Now please enter the number of worked years:");
		double years = scanner.nextDouble();
		System.out.println("Please enter annual salary");
		int salary = scanner.nextInt();

		if (years >= 5) {
			if (salary > 50_000) {
				System.out.println("Your bonus is 5000!");
			} else {
				System.out.println("Your bonus is 3000!");
			}
		} else {
			System.out.println("You are not eligible for a bonus. (");
		}

		scanner.close();

	}

}
