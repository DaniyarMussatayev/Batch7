package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		boolean isFriday = true;
		int date = 17;

		if (isFriday) {
			if (date == 13) {
				System.out.println("Watch a scary movie");
			} else {
				System.out.println("Watch a comedy");
			}
		} else {
			System.out.println("Study JAVA");
		}
	}

}
