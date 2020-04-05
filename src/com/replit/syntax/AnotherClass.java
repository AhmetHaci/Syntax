package com.replit.syntax;

class AnotherClass {


	  String m2 (String dflt) {
		
			System.out.println(  dflt);
			return dflt;
		}
		protected String m3 (String str) {
			
			System.out.println(str);
		return str;
		}

		public String m1(String name) {
			
			System.out.println(name);
			return name;
	  
	}

	class MainTest {
	  
		 public void AnotherClass (){
			 AnotherClass dfl = new AnotherClass ();
			 dfl.m2("default");
			 AnotherClass prtc = new AnotherClass ();
			 prtc.m3("protected method");
			 AnotherClass plc = new AnotherClass ();
			 plc.m1("public method");

		 }
	} 
	}