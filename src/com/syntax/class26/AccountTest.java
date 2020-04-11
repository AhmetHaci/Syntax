package com.syntax.class26;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account ();
        acc.setAccountNumber(12345678);
        long AccountNumber=acc.getAccountNumber();
        System.out.println(AccountNumber);
        
        acc.setbalance(500);
        double myBalance=acc.getbalance();
        System.out.println(myBalance);
       
        int num=123;
        String.valueOf(num);//converts given value to string

}
}