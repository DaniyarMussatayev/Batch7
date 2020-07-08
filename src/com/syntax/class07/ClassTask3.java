package com.syntax.class07;

import java.util.Scanner;

public class ClassTask3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 1;
		
		do {
			System.out.println("What is your name?");
			String name = scanner.next();
			System.out.println("Good afternoon " + name);
			x++;
		} while (x <= 5);
		scanner.close();
	}

}
