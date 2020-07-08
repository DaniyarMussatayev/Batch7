package com.syntax.class14;

import java.util.Scanner;

public class HWBabyName_v2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mom's first name?");
		String momName = scan.next();

		System.out.println("Dad's first name?");
		String dadName = scan.next();

		System.out.println("Boy or Girl?");
		String boyOrGirl = scan.next();
		
		String babyName = null;
		
		if (boyOrGirl.toLowerCase().equals("boy")) {
			babyName = dadName.substring(0, dadName.length() / 2) + momName.substring(momName.length() / 2);
		} else if (boyOrGirl.equalsIgnoreCase("girl")) {
			babyName = momName.substring(0, momName.length() / 2) + dadName.substring(dadName.length() / 2);
		} else {
			System.err.println("Please enter boy or girl only!");
		}
		System.out.println("Suggested name is: " + babyName.toUpperCase());
	}
}
