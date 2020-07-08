package com.syntax.class10;

public class Task2 {
	public static void main(String[] args) {
		// Create an array of chars and store grades
		// into it: A,B,C,D,E,F.
		// Then print a grade B
		// (use 2 different ways of creating an array).

		// 1 way
		char[] letters = new char[6];
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'E';
		letters[5] = 'F';

		System.out.println(letters[1]);

		// 2 way
		char[] let = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(let[1]);

		System.out.println("----------------");
		// Create an array of names and store all names of your group.
		// Then print your name from that array.
		// (use 2 different ways of creating an array).

		String[] currency = new String[4];
		currency[0] = "USD";
		currency[1] = "EUR";
		currency[2] = "RUB";
		currency[3] = "AED";

		System.out.println(currency[3]);

		// 2 way
		String[] money = { "usd", "eur", "rub", "aed" };
		System.out.println(money[3]);

		System.out.println("----------------");

		// Create an array of words: Java, Saturday, day, coding, is.
		// Print the following sentence using elements of array: “Saturday is Java
		// coding Day”.
		String[] word = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println("" + word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);

	}

}
