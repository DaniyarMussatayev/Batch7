package com.syntax.class16;

public class MethodsWithReturnValue {
	public static void main(String[] args) {
		String str = "I love Java";

		int length = str.length();

		if (length >= 10) {
			System.out.println("created String is long");
		} else {
			System.out.println("Created String is short");
		}

		// define which number is the largest and define whether this largest number is
		// even or odd

		DifferentMethods obj = new DifferentMethods();
		obj.math(10, 20);

	}

	int largest(int num1, int num2) {
		int largest;
		if (num1 > num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		return largest;
	}

}
