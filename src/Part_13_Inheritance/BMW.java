package Part_13_Inheritance;

public class BMW extends Car{
	//Method Overriding : When method is present in parent and child class with same name and same no of arguments or input parameter then it is called method overriding.
	public void start(){//Method Overriding or overridden method.
		System.out.println("BMW---start");		
	}
	
	public void theftsafety(){
		System.out.println("BMW---theftsafety");
	}
}
