package com.syntax.class05;

import java.util.Scanner;

public class HWUsingArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%S?%n", "how many numbers would you like to enter");

		try {
			int quantityOfNum = scanner.nextInt();
			System.out.println("Now please enter numbers:");
			double[] array = new double[quantityOfNum];

			for (int i = 0; i < array.length; i++) {
				double numbers = scanner.nextDouble();
				array[i] = numbers;
			}
			double maxOfArray = array[0];

			for (int i = 0; i < array.length - 1; i++) {
				if (maxOfArray <= array[i + 1]) {
					maxOfArray = array[i + 1];
				}
			}
			System.out.println(maxOfArray);

		} catch (Exception e) {
			System.out.println("Invalid input. Please enter numbers only.");
		}

		scanner.close();

	}

}
