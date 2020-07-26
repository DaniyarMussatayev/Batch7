package com.syntax.class28;

public class WebDriverTest {
	public static void main(String[] args) {
		WebDriver c = new ChromeDriver();
		c.open();
		c.close();
		System.out.println(c.getTitle());

		RemoteWedDriver c1 = new ChromeDriver();
		c1.open();
		c1.close();
		c1.navigate();
		
		TakesScreenshot c2=new ChromeDriver();
		c2.getScreenshot();
		
		WebDriver f = new FirefoxDriver();
		f.open();
		f.close();

		RemoteWedDriver f1 = new FirefoxDriver();
		f1.open();
		f1.close();
		f1.navigate();
		
		TakesScreenshot f2=new FirefoxDriver();
		
		f2.getScreenshot();
		
		WebDriver s = new SafariDriver();
		s.open();
		s.close();

		RemoteWedDriver s1 = new SafariDriver();
		s1.open();
		s1.close();
		s1.navigate();
		
		TakesScreenshot s2=new SafariDriver();
		s2.getScreenshot();
		

	}


}
