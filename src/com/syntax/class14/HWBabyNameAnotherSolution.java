package com.syntax.class14;

import java.util.Scanner;

public class HWBabyNameAnotherSolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mom's first name?");
		String momName = scan.next();

		System.out.println("Dad's first name?");
		String dadName = scan.next();

		System.out.println("Boy or Girl?");
		String boyOrGirl = scan.next();

		char[] babyName = new char[5];
		int j = 2;

		if (boyOrGirl.equalsIgnoreCase("boy")) {

			for (int i = 0; i < 3; i++) {
				babyName[i] = dadName.charAt(i);
			}
			for (int i = 3; i <= 4; i++) {
				babyName[i] = momName.charAt(momName.length() - j);
				j--;
			}

		} else if (boyOrGirl.equalsIgnoreCase("girl")) {

			for (int i = 0; i < 2; i++) {
				babyName[i] = momName.charAt(i);
			}
			for (int i = 2; i <= 4; i++) {
				babyName[i] = dadName.charAt(dadName.length() - j - 1);
				j--;
			}
		} else {
			System.err.println("Enter boy or girl only!");
		}
		System.out.print("Suggested name is: ");
		for (char name : babyName) {
			System.out.printf("%S", name);
		}
		scan.close();
	}
}
