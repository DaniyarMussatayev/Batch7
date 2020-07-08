package com.syntax.class14;

import java.util.Scanner;

public class HWBabyName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mom's first name?");
		String momName = scan.next();

		System.out.println("Dad's first name?");
		String dadName = scan.next();

		System.out.println("Boy or Girl?");
		String boyOrGirl = scan.next();

		System.out.print("Suggested name is: ");

		if (boyOrGirl.equalsIgnoreCase("boy")) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("%S", dadName.charAt(i));
			}
			for (int i = 2; i >= 1; i--) {
				System.out.printf("%S", momName.charAt(momName.length() - i));
			}
		} else if (boyOrGirl.equalsIgnoreCase("girl")) {
			for (int i = 0; i < 2; i++) {
				System.out.printf("%S", momName.charAt(i));
			}
			for (int i = 3; i >= 1; i--) {
				System.out.printf("%S", dadName.charAt(dadName.length() - i));
			}
		} else {
			System.err.println("Enter Boy or Girl only please!");
		}

		scan.close();
	}

}
