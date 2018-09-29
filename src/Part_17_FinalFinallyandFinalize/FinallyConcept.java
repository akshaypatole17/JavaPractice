package Part_17_FinalFinallyandFinalize;

public class FinallyConcept {
	
	public static void main(String[] args) {
		//Test1();
		//Test2();
		//division();
		division2();
	}
	
	//1.
	public static void Test1() {
		try {
			System.out.println("Inside Test 1 Method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("Inside Catch Block");
		} 
		
		finally
		{
			System.out.println("Inside Finally Block");		
		}
	}
	
	//2.
	public static void Test2() {
		try {
			System.out.println("Inside Test2 Method");
		}
		finally {
			System.out.println("Finally code in Test 2 Method");
			
		}
	}
	
	//3.
	public static void division() {
		
		int i = 10;
		try {
			System.out.println("Inside Try Block");
			int k = i/0;			
		}catch(ArithmeticException e) {
			System.out.println("Inside Catch Block");
			System.out.println("Divide by Zero Error");
		}
		finally {
			System.out.println("Execute this code even after exception");
		}
		
	}
	
	//4.
	public static void division2() {
		
		int i = 10;
		try {
			System.out.println("Inside Try Block");
			int k = i/0;			
		}catch(NullPointerException e) {
			System.out.println("Inside Catch Block");
			System.out.println("Divide by Zero Error");
		}
		finally {
			System.out.println("Execute this code even after exception");
		}
		
	}

}
