package com.syntax.class13;

public class DogsMainClass {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();

		dog1.name = "Husky";
		dog2.name = "Bulldog";
		dog3.name = "Labrador";

		dog1.run();
		System.out.println("s very fast");

		dog2.guard();
		System.out.println("s very good");

	}

}
