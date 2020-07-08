package com.syntax.class03;

public class PrimitiveCasting {
	public static void main(String[] args) {
		
		//int to double processing automatically
		//widening, implicit casting
		double d = 7;
		System.out.println(d);
		
		//double to int
		//narrowing, explicit casting, manually
		int i = (int) 7.58;
		System.out.println(i);
		
		byte b = (byte) 1582523;
		System.out.println(b);
		
		long l1 = 45;
		long l2 = 485745511526544l;
		
		int number1 = (int) l1;
		int number = (int) l2;
		System.out.println(number);
		System.out.println(number1);
		
	}

}
