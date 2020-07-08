package com.syntax.class11;

public class HW6_7 {
	public static void main(String[] args) {
		System.out.println("----HW 7 task----");
		String[] cars = { "Dodge", "Ford", "Mersedes Benz", "BMW", "KIA", "Hyunday", "Fiat", "Ferrari" };

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		System.out.println("----HW 8 task----");
		String [] countries = {"USA", "Canada", "Brazil", "Argentina", "France", "Egypt"};
		
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i] + " ");
		}
		System.out.println();
		for (String country : countries) {
			System.out.print(country + " ");
		}
		System.out.println();
		System.out.println("There are " + countries.length + " countries in the array");
	}

}
