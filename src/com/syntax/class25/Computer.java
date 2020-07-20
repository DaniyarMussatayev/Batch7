package com.syntax.class25;

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.

public class Computer {
	String name;
	int memory;
	public Computer(String name, int memory) {
		this.name=name;
		this.memory=memory;
	}
	public void color() {
		System.out.println(name + " Color is grey");
	}
}

class Apple extends Computer{
	
	public Apple (String name, int memory) {
		super(name,memory);
	}
	public void color() {
		System.out.println(name + " Color is pink");
	}
	public void Siri() {
		System.out.println(name + " has Siri");
	}
}
class Lenovo extends Computer{
	public Lenovo (String name, int memory) {
		super(name,memory);
	}
	public void color() {
		System.out.println(name + " Color is red");
	}	
}

class HP extends Computer{
	public HP (String name, int memory) {
		super(name,memory);
	}
	public void color() {
		System.out.println(name + " Color is blue");
	}
	
	
	public void display() {
		System.out.println(name + " has HD monitor ");
	}
}
class Dell extends Computer{
	public Dell (String name, int memory) {
		super(name,memory);
	}
	public void color() {
		System.out.println(name + " Color is white");
	}	
}

