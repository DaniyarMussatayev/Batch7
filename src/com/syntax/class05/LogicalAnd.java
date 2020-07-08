package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {
		int num = -58;

		if (num >= 1 && num <= 10) {
			System.out.printf("%d is small", num);
		} else if (num >= 11 && num <= 100) {
			System.out.printf("%d is a medium number", num);
		} else if (num >= 101 && num <= 1000) {
			System.out.printf("%d is a large number", num);
		} else {
			System.out.printf("%d is extra large", num);
		}

	}

}
