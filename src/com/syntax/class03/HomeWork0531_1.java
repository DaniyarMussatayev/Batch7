package com.syntax.class03;

import java.util.Scanner;

public class HomeWork0531_1 {
	public static void main(String[] args) {
		System.out.println("Enter month number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String phrase = "It is ";

		if (num == 1) {
			System.out.println(phrase + "January");
		} else if (num == 2) {
			System.out.println(phrase + "February");
		} else if (num == 3) {
			System.out.println(phrase + "March");
		} else if (num == 4) {
			System.out.println(phrase + "April");
		} else if (num == 5) {
			System.out.println(phrase + "May");
		} else if (num == 6) {
			System.out.println(phrase + "June");
		} else if (num == 7) {
			System.out.println(phrase + "July");
		} else if (num == 8) {
			System.out.println(phrase + "August");
		} else if (num == 9) {
			System.out.println(phrase + "September");
		} else if (num == 10) {
			System.out.println(phrase + "October");
		} else if (num == 11) {
			System.out.println(phrase + "November");
		} else if (num == 12) {
			System.out.println(phrase + "December");
		} else {
			System.out.println("Invalid input. Enter number from 1 to 12 only.");
		}
		scanner.close();
	}
}