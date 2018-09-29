package Part_14_InterfaceandMultipleInheritance;

public class HSBCBank implements USBank, BrazilBank {//We are achieving multiple inheritance. Is a relationship
	//If class is implementing any interface, then it is mandatory to override/define all the methods of interface.
	//Methods overriding from USBank.
	public void credit(){
		System.out.println("hsbc---credit");
	}

	public void debit(){
		System.out.println("hsbc---debit");
	}
	
	public void transfermoney(){
		System.out.println("hsbc---transfermoney");
	}
	
	
	//Separate methods of HSBC bank.
	public void educationLoan(){
		System.out.println("hsbc---Education Loan");
	}
	
	public void carLoan(){
		System.out.println("hsbc---Car Loan");
	}
	
	//method overriding from Brazil bank.
	public void mutualFund(){
		System.out.println("hsbc---Mutual Fund");
	}
}
