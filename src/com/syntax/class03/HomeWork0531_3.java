package com.syntax.class03;

import java.util.Scanner;

public class HomeWork0531_3 {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scanner = new Scanner(System.in);

		try {

			double num = scanner.nextDouble();

			if (num % 2 == 0) {
				System.out.println(num + " is even number");
			} else {
				System.out.println(num + " is odd number");
			}
		} catch (Exception e) {
			System.out.println("Invalid input");
		}
		scanner.close();
	}
}
