package com.syntax.class02;

public class HomeWork_0530 {
	public static void main(String[] args) {
		double num1 = 23.453;
		double num2 = 42.65;
		System.out.println("The sum of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 + num2));
		System.out.println("The subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 - num2));
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + num1 * num2);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + num1 / num2);	
		System.out.println("--------------------------");
		
		double num3 = 3.9;
		System.out.println("The square of the " + num3 + " is " + (num3 * num3));
		double square = Math.pow(num3, 2);
		System.out.println("The square of the " + num3 + " is " + square);
		
		System.out.println("--------------------------");
		
		int width = 5, height = 8;
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + (width * 2 + height * 2) + " and the area is " + (width * height));
		
	}
}
