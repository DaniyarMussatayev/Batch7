package com.syntax.class12;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 156;
		int b = -52;
		b = b - a;
		a = a + b;
		b = a - b;
		System.out.printf("a now is %d and b is %d", a, b);
	}

}
