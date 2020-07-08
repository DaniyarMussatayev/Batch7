package com.syntax.class06;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 numbers:");

		try {

			double num1 = scanner.nextDouble();
			double num2 = scanner.nextDouble();

			System.out.println("What do you want to do: +, -, * or /");
			String operator = scanner.next();
			double result = 0;

			switch (operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			default:
				System.out.println("Invalid operator.");

			}

			if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
				System.out.printf("The result is %.2f", result);
			}

		} catch (Exception e) {

			System.out.println("Invalid input");
		}
		scanner.close();
	}

}
