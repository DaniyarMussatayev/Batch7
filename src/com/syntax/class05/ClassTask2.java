package com.syntax.class05;

import java.util.Scanner;

public class ClassTask2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a day number:");
		int day = scanner.nextInt();

		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid input");
		}
	}

}
