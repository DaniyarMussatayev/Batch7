package com.syntax.class02;

public class HW {
	public static void main(String[] args) {
		//Write a Java program to add, subtract, multiply and divide 2 decimal values
				//Your program should say. "The _______ of 2 numbers ___ and ___ is equal to _____"
				double num1 = 6.3;
				double num2 = 4.4;
				
				double sub = num1 - num2;
				double mult = num1 * num2;
				double div = num1 / num2;
				
				System.out.println("The subtract of 2 numbers " + num1 + " " + "and " + num2 +" " + "is equal to " + sub );
				System.out.println("The multiply of 2 numbers " + num1 + " " + "and " + num2 +" " + "is equal to " + mult );
				System.out.println("The divide of 2 numbers " + num1 + " " + "and " + num2 +" " + "is equal to " + div );
				System.out.println("***************************");
				
				//Write a program to find the square of the number 3.9.
				//You program should say "The square of the ____ is ____ "
				
				double num = 3.9;
				double squareOfnum = 3.9 * 3.9;
				System.out.println("The square of the " + num + " " + "is " + squareOfnum); 
				System.out.println("***************************");
				
				//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
				//Your program should say. "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"
				
				int width = 5;
				int height = 8;
				System.out.println("The perimeter of a rectangle with width " + width + " " + "and height " + 
				height +" " + "is equal to " + (width*2 + height*2) + " " + "and the area is " + (width*height));
				
		}
}
