package com.syntax.class07;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int time = 10;

		// will execute 1 time
		if (time < 12) {
			System.out.println("Good morning");
		}
		// will execute infinitely
		while (time < 12) {
			System.out.println("Good morning");
			time++;
		}
		// will never execute
		while (time > 12) {
			System.out.println("Good morning");
		}
		int i = 10;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println("\n-------------------");
		
		

	}

}
