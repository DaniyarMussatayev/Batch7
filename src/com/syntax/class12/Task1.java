package com.syntax.class12;

public class Task1 {
	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		int a = 20;
		int b = 30;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("it's a " + a);
		System.out.println("it's b " + b);
		
		System.out.println("--------------------------------------------------");
		
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int term1=0;
		int term2=1;
		
		
		for (int num=0; num<=10;num++) {
			System.out.print(term1 + " ");
			int sum =term1 +term2;
			term1=term2;
			term2=sum;
		}

			
			
				
			}
}
