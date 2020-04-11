package com.syntax.class26;

public class Account {
	private long AccountNumber;
	private double balance;
	// getters
	public long getAccountNumber() {
		return AccountNumber;
	}
	public double getbalance() {
		return balance;
	}
	
	//setter
	public void setbalance(int amount) {
		
		if (amount > 0 ) {
			balance= balance+amount;
		}
	
	}
	public void setAccountNumber(long AccountNumber) {
	if(String.valueOf(AccountNumber).length()==9) {//acc number to string
	this.AccountNumber=AccountNumber;
	}
	}
	
}
