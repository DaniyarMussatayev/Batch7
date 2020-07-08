package com.syntax.class16;

public class DifferentMethods {
	// lets create method that says hello 10 times

	void sayHello(int times) {

		for (int i = 0; i < times; i++) {
			System.out.println("Hello");
		}
	}

	// create method that will print any word any number of times

	void print(String word, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}

	// create a method isHungry which accepts boolean value and prints

	void isHungry(boolean isHungry) {

		if (isHungry) {
			System.out.println("Go cook");
		} else {
			System.out.println("Go study");
		}
	}

	void math(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is larger");
		} else {
			System.out.println(num2 + " is larger");
		}
	}

	void checkNum(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is an even");
		} else {
			System.out.println(num + " is an odd");
		}
	}

	void palindrome(String word) {

		String reverseWord = "";
		for (int i = 0; i < word.length(); i++) {
			reverseWord += word.charAt(i);
		}
		if (word.equalsIgnoreCase(reverseWord)) {
			System.out.println(word + " is palindrome word");
		} else {
			System.out.println(word + " is not a palindrome word");
		}

	}

	void printHello(String language) {

		language = language.toLowerCase();
		switch (language) {

		case "russian":
			System.out.println("Privet");
			break;
		case "kyrgyz":
			System.out.println("salam");
			break;
		default:
			System.out.println("Hello");
			break;
		}
	}

}
