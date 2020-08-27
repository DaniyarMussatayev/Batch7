package com.syntax.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		// How would handle InputMismatchException? Input Mismatch Exception when user
		// enters mismatch value then programmer expected.

		Scanner scan = new Scanner(System.in);

		try {
			int num = scan.nextInt();

			System.out.println(num);

		} catch (InputMismatchException ime) {
			System.out.println(ime);

		}
	}

}
