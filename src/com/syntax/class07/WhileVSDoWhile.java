package com.syntax.class07;

public class WhileVSDoWhile {
	public static void main(String[] args) {
		// print hello 5 times

		int x = 1;
		while (x <= 3) { // check before going into the loop
			System.out.println("hello");
			x++;
		}

		System.out.println("----------USING DO WHILE LOOP------------");
		int y = 1;
		do {
			System.out.println("hello");
			y++;
		} while (y <= 3); // checks after going into the loop
	}

}
