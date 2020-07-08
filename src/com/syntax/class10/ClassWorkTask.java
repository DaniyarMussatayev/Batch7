package com.syntax.class10;

import java.util.Scanner;

public class ClassWorkTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many floors does your hotel have?");
		int floors = scan.nextInt();
		System.out.println("How many rooms does in each floor?");
		int rooms = scan.nextInt();

		for (int i = 1; i <= floors; i++) {
			System.out.println("Floor #" + i + ":");
			for (int j = 1; j <= rooms; j++) {
				System.out.print(i + "." + j + " ");
			}
			System.out.println();
		}

	}

}
