package com.syntax.class04;

public class NestingElseIf {
	public static void main(String[] args) {
		boolean courseCompleted = true;
		double score = 90;

		if (courseCompleted) {
			if (score > 90) {
				System.out.println("Great job!");
			} else if (score > 80) {
				System.out.println("Well done!");
			} else if (score > 70) {
				System.out.println("Just passed");
			} else {
				System.out.println("You failed");
			}
		} else {
			System.out.println("Please finish your quiz!");
		}

	}

}
