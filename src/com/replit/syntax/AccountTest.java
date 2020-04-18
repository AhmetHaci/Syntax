package com.replit.syntax;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account ();
		
		acc.setAcc_no(7560504000l );
		System.out.println(acc.getAcc_no());
		
		
		acc.setName("Sumair");
		System.out.println(acc.getName());
		
		
		acc.setEmail("sumair@syntax.com");
		System.out.println(acc.getEmail());
	

		acc.setAmount(50000.0);
		System.out.println(acc.getAmount());
	}

}
