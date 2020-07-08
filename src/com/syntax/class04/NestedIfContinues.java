package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		boolean allergies = true;
		String allergiName = "peanut";
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;

		if (allergies) {
			if (allergiName.equalsIgnoreCase("peanut")) {
				System.out.println("Don't eat peanut");
			}
			if (allergiName.equalsIgnoreCase("lactose")) {
				System.out.println("Don't drink milk");
			}
			if (allergiName.equalsIgnoreCase("bee alergy")) {
				System.out.println("Don't mess with bees");
			}

		} else {
			System.out.println("You are healthy");
		}

		System.out.print("\n");

		if (!allergies) {
			System.out.println("You are healthy");
		} else {
			if (peanut) {
				System.out.println("Don't eat peanut");
			}
			if (lactose) {
				System.out.println("Don't drink milk");
			}
			if (bee) {
				System.out.println("Don't mess with bees");
			}
		}

	}

}
