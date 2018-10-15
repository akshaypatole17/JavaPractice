package Part_14_InterfaceandMultipleInheritance;

public class TestBank {
	
public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationLoan();
		hs.carLoan();
		
		//Dynamic Polymorphism : Child class object can be referred by parent interface reference variable.
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();//Only overriden methods will be called.

	}


}
