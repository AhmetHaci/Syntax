package com.syntax.class21;

public class UserClass {
//	Write program: userClass  that has a constructor that initializes instance variable name and mobile number. 
//	Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call. 
//	Print users name, mobile number and address in userDetails method. Test your code.
	String name;
	String mobile_number;
	UserClass (String name, String mobile_number){
		
	this.name=name;
	this.mobile_number=mobile_number;
	}
	}
	class User_info extends UserClass {
		String address;
		User_info (String name, String mobile_number,String address ){
           super(name, mobile_number);
		this.address=address;
		}
		public void user_details() {
			
			System.out.println(name + " " + mobile_number + " " + address);

		}
	}


