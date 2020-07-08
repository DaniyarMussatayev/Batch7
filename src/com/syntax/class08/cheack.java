package com.syntax.class08;

import java.util.Scanner;

public class cheack {
	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want to buy and the price of
		// that item.
		// Every time user enters money accumulate the amount and tell the user how much
		// is left to pay off.
		// If user give more money program should return a change.When ever a user done
		// with payments program should say"Thank you for shopping!"
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter item");
		String item = scan.nextLine();

		System.out.println("Please enter price");
		int price = scan.nextInt();

		System.out.println("Please insert cash");
		int cash = scan.nextInt();

		while (cash < price) {
			System.out.println("please pay  " + (price - cash));
			int addCash = scan.nextInt();
			cash = cash + addCash;

		}

		if (cash > price) {
			System.out.println("your change is " + (cash - price));
			System.out.println("Thanks");
		} else {
			System.out.println("thanks for shop");
		}

	}
}
