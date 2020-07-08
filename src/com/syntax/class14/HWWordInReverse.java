package com.syntax.class14;

import java.util.Scanner;

public class HWWordInReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word");
		String word = scan.next();
		System.out.printf("The %s in reverse would be: ", word);
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(word.length() - 1 - i));
		}

		scan.close();
	}

}
