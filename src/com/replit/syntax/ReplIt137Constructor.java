package com.replit.syntax;

public class ReplIt137Constructor {
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;

	ReplIt137Constructor(String makee,
	String modell,
	int numberOfDoorss,
	int topSpeedd,
	double pricee){
	  
	  make = make;
	  model = modell;
	  numberOfDoors = numberOfDoorss;
	  topSpeed = topSpeedd;
	  price = pricee;
	  
	}

	ReplIt137Constructor(String makee,
	String modell,
	int topSpeedd,
	double pricee){
	  make =makee;
	  model =modell;
	  topSpeed = topSpeedd;
	  price = pricee;
	  numberOfDoors =4;
	  
	}

	ReplIt137Constructor(
	int numberOfDoorss,
	int topSpeedd,
	double pricee){
	  
	  make ="unknown";
	  model ="unknown";
	  numberOfDoors = numberOfDoorss;
	  topSpeed = topSpeedd;
	  price = pricee;
	  
	}

	ReplIt137Constructor(String makee,
	String modell,
	int numberOfDoorss){
	  make = makee;
	  model = modell;
	  numberOfDoors = numberOfDoorss;
	  topSpeed =90;
	  price =0;
	}

	void display(){
	  System.out. println(make + " " + model + " "+ numberOfDoors +" "+ topSpeed + " " + price);
	}
	}