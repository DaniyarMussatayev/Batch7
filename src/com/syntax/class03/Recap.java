package com.syntax.class03;

import javax.sound.midi.Soundbank;

public class Recap {
	public static void main(String[] args) {
		int num = 10 + 10 * 10;
		System.out.println(num);

		int num2 = (10 + 10) * 10;
		System.out.println(num2);

		int num3 = 10 * 10 + 10 / 10;
		System.out.println(num3);
		System.out.println("*************************");

		int a = 10;
		int b = 20;
		String x = "Java";
		String y = "Sunday";
		System.out.println(a + b + x + y);
		System.out.println(a + x + y + b);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));
		System.out.println(a + "" + b + x + y);
		System.out.println(a + (b + x + y));
		System.out.println("" + a + b + x + y);
	}
}
