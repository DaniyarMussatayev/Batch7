package com.syntax.class05;

import java.util.Scanner;

public class Task1Byme {
	public static void main(String[] args) {
		// Prompt the user to enter person heights in inches.
		// Person should be classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you height in inches");
		int num1 = scan.nextInt();
		if (num1 < 60) {
			System.out.println("you are a small");
		} else if (num1 >= 60 && num1 <= 72) {
			System.out.println("you are short");
		} else if (num1 > 72) {
			System.out.println("You are tall");
		} else {
			System.out.println("invalid number");
		}
	}

}
