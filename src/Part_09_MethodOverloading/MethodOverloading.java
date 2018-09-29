package Part_09_MethodOverloading;

public class MethodOverloading {
	
	//main() method can be overloaded.
		public static void main(String[] args) {
			
			MethodOverloading obj = new MethodOverloading();
			obj.sum();
			obj.sum(1);
			obj.sum(2, 3);
			
		}
		
		public static void main(int p) {
			
		}
		
		public static void main(int a, int b) {
			
		}
		
		//Method Overloading : When method name is same with different arguments or input parameter within the same class. 
		//WE cannot create method inside method.
		//Duplicate methods are not allowed.
		public void sum(){// Zero input parameter.
			System.out.println("Sum Method--zero param"); 
		}
		
		public void sum(double d){
			System.out.println("Sum Method--zero parameter with different data type");
		}
		
		public void sum(int i){// One input parameter.
			System.out.println("Sum Method--one param");
			System.out.println(i);
		}
		
		public void sum(int k, int l){// Two input parameter.
			System.out.println("Sum Method--two param");
			System.out.println(k+l);
		}
		

}
