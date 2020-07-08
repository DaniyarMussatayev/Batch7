package com.syntax.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;

		// declare and initialize an array of integers
		int[] numbers = new int[4];
		numbers[0] = 5;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		
		System.out.println(numbers[3]);
		
		// declaring, not initializing
		String[] carArray; // preferred way
		String carArray1[]; //works but not preferred
		
		//we are initializing the array
		carArray = new String[3]; //The size is 3 --> 0, 1, 2
		carArray[0] = "BMW";
		carArray[1] = "Toyota";
		carArray[2] = "Benz";
		//carArray[3] = "Tesla";
		
		String car = carArray[2];
		System.out.println(car);
		
		System.out.println("----------------");
		char[] letters = new char[4];
		letters[0] = 'A';
		letters[1] = 'B';
		letters[3] = 'C';
		
		letters[1] = 'K';
		
		
	}

}
