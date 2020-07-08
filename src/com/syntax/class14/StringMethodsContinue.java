package com.syntax.class14;

public class StringMethodsContinue {
	public static void main(String[] args) {
		System.out.println("*****.contains() method********");

		// case sensitive
		// check is String contains another sequence of special characters
		

		String str = "Good afternoon all";
		String searchValue = "afternoon";

		str.contains(searchValue);
		str.contains("afternoon");
		boolean contains = str.contains(searchValue);

		System.out.println(str.contains(searchValue));
		System.out.println(contains);
		System.out.println(str.contains("good"));
		System.out.println(str.contains("after "));

		System.out.println("*****.startsWith() method********");

		String drink = "welcome students";
		drink.startsWith("w");
		boolean starts = drink.startsWith("welcome");
		System.out.println(starts);

		System.out.println("*****.endsWith() method********");
		boolean ends = drink.endsWith("R");
		System.out.println(ends);

		// drink.startsWith('w'); will not work like that

		System.out.println("*****.equals() method********");

		String string1 = "Saturday";
		String string2 = "Saturday";
		String string3 = "saturday";
		string1.equals(string2);
		boolean equality = string1.equals(string2);
		System.out.println(equality);

		String expected = "Password cannot be empty";
		String actual = "Password can not be empty";

		System.out.println(expected.equals(actual));

		System.out.println("*****.equalsIgnoreCase() method********");
		string1.equalsIgnoreCase(string2);
		boolean equality1 = string1.equalsIgnoreCase(string2);
		System.out.println(equality1);
		
		String expectedBrowser = "Chrome";
		
		if (expectedBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on Chrome browser");
		} else {
			System.out.println("Test executed NOT on Chrome browser");
		}

	}

}
