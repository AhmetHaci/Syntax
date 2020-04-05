package com.replit.syntax;

public class ReplIt132AccessModifiers {

	String m2(String dflt) {

		System.out.println(dflt);
		return dflt;
	}

	protected String m3(String str) {

		System.out.println(str);
		return str;
	}

	public String m1(String name) {

		System.out.println(name);
		return name;
	}
}
	class Main1 {
	public static void main(String[] args) {
		ReplIt132AccessModifiers dfl = new ReplIt132AccessModifiers();
		dfl.m2("default");
		//ReplIt132AccessModifiers prtc = new ReplIt132AccessModifiers();
		dfl.m3("protected");
		//ReplIt132AccessModifiers plc = new ReplIt132AccessModifiers();
		dfl.m1("public");

	}
	}

