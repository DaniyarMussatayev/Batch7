package com.syntax.class04;

import java.util.Scanner;

public class DMV {
	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age.
		// If they are 18 and older you will issue a driver licence to them, otherwise
		// you will offer them to get a learners permit.
		Scanner scan = new Scanner(System.in);

		System.out.println("What is your age?");
		int num1 = scan.nextInt();
		if (num1 >= 18) {
			System.out.println("I'll give driver lincence");
		} else {
			System.out.println("I will offer you to get a learners permit");
		}
	}

}
