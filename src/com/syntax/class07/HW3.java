package com.syntax.class07;

public class HW3 {
	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		//1st way
		System.out.print("--------1st way WHILE----------\n");

		int num = 21;
		
		while (num >= 21 && num <= 49) {
			System.out.print(num + " ");
			num += 2;
		}
		
		//2nd way
		System.out.print("\n--------2nd way DO WHILE----------\n");
		num = 21;
		
		do {
			System.out.print(num + " ");
			num += 2;
		} while (num <= 49);
	}

}
