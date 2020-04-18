package com.syntax.class26;

interface WebDriver {
	void open();

	void close();

	String getTitle();
}

interface TakeScreenShot {
	void getScreenShot();
}

interface RemoteWebDriver extends WebDriver, TakeScreenShot {
	void navigate();
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Web browser opening in " + this.getTitle());

	}

	@Override
	public void close() {
		System.out.println("Web browser closing in " + this.getTitle());

	}

	@Override
	public String getTitle() {
		String getTitle = "Chrome";
		return getTitle;
	}

	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle() + " can take a screenshot");

	}

	@Override
	public void navigate() {
		System.out.println(this.getTitle() + " can navigate");

	}

}

class FireFox implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Web browser opening in " + this.getTitle());

	}

	@Override
	public void close() {
		System.out.println("Web browser closing in " + this.getTitle());

	}

	@Override
	public String getTitle() {
		String getTitle = "firefox";
		return getTitle;

	}

	@Override
	public void getScreenShot() {
		System.out.println(this.getTitle() + " can take a screenshot");

	}

	@Override
	public void navigate() {
		System.out.println(this.getTitle() + " can navigate");

	}

}

public class Task4 {
	public static void main(String[] args) {
		RemoteWebDriver [] browserArray={ new ChromeDriver(), new FireFox()};
		for (RemoteWebDriver mybrowser: browserArray ){
			mybrowser.open();
			mybrowser.close();
			mybrowser.getScreenShot();
			mybrowser.getTitle();
			mybrowser.navigate();
			

			
		}
	}

}
