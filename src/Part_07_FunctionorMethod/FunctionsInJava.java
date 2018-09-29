package Part_07_FunctionorMethod;

public class FunctionsInJava {
	
	//main method(){} - Starting execution point.
		//main() method is void because it never return any value.
		public static void main(String[] args) {
			
			FunctionsInJava obj = new FunctionsInJava();
			//one object will be created and obj will be the reference variable to this object.
			//After creating the object the copy of all non static methods will be given to this object.
			//Object cannot hold static method.
			obj.test();
			int l = obj.pqr();
			System.out.println(l);
			String s1 = obj.qa();
			System.out.println(s1);
			int m = obj.division(10, 5);
			System.out.println(m);
		}
		
		// non static methods.
		// void means does not return any value. 
		
		//return type - void
		public void test(){//No Input No Output.
			System.out.println("test method");
		}
		//return type - int
		public int pqr(){	//No Input Some Output.
			System.out.println("pqr method");
			int a = 10;
			int b = 20;
			int c = a+b;
			
			return c;//We are returning c and its data type is int thats why we write public int pqr(){}.
		}
		// return type - String
		public String qa(){//No Input Some Output.
			System.out.println("qa method");
			String s = "Selenium";
			
			return s;
			
		}
		// return type - int
		// x and y are input parameter or input arguments.
		public int division(int x, int y){//Input and Output.
			System.out.println("division method");
			int d = x/y;
			
			return d;
			
		}

}
