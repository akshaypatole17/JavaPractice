package Part_14_InterfaceandMultipleInheritance;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit(); //Prototype method.

	public void debit();
	
	public void transfermoney();
	
	//Only method declaration.
	//No method body.Only method prototype.
	//In interface we can declare variables, variables by default static in nature.
	//variables value will not be changed.
	//No static method in interface.
	//No main method in interface.
	//We cannot create object of interface.
	//interfaces are abstract in nature.
	

}
