package com.syntax.class06;

import java.util.Scanner;

public class HW1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the grade");
		String grade = scanner.next();
		String result;

		switch (grade.toLowerCase()) {
		case "a":
			result = "Excellent";
			break;
		case "b":
			result = "Good";
			break;
		case "c":
			result = "Average";
			break;
		case "d":
			result = "Bad";
			break;
		default:
			result = "Not Acceptable";
			break;

		}
		System.out.printf("%S-%s", grade, result);
		scanner.close();

	}
}
