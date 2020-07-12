package com.syntax.class20;

public class HW1Class20 {
	// Write a program that will have 4 different access levels of constructors and
	// create 3 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package and observe result.
	String make, model, color;
	int year, grossProffit;
	double price;

	public HW1Class20(String carMake, String carModel, String carColor) {
		make = carMake;
		model = carModel;
		color = carColor;
	}
	protected HW1Class20(String carMake, String carModel, String carColor, int carYear) {
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
	}
	HW1Class20(String carMake, String carModel, String carColor, int carYear, double price) {
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		this.price = price;
	}
	HW1Class20(String carMake, String carModel, String carColor, int carYear, double price, int grossProffit) {
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		this.price = price;
		this.grossProffit =grossProffit;
		
	}
	public void displayInfo() {
		System.out.println(make + model +color+ " is " +year +" year " + " and price is " + price + "$"+ " with " + grossProffit +"%" + " Gross Proffit");
	}
	public static void main(String[] args) {
		HW1Class20 obj= new HW1Class20("BMW", "M5", "white", 2020, 90000, 20);
		obj.displayInfo();
		
	}

}
