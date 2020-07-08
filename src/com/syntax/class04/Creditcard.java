package com.syntax.class04;

import java.util.Scanner;

public class Creditcard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Create a Java program that will ask if user has a credit card or not.
		// If you user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000, tell them to pay off immediately,
		// otherwise you can tell them that they can spend more.

		System.out.println("Do you have a Credit Card?");
		boolean answer = scan.nextBoolean();
		if (answer == false) {
			System.out.println("Do you want open our Credit Card?");
		} else {
			System.out.println("What is balance on the Credit Card?");
			int amount = scan.nextInt();
			if (amount >= 1000) {
				System.out.println("Pay off immediately");
			} else {
				System.out.println("You can spend more");
			}
		}

	}

}
