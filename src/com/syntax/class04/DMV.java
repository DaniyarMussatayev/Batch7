package com.syntax.class04;

import java.util.Scanner;

public class DMV {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s:%n", "Please enter your age");

		try {

			int age = scanner.nextInt();

			if (age >= 18) {
				System.out.println("Your driving licence will be issued!");
			} else {
				System.out.println("Please get a leraners permit first.");
			}
		}

		catch (Exception e) {
			System.out.println("Invalid input. Enter whole numbers only.");
		}
		scanner.close();
	}

}
