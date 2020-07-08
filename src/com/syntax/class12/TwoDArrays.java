
package com.syntax.class12;

public class TwoDArrays {
	public static void main(String[] args) {
		String[][] animals = {
				{"cat", "dog", "bird", "hamster"}, //1st array
				{"tiger", "children", "bear"},     //2nd array
				
		};
		int howManyArrays = animals.length;
		System.out.println(howManyArrays);
		int element1Array = animals[1].length;
		
		String element = animals[1][1];
		System.out.println(element);
		
		// how to get all elements from 2D array
		
		for (int r = 0; r < animals.length; r++) { // loops over rows or 1D arrays
			for (int c = 0; c < animals[r].length; c++) {
				System.out.println(animals[r][c]);
			}
		}
		System.out.println("****USING ENHANCED FOR LOOP***************");
		for(String[] array:animals) {
			for (String animal:array) {
				System.out.println(animal);
			}
		}
		
	}

}
