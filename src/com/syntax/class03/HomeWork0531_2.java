package com.syntax.class03;

import java.util.Scanner;

public class HomeWork0531_2 {
	public static void main(String[] args) {

		System.out.println("Enter any number");
		Scanner scanner = new Scanner(System.in);

		try {

			double num = scanner.nextDouble();

			if (num >= 0) {
				System.out.println("Number is positive");
			} else {
				System.out.println("Number is negative");
			}
		} catch (Exception e) {
			System.out.println("Invalid input");
		}
		scanner.close();
	}
}
