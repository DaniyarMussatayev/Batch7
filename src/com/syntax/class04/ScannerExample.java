package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		System.out.printf("%s:%n", "Please enter the name");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.println("Please enter your age");
		double age = scan.nextDouble();
		System.out.printf("%s %s %s %d", "Your name is", name, "and age is", age);
	}
}
