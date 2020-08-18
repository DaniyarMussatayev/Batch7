package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;

public class WriteIntoExcel {
	public static void main(String[] args) throws IOException {
		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);

		Workbook wbook = new XSSFWorkbook(fis);

		Sheet sheet = wbook.getSheet("Sample");
		
		sheet.getRow(0).createCell(5).setCellValue("Result");
		
		sheet.getRow(1).createCell(5).setCellValue("Pass");
		
		sheet.createRow(3).createCell(0).setCellValue("We are done !!!");
		
		String newXl=System.getProperty("user.dir")+"/testdata/Result.xlsx";
		
		FileOutputStream fos =new FileOutputStream(newXl);
		
		wbook.write(fos);
		
		
	}

}
