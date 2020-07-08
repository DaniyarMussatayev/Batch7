package com.syntax.class04;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your city and temperature:");

		try {

			String cityName = scanner.next();
			double tempFah = scanner.nextDouble();
			double tempCel = (tempFah - 32) * 5 / 9;

			System.out.printf("The temperature in the city %s is %.2f.", cityName, tempCel);
		} catch (Exception e) {
			System.out.println("Invalid input. Please try again. Remember to enter city name first and temperature then.");

		}
		scanner.close();
	}

}
