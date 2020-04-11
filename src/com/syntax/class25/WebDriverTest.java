package com.syntax.class25;

public class WebDriverTest {
public static void main(String[] args) {

//	WebDriver chrome = new ChromeDriver();
//	chrome.openBrowser();
//	chrome.closeBrowser();
//	chrome.findElement();
//	chrome.maximizeWindow();
//	System.out.println();
//	WebDriver fire = new FirefoxDriver();
//
//	fire.openBrowser();
//	fire.closeBrowser();
//	fire.findElement();
//	fire.maximizeWindow();
	WebDriver [] obj = { new ChromeDriver(), new FirefoxDriver()};
	for ( WebDriver a:obj) {
		a.openBrowser();
		a.closeBrowser();
		a.findElement();
		a.maximizeWindow();
	}
	
}
}
