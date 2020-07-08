package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a > b) {
			System.out.println(a + " is bigger than " + b);
		} else if (a < b) {
			System.out.println(b + " is bigger");
		} else {
			System.out.println("They are equal");
		}
		scanner.close();
	}
}
