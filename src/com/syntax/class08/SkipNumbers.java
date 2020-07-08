package com.syntax.class08;

public class SkipNumbers {
	public static void main(String[] args) {
		// I want to print from 1 to 10, but I want to skip 5, 6 and 7
		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}
		
		// we want to print numbers from 1 to 100
		// but want to skip number between 35 anf 55
		
		for (int i = 1; i <= 100; i++) {
			if (i >= 35 && i <= 55) {
				continue;
			}
			System.out.println(i);
		}
	}

}
