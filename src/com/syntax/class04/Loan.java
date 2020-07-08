package com.syntax.class04;

import java.util.Scanner;

public class Loan {
	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan
		// is needed.
		// If loan is less or equal to 200,000 then you would lend the money otherwise
		// you would reject the client.

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the amount of loan is needed");
		int num1 = scan.nextInt();
		if (num1 <= 200000) {
			System.out.println("I lend the money to user");
		} else {
			System.out.println("Request rejected");
		}
	}

}
