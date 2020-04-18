package com.syntax.class25;

public class WebDriverTest {
public static void main(String[] args) {

//	WebDriver chrome = new ChromeDriver("Chrome");
//	chrome.openBrowser();
//	chrome.closeBrowser();
//	chrome.findElement();
//	chrome.maximizeWindow();
//	System.out.println();
//	WebDriver fire = new FirefoxDriver("Firefox");
//
//	fire.openBrowser();
//	fire.closeBrowser();
//	fire.findElement();
//	fire.maximizeWindow();
	
	
WebDriver [] obj = { new ChromeDriver("Chrome"), new FirefoxDriver("FireFox")};

       
for ( int i=0;i<obj.length;i++) {
    obj[i].openBrowser();	   
	obj[i].closeBrowser();
	obj[i].findElement();
	obj[i].maximizeWindow();
      
	 
}

//	for ( WebDriver CrossBrowser:obj) {
//		CrossBrowser.openBrowser();
//		CrossBrowser.closeBrowser();
//		CrossBrowser.findElement();
//		CrossBrowser.maximizeWindow();
//	}
	
}
}
