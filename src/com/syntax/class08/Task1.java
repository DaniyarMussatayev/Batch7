package com.syntax.class08;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// Print numbers from 1 to 50
		// Skip number that are divisible 3

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

		// Create a program that will be asking user to apply for a credit card 10
		// times.
		// As soon you get an “yes” from a user program should stop asking.
		Scanner scan = new Scanner(System.in);
		Boolean user;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Please apply for credit card");

			user = scan.nextBoolean();
			if (user) {
				user = true;
				break;
			}
		}
	}
}
