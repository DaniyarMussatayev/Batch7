package com.syntax.class11;

public class Recap {
	public static void main(String[] args) {
		int[] grades = new int[5];
		grades[4] = 90;
		int sizeOfArrau = grades.length;
		System.out.println(sizeOfArrau);
		char[] charArray = new char[5];
		System.out.println(charArray[1]);
		
		System.out.println("----------------");
		String[] cities = {"Fairfax", "Kiev", "Tampa", "Washington", "Arlington", "NYC", "Lorton", "Chicago"};
		System.out.println("I live in " + cities[2]);
		int i = 1;
		System.out.println("I live in " + cities[i]);
		i += 2;
		System.out.println("I live in " + cities[i]);
		int cityLength = cities.length;
		System.out.println("Total number of cities is " + cityLength);
		System.out.println("The last city in the list is " + cities[cityLength - 1]);
		// I want to print all cities
		for (int y = 0; y < cities.length; y++) {
			System.out.println(cities[y]);
		}
		
		int[] grades1 = new int[5];
		grades1[0] = 90;
		grades1[1] = 85;
		grades1[2] = 92;
		grades1[3] = 75;
		grades1[4] = 100;
		
		int total = 0;
		for (int k = 0; k < grades1.length; k++) {
			total += grades1[k];
		}
		System.out.println("Class aberage is " + total / grades1.length);
	}		
}
