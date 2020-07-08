package com.syntax.class13;

public class Car {

	// define car features in a form of variables
	String make;
	String model;
	String color;
	int year;
	int speed;

	public static void main(String[] args) {

		System.out.println("Hello I am main method");
		Car c1 = new Car();
		c1.make = "Toyota";
		c1.reverse();

	}

	// define behavior in a form of methods
 
	void drive() {
		System.out.println("Car can drive");
		

	}

	void reverse() {
		System.out.println(make + " can reverse");
	}

	void transportPeople() {
		System.out.println(make + " can transport people");
	}

	void stop() {
		System.out.println(make + " will stop");
	}

}
