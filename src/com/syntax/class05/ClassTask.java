package com.syntax.class05;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter heights in inches:");
		int heights = scanner.nextInt();

		if (heights < 60) {
			System.out.println("You a short (");
		} else if (heights >= 60 && heights <= 72) {
			System.out.println("You are medium");
		} else if (heights > 72) {
			System.out.println("You are tall");
		} else {
			System.out.println("Invalid input");
		}

	}

}
