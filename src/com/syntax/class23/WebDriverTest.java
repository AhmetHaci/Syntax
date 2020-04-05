package com.syntax.class23;

public class WebDriverTest {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); //  	runtime polymorphism
		driver.open();
		WebDriver driver1 = new FireFoxDriver(); // runtime polymorphism
		driver1.open();
		WebDriver driver2 = new InternetExplorer(); // runtime polymorphism
		driver2.open();
	}
}