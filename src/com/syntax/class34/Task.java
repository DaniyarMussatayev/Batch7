package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	
//	Manually create a file to store username and password
//	Using Java add 2 more lines for username and password 
//	Save code in the same file
	public static void main(String[] args) throws IOException {
//		String xlPath = System.getProperty("user.dir") + "/testdata/Username.xlsx";
//		FileInputStream fis = new FileInputStream(xlPath);

		Workbook book = new XSSFWorkbook();

		Sheet sheet = book.createSheet("Test");
		sheet.createRow(0).createCell(0).setCellValue("Syntax");
		String xlPath = System.getProperty("user.dir") + "/testdata/Username.xlsx";
		FileOutputStream fos =new FileOutputStream(xlPath);
		book.write(fos);
		book.close();
		fos.close();

		
		

	}

}
