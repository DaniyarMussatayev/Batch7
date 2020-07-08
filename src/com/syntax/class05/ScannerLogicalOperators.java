package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age:");
		int age = scan.nextInt();
		System.out.println(Integer.MAX_VALUE);

		if (age >= 0 && age <= 3) {
			System.out.println("You are a baby");
		} else if (age >= 4 && age == 5) {
			System.out.println("You are a kid");
		} else if (age >= 6 && age <= 12) {
			System.out.println("You are a child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are a teenager");
		} else if (age >= 20 && age <= 64) {
			System.out.println("You are an adult");
		} else if (age >= 65) {
			System.out.println("Enjoy life");
		} else {
			System.out.println("Ibvalid input");
		}
	}

}
