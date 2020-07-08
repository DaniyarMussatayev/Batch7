package com.syntax.class11;

public class ClassTask2 {
	public static void main(String[] args) {
		String[] cars = { "Benz", "Toyota", "Lexus", "Mazda", "BMW", "Subaru" };

		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println("-----------------");

		int[] num = { 30, 50, 34, 3423 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		int sum1 = 0;
		for (int num1 : num) {
			sum1 += num1;
		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println("-----------------");

		String[] countries = { "Russia", "Kyrgyzstan", "USA" };
		for (String country : countries) {
			if (country.equalsIgnoreCase("Kyrgyzstan")) {
				System.out.println("The capital of " + country + " is Bishkek");
			} else if (country.equalsIgnoreCase("USA")) {
				System.out.println("The capital of " + country + " is Washington");
			} else if (country.equalsIgnoreCase("Russia")) {
				System.out.println("The capital of " + country + " is Moscow");

			}

		}
		System.out.println("-----------------");
		String capital = null;
		for (int i = 0; i < countries.length; i++) {
			switch (countries[i]) {
			case "Russia":
				capital = "Moscow";
				break;
			case "Kyrgyzstan":
				capital = "Bishkek";
				break;
			case "USA":
				capital = "DC";
				break;
			default:
				System.out.println("Not in my list");
				break;
			}
			System.out.println("The capital of " + countries[i] + " is " + capital);

		}
		System.out.println("-----Elions way------------");
		// Elions way
		String[] countries1 = { "Russia", "Kyrgyzstan", "USA" };
		String[] capitals = { "Moscow", "Bishkek", "CD" };
		
		for (int i = 0; i < countries1.length; i++) {
			String country = countries[i];
			String capitalCountry = capitals[i];
			System.out.println("The capital city of " + country + " is " + capitalCountry);
		}
		// HW Try to solve this way with one enhanced for loop
	}
}
