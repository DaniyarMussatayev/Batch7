package com.syntax.class06;

import java.util.Scanner;

public class HM2 {
	// Using scanner class create calculator.
	// Allow user to enter 2 numbers and operator(+,-,*,/).
	// Based on operator provide the result to user.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0;

		System.out.println("Please enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Please enter operator(+,-,*,/)");
		char operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;
			System.out.println("invalid operation");
			break;
		}
		System.out.println("Your result is " + result);
	}
}
