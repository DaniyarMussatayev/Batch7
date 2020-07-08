package com.syntax.class06;

import java.util.Scanner;

public class HM1 {
	// Allow user to enter grade and then provide explanation:
	// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
	// At the end your program should print which grade was entered by a user with
	// explanation.
	public static void main(String[] args) {
		System.out.println("Please enter your grade");
		Scanner scan = new Scanner(System.in);
		String grade = scan.nextLine();
		String exp;

		switch (grade) {
		case "A":
			exp = "Excellent";
			break;
		case "B":
			exp = "Good";
			break;
		case "C":
			exp = "Average";
			break;
		case "D":
			exp = "Bad";
			break;
		default:
			exp = " Not Acceptable";
			break;
		}
		System.out.println("You are entered " + grade + " and it's " + exp);
	}
}
