package Part_16_Constructor;

public class ConstructorConcept {
	
	public ConstructorConcept(){//Default Constructor
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i){//Parameterized Constructor
		System.out.println("Single Parameter Constructor");
		System.out.println("The value of i "+i);
	}
	
	public ConstructorConcept(int i, int j){//Parameterized Constructor
		System.out.println("Two Parameter Constructor");
		System.out.println("The value of i "+i);
		System.out.println("The value of j "+j);
	}
	
	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();//
		ConstructorConcept obj1 = new ConstructorConcept(1);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);


	}

}
