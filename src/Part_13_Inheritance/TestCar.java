package Part_13_Inheritance;

public class TestCar {
	
public static void main(String[] args) {
		
		//Static Polymorphism : Compile Time Polymorphism.
		BMW b = new BMW();
		b.start(); // Whenever method is common in Parent class and child class, the preference given to child class.
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("*********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		//Dynamic Polymorphism or Run time polymorphism or Topcasting.
		Car c1 = new BMW();//Child class object can be referred by parent class reference variable is called dynamic polymorphism or runtime polymorphism.
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Downcasting not allowed.
		BMW b1 = (BMW) new Car();//Casting
		//Exception thrown at runtime class cast exception.
		
		
		
	}

}
