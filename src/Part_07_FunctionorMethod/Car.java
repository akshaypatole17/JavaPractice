package Part_07_FunctionorMethod;

public class Car {
	
	//Class variables or global variables
			int mod;
			int wheel;

			public static void main(String[] args) {
				//new Car(); is object of Car class.
				//new keyword is used to create an object.
				//a, b, c - Object reference variable.
				Car a = new Car();//new Car(); is an object. a is referring that object hence it is object reference variable.
				Car b = new Car();
				Car c = new Car();
				
				a.mod=2015;
				a.wheel=4;
				
				b.mod=2014;
				b.wheel=4;
				
				c.mod=2013;
				c.wheel=4;
				
				System.out.println("Before shifting the references");
				
				System.out.println(a.mod);
				System.out.println(a.wheel);
				
				System.out.println(b.mod);
				System.out.println(b.wheel);
				
				System.out.println(c.mod);
				System.out.println(c.wheel);
				
				System.out.println("After shifting the references");
				
				a=b;
				b=c;
				c=a;
				
				a.mod=10;
				System.out.println(a.mod);
				c.mod=20;
				System.out.println(a.mod);
		}


}
