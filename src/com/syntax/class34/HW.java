package com.syntax.class34;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
	public static void main(String[] args) throws IOException, InterruptedException {
		String filePath = System.getProperty("user.dir") + "/testdata/HW34.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Employee");

		int row = sheet.getPhysicalNumberOfRows();

		int col = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> list = new LinkedList<>();

		for (int r = 1; r < row; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 2; c < col; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			list.add(map);
		}

		System.setProperty("webdriver.chrome.driver",
				"/C:/Users/User/eclipse-workspace/SeleniumJavaBatch7/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

		String xlFirstName = "FirstName";
		String xlUserName = "UserName";
		String xlPassword = "Password";

		Iterator<Map<String, String>> it = list.iterator();
		while(it.hasNext()) {
			
			Map<String, String> map=it.next();
			Set<String> keys=map.keySet();
			
			for(String k:keys) {
				WebElement username=driver.findElement(By.cssSelector("input#txtUsername"));
				WebElement password=driver.findElement(By.cssSelector("input#txtPassword"));
				
				String key =k;
				String value=map.get(key);
				String firstName="";
				
				if(key.equals(xlFirstName)) {
					firstName=value;
				}else if(key.equals(xlUserName)) {
					username.sendKeys(value);
				}else if(key.equals(xlPassword)) {
					password.sendKeys(value);
					driver.findElement(By.cssSelector("input#btnLogin")).click();
					Thread.sleep(5000);
					WebElement logout=driver.findElement(By.xpath("//a[@id='welcome']"));
					String text=logout.getText();
					System.out.println(text);
					if(text.contains(firstName)) {
						System.out.println("Welcome message displays correct user that logged in. Test passed");
					}else {
						System.out.println("Welcome message displays incorrect user that logged in. Test failed");
					}
					logout.click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//a[text()='Logout']")).click();
					Thread.sleep(3000);
				}else {
					System.out.println("Incorrect key");
				}

			}
		}
	}
}
//Test Login functionality with 5 different usernames:
//
//Using Automation Code:
//
//Login to the application using Data from XL File
//Verify welcome message displays correct user that logged in
//
//Precondition:
//Manually Create 5 different username and passwords and Store data inside XLFile
//URL=http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
//username: Admin
//password: Hum@nhrm123
