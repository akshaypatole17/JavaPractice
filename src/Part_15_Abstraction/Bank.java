package Part_15_Abstraction;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 10;
	static int loanrate = 5;
	
	
	
	//Partial Abstraction
	//Hiding implementation logic is called abstraction.
	//Abstract class can have abstract and non abstract methods.
	//Cannot create the object of Abstract class.
	
	public abstract void loan(); // abstract method : No method body.
	
	
	//Non Abtract methods
	public void credit(){
		System.out.println("Bank---Credit");
	}
	
	public void debit(){
		System.out.println("Bank---Debit");
	}
	

}
