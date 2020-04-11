package com.syntax.class25;

public interface WebDriver {
//
//
//	Create a WebDriver Interface that will have the following unimplemented behaviour:
//		openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//		Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

	 void openBrowser();
	 void closeBrowser();
	 void maximizeWindow();
	 void findElement();
	
}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome driver opens browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome driver close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome driver maximize Window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Chrome driver find Element");
		
	}
	
}

class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox driver opens browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox driver close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox Driver   maximize Window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Firefox Driver find Element");
		
	}
	
}

