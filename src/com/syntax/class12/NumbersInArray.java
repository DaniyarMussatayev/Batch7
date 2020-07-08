package com.syntax.class12;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int numQuantity = scan.nextInt();
		int[] array = new int[numQuantity];

		System.out.println("Please enter numbers");
		for (int i = 0; i < numQuantity; i++) {
			int nums = scan.nextInt();
			array[i] = nums;
		}

		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {

		}
		System.out.printf("Max value is %d and the min is %d%n", max, min);
		Arrays.sort(array);
		for (int nums : array) {
			System.out.print(nums + " ");
		}
		System.out.printf("%nThe second largest value is %d", array[array.length - 2]);
		scan.close();

	}

}
