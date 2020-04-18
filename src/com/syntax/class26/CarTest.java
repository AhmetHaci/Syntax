package com.syntax.class26;

public class CarTest {

	public static void main(String[] args) {
	
				
				Car s = new Sedan (10000.00, "white", 30);
				System.out.println(s.calculateSalePrice());
				
				Car t = new Truck (20000.00, "Black", 3000.0);
				System.out.println(t.calculateSalePrice());
				
			}
		}