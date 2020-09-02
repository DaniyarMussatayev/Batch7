package com.syntax.class35;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class HW {
	public static List<Exception> exceptions() {
		List<Exception> listOfExceptions = new ArrayList<>();
		try {
			int a = 1;
			int b = 0;
			System.out.println(a/b);

		} catch (Exception one) {
			listOfExceptions.add(one);
		}
		
		try {
			String r=null;
			System.out.println(r.length());
			
		} catch (Exception two) {
			listOfExceptions.add(two);
		}
		try {
			int[] arr= {34};
			System.out.println(arr[3]);
		} catch (Exception three) {
			listOfExceptions.add(three);
		}
		
		String filePath=System.getProperty("username.dir")+"/line.xlsx";
		try {
			FileInputStream fis=new FileInputStream(filePath);			
		} catch (Exception four) {
			listOfExceptions.add(four);
		}
		return listOfExceptions;
	}

	public static void main(String[] args) {
		List<Exception> listOfExcep = exceptions();
		for (Exception ex : listOfExcep) {
			System.out.println(ex);
		}
	}

}
//Create a static method that will return a List of Exceptions.
//Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//Call your method inside main and print name and details of all Exception objects.
