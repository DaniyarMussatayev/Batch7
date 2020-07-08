package com.syntax.class07;

public class IncrementDecrement {
	public static void main(String[] args) {
		int x = 10;
		x = x + 1;
		x += 1;
		//another way to add 1 into the variable
		x++; //post increment
		++x; //pre increment
		System.out.println(x);
		
		int y = 50;
		y = y - 1;
		y -= 1;
		y--;
		System.out.println(y);
		System.out.println(y--);
		System.out.println(--y);
		int z = 5;
		if (++z == 6) {
			System.out.println("Hi there");
		} else {
			System.out.println("Error");
		}
		
		int a = 5;
		System.out.println(a);
		
	}

}
