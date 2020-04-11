package com.syntax.class25;
public interface Bank {
	void depositMoney();
	void withDraw ();
}
// benefit of interface is you can implement multiple interfaces to your class.
interface Trustable { // we can create more interfaces
	void trust ();
}
class Finance{
	public void financing () {
		System.out.println("Financial transaction must happen");
	}
}
class BOA extends Finance implements Bank,Trustable { // you can extend another class and you can implement multiple interfaces.
	@Override
	public void depositMoney() {
		System.out.println("BOA has a checking account");
	}
	@Override
	public void withDraw() {
		System.out.println("BOA has savings account");
	}
	@Override
	public void trust() {
		System.out.println("You can trust BOA with your money");
	}
} // one child has multiple multiple parents
class CapitalOne extends Finance implements Bank, Trustable{
	@Override
	public void depositMoney() {
		System.out.println("Capital One has a checking account");
	}
	@Override
	public void withDraw() {
		System.out.println("Capital One has savings account");
	}
	@Override
	public void trust() {
		System.out.println("You can trust Capital One with your money");
	}
}
class CapitalOneChild extends CapitalOne{
	
}