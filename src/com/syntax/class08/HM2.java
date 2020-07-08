package com.syntax.class08;

import java.util.Scanner;

public class HM2 {
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

		int remeinder = 0;
		int lack = 0;

		while (cash != price) {
			if (cash < price) {
				lack = price - cash;
				System.out.println("Please insert cash " + lack);
				cash = scan.nextInt();
				remeinder = remeinder + cash;
				if (remeinder != lack) {
					System.out.println("Please insert cash " + (lack - remeinder));
					price = scan.nextInt();
					if (cash != lack) {
						System.out.println("Unfrotunally you don't have enough money for " + item
								+ " and please take your cash back your");
					}

				} else {
					System.out.println("Thanks, take your " + item);
					break;
				}

			} else {
				System.out.println("Please take your exchange " + (cash - price));
				break;
			}

		}
		System.out.println("Thanks for shopping");

	}

}
