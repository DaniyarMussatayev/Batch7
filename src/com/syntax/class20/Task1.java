package com.syntax.class20;

public class Task1 {
	// Write a program that will have a constructor: one with parameters and second
	// without any parameters.
	// Create a separate Test class where you will execute both of the constructors
	// 1 by 1.

	String model;
	int memory, camera;
	double price;

	public void displayInfo() {
		System.out.println("We build " + model + " " + memory + " GB " + camera + " MP " + " for price = $" + price);
	}

	Task1(String phoneModel, int phoneMemory, int phoneCamera, double phonePrice) {
		model = phoneModel;
		memory = phoneCamera;
		camera = phoneCamera;
		price = phonePrice;
	}

	 Task1() {
	}

}
