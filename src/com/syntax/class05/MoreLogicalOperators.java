package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		int day = 3;

		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("JAVA class");
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else if (day == 3) {
			System.out.println("Review class");
		} else {
			System.out.println("Invalid input");
		}
		
		System.out.println("--------------------------");
		// To compare the equality of 2 String we use .equals()
		
		String day2 = "Tuesday";
		
		if (day2.equalsIgnoreCase("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLC class");
		} else if (day2.equals("Saturday") || day2.equals("Sunday")) {
			System.out.println("JAVA Class");
		} else {
			System.out.println("Not implemented");
		}

	}

}
