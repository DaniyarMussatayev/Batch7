package com.syntax.class07;

import java.util.Scanner;

public class HM5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// We are playing a lottery game and the lucky number is 17;
		// We want to keep asking the user to enter any numbers from 1-20;
		// until he guesses the lucky number --> In that case we print "Congrats, you
		// won!"
//		int num = 1;

//		while (num <= 20) {
//			if (num >= 1 && num <= 20) {
//
//				System.out.println("Please enter number from 1 to 20");
//				num = scan.nextInt();
//				if (num >= 1 && num <= 20 && num == 17) {
//					System.out.println("Congrats, you won!");
//				} else {
//					System.out.println("Please try again");
//					break;
//				}
//			}System.out.println("Please try again and enter number only from 1 to 20");
//			num++;
//		}

		for (long i = 1;; i++) {
			System.out.println("Please enter number from 1 to 20");
			i = scan.nextInt();
			if (i >= 1 && i <= 20) {
				if (i == 17) {
					System.out.println("You won lottery");
					break;
				} else {
					System.out.println("Try again");

				}
			} else {
				System.out.println("Please enter number ONLY from 1 to 20");
			}

		}

	}
}
