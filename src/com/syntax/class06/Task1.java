package com.syntax.class06;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Where are you from?");
		String country = scan.nextLine();
		String lan;

		switch (country) {
		case "USA":
		case "England":
		case "Australia":
			lan = "English";
			break;

		case "Russia":
			lan = "Russian";
			break;

		case "France":
			lan = "French";
			break;

		default:
			lan = "unknow";
		}
		System.out.println("Your language is " + lan);

	}

}
