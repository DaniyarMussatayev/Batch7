package com.syntax.class02;

import javax.sound.midi.Soundbank;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = num1;
		System.out.println(num3);
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int div = num1 / num2;
		int mul = num1 * num2;
		
		// you can store an integer as double
		double dSum2 = 15;
		double mul1 = num1 * num2;
		System.out.println("addition -> " + num1 + num2);
		System.out.println("************" + "Ahmet " + 10 + 30);
		System.out.println("************" + "Ahmet " + (10 + 30));
		System.out.println("************" + "Ahmet " + 10 * 30);
		System.out.println(sum);
		System.out.println(div);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(mul1);
		
		
		
	}
}
