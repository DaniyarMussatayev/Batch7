package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {

		// building an object of the car
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println(car1.make);

		System.out.println("----Accessing methods from Car " + "class using car1----");

		car1.drive();
		car1.reverse();
		car1.transportPeople();

		// building an object of the car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println(car2.make);

		System.out.println("----Accessing methods from Car " + "class using car2----");

		car2.drive();
		car2.reverse();
		car2.transportPeople();

		// new Bus(); compiler will give an error, because we never created bus class
		// create 2 more Car objects, assign features

		System.out.println("----Accessing methods from Car " + "class using car3----");

		Car car3 = new Car();
		car3.make = "Lexus";
		car3.color = "Grey";
		car3.model = "RX";

		car3.transportPeople();
		car3.reverse();

		System.out.println(car3.make);
		System.out.println("----Accessing methods from Car " + "class using car4----");
		Car car4 = new Car();
		car4.make = "Toyota";
		car4.model = "Camry";
		System.out.println(car4.model);

		car4.drive();
		car4.transportPeople();

	}

}
