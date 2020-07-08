package com.syntax.class03;

public class CompoundOperators {
	public static void main(String[] args) {
		int num = 100;
		num = num + 100; // 200
		System.out.println(num);

		num = num + 100; // 300
		System.out.println(num);

		// We can use compound operators which are shorter
		num += 100; // 400
		System.out.println(num);
		
		//long way
		//num = num - 50;
		
		//shorter way
		num -= 50;
		System.out.println(num);
		
		num /= 7;
		System.out.println(num);
		
		num *= 2;
		System.out.println(num);
		num %= 9;
		System.out.println(num);
	}

}
