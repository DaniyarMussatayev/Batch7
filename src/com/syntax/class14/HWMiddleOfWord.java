package com.syntax.class14;

import java.util.Scanner;

public class HWMiddleOfWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please enter any word%n");
		String word = scan.next();

		int length = word.length();

		if (length >= 3 && length % 2 != 0) {
			System.out.printf("The character in the middle of %S is %S%n", word, word.charAt(length / 2));
		} else {
			System.err.printf("Number of characters inside %S is even or less then 3", word);
		}
		scan.close();
	}

}
