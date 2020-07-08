package com.syntax.class13;

public class PhoneObj {
	public static void main(String[] args) {
		Phone phone1 = new Phone();

		Phone phone2 = new Phone();

		Phone phone3 = new Phone();

		phone1.make = "IPhone";
		phone2.make = "Android";
		phone3.make = "Nokia";

		phone3.model = "Nokia 3310";

		phone1.text();
		phone2.text();
		phone3.store();
	}

}
