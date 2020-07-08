package com.syntax.class06;

import java.util.Scanner;

public class ClassTaskSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your country:");
		String language = scanner.next();

		switch (language.toLowerCase()) {
		case "usa":
		case "england":
		case "australia":
		case "britain":
			language = "English";
			break;
		case "russia":
			language = "Russian";
			break;
		case "kyrgyzstan":
			language = "Kyrgyz";
			break;
		default:
			language = "unknown";
			break;
		}
		System.out.println("Your language is " + language);

		scanner.close();

	}

}
