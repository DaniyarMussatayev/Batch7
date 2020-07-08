package com.syntax.class11;

public class LargestInArray {
	public static void main(String[] args) {
		int[] num = { 30, 50, 34, 3423 };
		int largest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (largest < num[i]) {
				largest = num[i];
			}
		}
		System.out.println("The largest number is " + largest);
		System.out.println("----------------");

		int largest1 = num[0];
		for (int num1 : num) {
			if (num1 > largest1) {
				largest1 = num1;
			}

		}
		System.out.println("The largest number is " + largest1);

	}
}
