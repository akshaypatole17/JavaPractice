package Part_15_Abstraction;

public class TestBank {
	
	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank b = new HDFCBank();//Dynamic Polymorphism.
		b.credit();
		b.debit();
		b.loan();
		
		
	}

}
