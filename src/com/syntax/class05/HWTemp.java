package com.syntax.class05;

import java.util.Scanner;

public class HWTemp {
	// reate a Java program that will ask user to input city and temperature.
	// Your program should convert Fahrenheit
	// into celsius and print "The temperature is the city __ is __"

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your city");
		String city = scan.nextLine();
		System.out.println("Please enter city tempreture in Fahrenheit");
		int tempF = scan.nextInt();
		int tempC = (tempF - 32) * 5 / 9;
		System.out.println("The temperature in Celcious is the city " + city + " is " + tempC);

	}

}
