package com.syntax.class28;

public interface WebDriver {
	void open();
	void close();
	String getTitle();
}

interface RemoteWedDriver extends WebDriver{
	void navigate();	
} 
interface TakesScreenshot extends RemoteWedDriver{
	void getScreenshot();
}

class ChromeDriver implements WebDriver,RemoteWedDriver,TakesScreenshot{
	public void open() {
		System.out.println("ChromeDriver can open");
	}
	public void close() {
		System.out.println("ChromeDriver can close");
	}
	public String getTitle() {
		return getTitle();
	}
	
	public void navigate() {
		System.out.println("ChromeDriver title is Chrome");
	}
	public void getScreenshot() {
		System.out.println("ChromeDriver can take screenshot");
	}
}
class FirefoxDriver implements WebDriver,RemoteWedDriver,TakesScreenshot{
	public void open() {
		System.out.println("FirefoxDriver can open");
	}
	public void close() {
		System.out.println("FirefoxDriver can close");
	}
	public String getTitle() {
		return getTitle();
	}
	public void navigate() {
		System.out.println("FirefoxDriver title is Chrome");
	}
	public void getScreenshot() {
		System.out.println("FirefoxDriver can take screenshot");
	}
}
class SafariDriver implements WebDriver,RemoteWedDriver,TakesScreenshot{
	
	public void open() {
		System.out.println("SafariDriver can open");
	}
	public void close() {
		System.out.println("SafariDriver can close");
	}
	public String getTitle() {
		return getTitle();
	}
	public void navigate() {
		System.out.println("SafariDriver title is Chrome");
	}
	public void getScreenshot() {
		System.out.println("SafariDriver can take screenshot");
	}
}

