package com.syntax.class11;

public class HM5 {
	public static void main(String[] args) {
		// Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		// Print the sum of all numbers.

		int[][] num = { { 1, 2, 4 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum = sum + num[i][j];
			}
		}
		System.out.println(sum);

		System.out.println("=====================================");
		// Create a 2D array of integer type with 3 rows and 4 columns and print all
		// values of the whole array.
		
		int [][] numbers = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for (int a=0; a<numbers.length;a++) {
			for(int b=0; b<numbers[a].length; b++) {
				System.out.print(numbers[a][b] + " ");
			}
		}
		
		

	}
}
