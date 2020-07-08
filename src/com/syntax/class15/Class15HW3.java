package com.syntax.class15;

public class Class15HW3 {
	public static void main(String[] args) {
		// How would you swap 2 strings without a temporary variable?

		String a = "Hello";
		String b = "World";

		a=a.concat(b);
		b=a.replace("World", "");
		a=a.replace("Hello", "");
		System.out.println("String a is " + a);
		System.out.println("String b is " + b);
	}
}
