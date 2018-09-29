package Part_15_Abstraction;

public class HDFCBank extends Bank {
	
	public void loan(){//Override
		System.out.println("HDFC---Loan Method");
	}
	
	public void funds(){
		System.out.println("HDFC---Funds");
	}

}
