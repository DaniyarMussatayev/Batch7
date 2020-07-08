package com.syntax.class11;

public class HM1 {
	public static void main(String[] args) {
		// Create an array of cars : american, german, korean, italian.
		// Then retrieve all values from that array using 2 different loops

		String[][] cars = { { "Dodge", "Ford", "Chevrolet" }, { "BMW", "Mercedes", "Opel" }, { "Kia", "Hyundai" },
				{ "Ferrari", "Fiat", "Lamborgini" } };

		for (int row = 0; row < cars.length; row++) {
			for (int col = 0; col < cars[row].length; col++) {
				System.out.print(cars[row][col] + " ");
			}
			System.out.println();
		}

	}

}
