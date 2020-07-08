package com.syntax.class03;

public class IfCondition {
	public static void main(String[] args) {
		// declare a number and compare if the number is large than 100
		// if it is true, I will print "my number is large
		// if it fase, do not print

		int num = 100;
		boolean result = num > 100;
		System.out.println("Let us check");
		if (num > 100) {
			System.out.println("My number is larger than 100");
		} else {
			System.out.println("My number is small");
		}
		System.out.println("The check is complete");

		System.out.println("-----------------");
		int expectedHours = 15;
		int actualHours = 15;

		if (actualHours >= expectedHours) {
			System.out.println("You will love and understand Java");
		} else {
			System.out.println("You will not love Java");
		}
			System.out.println("-----------------");
			double budget = 15000;
			double carPrice = 15000;
			
			if (budget >= carPrice) { // I will buy only if I have more money
				System.out.println("I will buy this car");
				System.out.println("I am happy");
			} else {
				System.out.println("I will not buy this car.");
				System.out.println("I will study Java");
			}
		}
	}
