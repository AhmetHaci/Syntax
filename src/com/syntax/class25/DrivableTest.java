package com.syntax.class25;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj = new Toyota();
		obj.drive();
		//obj.DRIVE_FAST=false; it will give you error, because it s final value, cannot be changed.
		Toyota toyota = new Toyota();
        toyota.drive();	//this is from first  parent
        toyota.stop(); // this is from second parent
	}

}
