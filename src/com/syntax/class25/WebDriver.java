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
class Main1 {
	String name;

	Main1 (String name){
	this.name=name;
}
}
class ChromeDriver extends Main1 implements WebDriver{

	ChromeDriver(String name) {
		super(name);
		
	}

	@Override
	public void openBrowser() {
		System.out.println(name +" driver opens browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println(name +" driver close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println(name +" driver maximize Window");
		
	}

	@Override
	public void findElement() {
		System.out.println(name +" driver find Element");
		
	}
	
}

class FirefoxDriver extends Main1 implements WebDriver{

	FirefoxDriver(String name) {
		super(name);
	
	}

	@Override
	public void openBrowser() {
		System.out.println(name +" driver opens browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println(name +" driver close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println(name +" Driver   maximize Window");
		
	}

	@Override
	public void findElement() {
		System.out.println(name +" Driver find Element");
		
	}
	
}

