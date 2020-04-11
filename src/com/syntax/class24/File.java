package com.syntax.class24;

public abstract class File {
	public abstract void open();

	public void edit() {
		System.out.println("it will open");
	}

	public void close() {
		System.out.println("it will close");
	}
}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open JavaFile you need Eclipse IDE");
	}

}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("To open WordFile you need MS Office");

	}

}

class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("To open PDFFile you need PDF reader");

	}

}
