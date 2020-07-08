package com.syntax.class03;

public class RelationalOperators {
	public static void main(String[] args) {
		int a = 7;
		int b = 10;
		System.out.println(a > b); // false
		System.out.println(3 > 4); // false
		System.out.println(a < b); // true
		System.out.println(a == b); // false
		System.out.println(a != b); // true

		System.out.println("--------------------");
		double i = 10.78;
		double j = 10.55;
		boolean result1 = i > j;
		System.out.println(result1); // true
		boolean result2 = i == j;
		System.out.println(result2); //false
		
		boolean result3 = i != j; // is i different from j?
		System.out.println(result3); //true
		
		boolean result4 = i >= j;
		System.out.println(result4); //true
		
		boolean result5 = i <= j;
		System.out.println(result5); //false
	}
}
