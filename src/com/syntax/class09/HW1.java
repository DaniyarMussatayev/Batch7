package com.syntax.class09;

public class HW1 {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();

		}
		System.out.println("----------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
