package com.syntax.class11;

public class HM3 {
	public static void main(String[] args) {
		// Create a 2D array where you will store the following values:
		// Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama. After storing values
		// print the following:Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String[] call = { "Mrs", "Mr", "Ms", "Miss" };

		String[] names = { "Smith", "Obama", "Jackson", "Jordan" };

		for (int i = 0; i < call.length; i++) {
			System.out.println(call[i] + " " + names[i]);

		}

	}
}
