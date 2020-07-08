package com.syntax.class05;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Write a program that will print whether it is a weekend or weekday.
		// If any day from 1-5 → output "It is a weekday",
		// anyday from 6-7 → output "It is a weekend", any other day → output "Invalid
		// day"
		System.out.println("please enter a day from 1-7");
		int day = scan.nextInt();

		if (day >= 1 && day <= 5) {
			System.out.println("it's weekday");
		} else if (day >= 6 && day <= 7) {
			System.out.println("it's weekend");
		} else {
			System.out.println("invalid enter");
		}

	}
}
