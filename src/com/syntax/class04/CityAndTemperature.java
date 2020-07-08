package com.syntax.class04;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Create a Java program that will ask user to input city and temperature.
		// Your program should convert Fahrenheit into celsius and print "The
		// temperature is the city __ is __"

		System.out.println("Please input city");
		String city = scan.nextLine();
		System.out.println("Please enter tempreture in Fahrenheit ");
		int tempF = scan.nextInt();
		int tempC = (tempF - 32) * 5 / 9;
		System.out.println("The temperature is the city " + city + " is " + tempC + " celsius ");

	}

}
