package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.syntax.class28.WebDriver;

public class HW {
	public static void main(String[] args) throws IOException {
		String xlFilePath = System.getProperty("user.dir") + "/testdata/HW34.xlsx";
		FileInputStream fis = new FileInputStream(xlFilePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Employee");

		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getLastCellNum();

		List<Map<String, String>> xlist = new ArrayList<>();

		for (int r = 1; r < row; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 0; c < col; c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			xlist.add(map);
		}
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

	}

}
