package Part_16_Constructor;

//Super keyword is used to called parent class constructor.

public class B extends A{
	
	public B() {
		super(10, 20);
		System.out.println("Child class constructor");		
	}
	
	public B(int i) {
		super(i);
	}
	
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
	}

}

