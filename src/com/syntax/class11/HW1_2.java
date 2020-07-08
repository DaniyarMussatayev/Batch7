package com.syntax.class11;

public class HW1_2 {
	public static void main(String[] args) {
		System.out.println("----1st HW----");
		String[][] str = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" } };
		System.out.printf("%s %s%n", str[0][1], str[1][0]);
		System.out.printf("%s %s%n", str[0][0], str[1][3]);
		System.out.printf("%s %s%n", str[0][2], str[1][2]);
		System.out.printf("%s %s%n", str[0][3], str[1][1]);

		System.out.println("----2st HW----");

		String[][] namesGrades = { { "Atai", "Vasya", "Asyl", "Anton" }, { "A", "B", "C", "D" } };
		System.out.printf("%s has an %s grade%n", namesGrades[0][0], namesGrades[1][0]);
		System.out.printf("%s has a %s grade%n", namesGrades[0][1], namesGrades[1][1]);
	}

}
