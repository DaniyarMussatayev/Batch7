package com.syntax.class14;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username");
		String username = scan.nextLine();

		System.out.println("Please enter the password");
		String passwordFirst = scan.nextLine();

		System.out.println("Please confirm your password");
		String passwordSecond = scan.nextLine();

		if (username.isEmpty() || passwordFirst.isEmpty()) {
			System.err.println("Username and Password cannot be empty");
		} else if (passwordFirst.length() < 8) {
			System.err.println("Password is too short");
		} else if (passwordFirst.contains(username)) {
			System.err.println("Password cannot contain username");
		} else if (!passwordFirst.equals(passwordSecond)) {
			System.err.println("Password do not match");
		} else {
			System.out.println("Your username and password has been created");
		}

		scan.close();

	}

}
