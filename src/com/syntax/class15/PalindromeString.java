package com.syntax.class15;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word to check");
		String word = scan.next();
		String reverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		if (reverseWord.equalsIgnoreCase(word)) {
			System.out.printf("%s is palindrome", word);
		} else {
			System.out.printf("%s is not palindrome", word);
		}

		scan.close();
	}

}
