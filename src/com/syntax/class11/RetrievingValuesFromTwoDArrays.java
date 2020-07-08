package com.syntax.class11;

public class RetrievingValuesFromTwoDArrays {
	public static void main(String[] args) {
		// put the month for each season in 1 row
		String[][] months = { { "December", "January", "February" }, 
							  { "March", "April", "May" },
							  { "June", "July", "August" }, 
							  { "September", "October", "November" } };
		int rows = months.length; // how many rows/arrays are inside
		System.out.println(rows + " seasons");
		int winterLength = months[0].length; // how many elements/columns in the 1st row with index 0
		System.out.println(winterLength + " months in winter/row 0");

		System.out.println(months[months.length - 1].length + " is last row size");
		// nested loops are married to 2D arrays

		for (int row = 0; row < months.length; row++) { // iterating over rows
			for (int columns = 0; columns < months[row].length; columns++) { // iterating over columns
				System.out.print(months[row][columns] + " ");
			}
			System.out.println();
		}

	}
}
