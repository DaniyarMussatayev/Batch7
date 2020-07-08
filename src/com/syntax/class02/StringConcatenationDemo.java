package com.syntax.class02;

public class StringConcatenationDemo {

	public static void main(String[] args) {
		String name = "Castro";
		
		System.out.println("I love " + name);
		System.out.println("I love" + " " + name);
		String statement = "I love";
		System.out.println(statement + " " + name);
		
		String car = "BMW";
		int year = 2020;
		System.out.println(name + " has a " + car + " of " + year + " year");
		System.out.println("BMW of year " + 2020);
		
	}
}
