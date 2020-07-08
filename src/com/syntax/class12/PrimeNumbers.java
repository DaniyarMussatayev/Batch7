package com.syntax.class12;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input any number");

		try {
			int num = scan.nextInt();
			String result = null;
			if (num <= 1) {
				result = "not a prime number";
			} else if (num == 2) {
				result = "a prime number";
			} else {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						result = "not a prime number";
						break;
					} else {
						result = "a prime number";
					}
				}
			}
			System.out.printf("%d is %s", num, result);
		} catch (Exception e) {
			System.err.println("Please enter numbers only!");
		}

		scan.close();

	}

}
