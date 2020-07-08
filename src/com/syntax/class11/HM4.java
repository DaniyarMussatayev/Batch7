package com.syntax.class11;

public class HM4 {
	public static void main(String[] args) {
		// Create a 2D array that first row will contain 4 names and second row will
		// contain grades.
		// Then you program should print name of the students that has A and B grade

		String[] names = { "Ahmad", "John", "Bob", "Steave" };
		String[] grade = { "A", "B", "C", "D", "E", "F" };

		System.out.println(names[0] + " has a grade " + grade[0]);
		System.out.println(names[1] + " has a grade " + grade[1]);

		System.out.println("============================================");
		// Create a 2D array or integer type where you will store odd and even numbers
		// in 3 rows and 4 columns. Develop a program which will identify/print the even
		// numbers only.

		int[][] numbers = { { 2, 5, 7, 90 }, 
				{ 12, 51, 54, 20 }, 
				{ 14, 1, 2, 6 }
				};
		
		for (int i = 0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				if (numbers[i][j]%2==0) {
					System.out.print(numbers[i][j] + " ");
				}
				
			}System.out.println();
			
		}

	}
}
