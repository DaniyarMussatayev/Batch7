package com.syntax.class15;

public class SplitFunction {
	public static void main(String[] args) {
		String str = "Today is Sunday and we have a Java class";
		String[] array = str.split(" ");
		for (String arrays : array) {
			System.out.println(arrays);

			str = "Today is Sunday and we have a Java class";
			array = str.toLowerCase().split("s");
			for (String s : array) {
				System.out.println(s);
			}

		}

	}
}
