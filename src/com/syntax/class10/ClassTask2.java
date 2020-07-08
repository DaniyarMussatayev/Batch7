package com.syntax.class10;

public class ClassTask2 {
	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);

		char[] grades1 = new char[6];
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';

		System.out.println("-----------------");
		String[] names = new String[120];
		names[2] = "Tala";

		String[] names1 = { "Hunter", "Gozde", "Elion", "Tala" };
		System.out.println(names[2]);
		System.out.println(names1[3]);
		System.out.println("-----------------");
		String[] words = { "Java", "Saturday", "day", "coding", "is" };
		System.out.printf("%s %s %s %s %s.", words[1], words[4], words[0], words[3], words[2]);

	}

}
