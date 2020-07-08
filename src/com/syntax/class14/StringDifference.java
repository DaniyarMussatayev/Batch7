package com.syntax.class14;

public class StringDifference {
	public static void main(String[] args) {
		String name = "Madeeha";
		String name1 = new String("Madeeha");
		

		System.out.println(name);
		System.out.println(name1);

		if (name.contentEquals(name1)) {
			System.out.println("Strings are equal using equal method");
		}
		
		if (name == name1) {
			System.out.println("Strings are equal using == operator");
		}

	}

}
