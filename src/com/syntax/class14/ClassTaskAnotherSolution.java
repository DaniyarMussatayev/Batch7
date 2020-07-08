package com.syntax.class14;

import java.util.Scanner;

import javax.xml.transform.Source;

public class ClassTaskAnotherSolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean ask = true;
		int attempt = 0;

		do {
			attempt++;
			System.out.printf("It is your %d attempt.%nPlease enter Username%n", attempt);
			String username = scan.nextLine();
			System.out.println("Please enter password");
			String password = scan.nextLine();

			if (username.isEmpty() || password.isEmpty()) {
				System.out.println("Username or Password cannot be empty. Please try again.");
			} else {

				if (password.length() >= 8) {
					if (!password.contains(username)) {
						System.out.println("Please confirm your password");
						String confirmedPwd = scan.nextLine();

						if (password.equals(confirmedPwd)) {
							System.out.printf("Username %s and Password has been created", username);
							ask = false;
						} else {
							System.out.println("Passwords do not match. Please try again.");
						}
					} else {
						System.out.println("Password cannot contain username. Please try again");
					}
				} else {
					System.out.println("Password is too short. Please try again.");
				}
			}
		} while (ask);

		scan.close();

	}

}
