package com.syntax.class05;

import java.util.Scanner;

public class HWTask1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%S:%n", "please enter 3 numbers in a row");

		try {

			double num1 = scanner.nextDouble();
			double num2 = scanner.nextDouble();
			double num3 = scanner.nextDouble();

			if (num1 > num2 && num1 > num3) {
				System.out.printf("The largest numbers is %.2f.", num1);
			} else if (num2 > num1 && num2 > num3) {
				System.out.printf("The largest number is %.2f.", num2);
			} else if (num1 == num2 || num2 == num3 || num1 == num3) {
				System.out.print("Numbers should be distinct!");
			} else {
				System.out.printf("The largest number is %.2f.%n", num3);

			}

			System.out.print("\n--------------SECOND TASK--------------\n\n");

			if (num1 > num2) {
				if (num1 > num3) {
					System.out.printf("The largest number is %.2f.%n", num1);
				} else {
					System.out.printf("The largest number is %.2f.%n", num3);
				}
			} else if (num1 < num2) {
				if (num2 > num3) {
					System.out.printf("The largest number is %.2f.%n", num2);
				} else {
					System.out.printf("The largest number is %.2f.%n", num3);
				}
			} else if (num1 == num2 || num2 == num3 || num1 == num3) {
				System.out.print("Numbers should be distinct!");
			}

		} catch (Exception e) {
			System.out.println("Invalid input. Please enter numbers only.");
		}

		scanner.close();

	}

}
