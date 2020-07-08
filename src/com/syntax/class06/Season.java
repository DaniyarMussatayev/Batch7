package com.syntax.class06;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month:");
		String month = scanner.next();
		String season = null;

		switch (month.toLowerCase()) {
		case "january":
		case "february":
		case "december":
			season = "winter";
			break;
		case "april":
		case "march":
		case "may":
			season = "spring";
			break;
		case "june":
		case "july":
		case "august":
			season = "summer";
			break;
		case "september":
		case "october":
		case "november":
			season = "autumn";
			break;
		default:
			season = "unknown";

		}
		System.out.println("The season is " + season);

	}

}
