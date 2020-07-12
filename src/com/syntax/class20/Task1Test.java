package com.syntax.class20;

public class Task1Test {
	public static void main(String[] args) {

		Task1 obj = new Task1("iPhone 11", 256, 15, 900);
		obj.displayInfo();
		
		Task1 obj1=new Task1();
		obj1.model="Samsung";
		obj1.camera=13;
		obj1.memory=64;
		obj1.price=700;
		
		obj1.displayInfo();
	}
}
