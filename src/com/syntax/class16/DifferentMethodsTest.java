package com.syntax.class16;

public class DifferentMethodsTest {
	public static void main(String[] args) {

		DifferentMethods obj = new DifferentMethods();
		obj.sayHello(2);

		System.out.println("*****************");
		obj.sayHello(5);

		obj.print("Hi", 3);
		obj.isHungry(true);
		obj.math(10,  30);
		obj.checkNum(35);
		obj.palindrome("madam");
		obj.printHello("Kyrgyz");
	}

}
