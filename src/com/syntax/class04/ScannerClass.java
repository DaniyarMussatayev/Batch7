package com.syntax.class04;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		int a = 54;
		String s = "bla";
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		System.out.println("-------------------");
		System.out.println(text);
		
		System.out.printf("%S%n", "enter age:");
		int age = scan.nextInt();
		System.out.println("The age that you entered is " + age);
	}

}
