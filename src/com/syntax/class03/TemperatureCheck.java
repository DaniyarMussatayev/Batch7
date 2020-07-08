package com.syntax.class03;

public class TemperatureCheck {
	public static void main(String[] args) {
		double temp1 = 31;
		double temp2 = 32;
		if (temp1 < temp2) {
			System.out.println("Water will freeze with temperature " + temp1);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp1);
		}
	}

}
