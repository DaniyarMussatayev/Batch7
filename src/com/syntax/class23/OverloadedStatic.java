package com.syntax.class23;

//Create 1 class with a static method that has 3 overloaded forms. 
//Then call each overloaded method with specific arguments and observe result.
public class OverloadedStatic {
	 static void display(int num) {
		System.out.println("The num is " +num);
	}
	 static void display(String name, int num) {
		System.out.println("The name is "+name+" and num is "+num);
	}
	 static void display(String name, int num, int num2) {
		System.out.println("The name is "+name+" num is "+num+ " and num2 is "+num2);
	}
	
}

