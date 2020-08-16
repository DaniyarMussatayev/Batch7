package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {
	public static void main(String[] args) throws IOException {
//		Create a property file to store following configurations:
//
//			browser=chrome
//			url=https://facebook.com
//			username
//			password
//
//			Read file and extract values of browser & url
		String filePath = "configs\\Task.properties";
		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fis);
		
		String value1 = prop.getProperty("browser");
		System.out.println(value1);

		String value2 = prop.getProperty("url");
		System.out.println(value2);
		
	
		
		
	}

}
