package com.syntax.class11;

public class HW4_5 {
	public static void main(String[] args) {
		System.out.println("----HW 4----");
		int[][] arrays = { { 10, 58, 48 }, { 489, 147, 652 }, { 10, 236, 147 } };
		int sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				sum += arrays[i][j];
			}
		}
		System.out.printf("The sum of the arrays is %d", sum);
		System.out.println();
		System.out.println("----HW 5----");

		int[][] nums = { { 10, 254, 12, 15 }, { 54, 47, 65, 84 }, { 95, 74, 41, 52 } };
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%d ", nums[i][j]);
			}
			System.out.println();
		}
	}
}
