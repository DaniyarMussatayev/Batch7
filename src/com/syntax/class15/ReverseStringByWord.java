package com.syntax.class15;

import java.util.Scanner;

public class ReverseStringByWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String[] words = sentence.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

		scan.close();
	}

}
