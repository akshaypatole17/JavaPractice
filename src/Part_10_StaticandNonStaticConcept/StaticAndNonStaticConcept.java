package Part_10_StaticandNonStaticConcept;

public class StaticAndNonStaticConcept {
	
	//global variables : The scope of global variable available across all the functions with some conditions.
	
		String name = "Tom";//non static global variable
		static int age = 25;//static global variable

		public static void main(String[] args) {
			//How to call static methods and variables.
			//1.Direct calling.
			sum();
			//2.Calling by class name.
			StaticAndNonStaticConcept.sum();
			
			System.out.println(age);
			System.out.println(StaticAndNonStaticConcept.age);
			
			//How to call non static methods and variables.
			//By creating object.
			//static methods and variables are not part of object.
			
			StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
			obj.sendMail();
			System.out.println(obj.name);
			
			//Can I access static methods using object reference? Yes.
			//But it gives warning that it should be access in a static way.
			obj.sum();
		}
		
		public void sendMail(){//non static method
			System.out.println("Send Mail method");
		}

		public static void sum(){//static method
			System.out.println("Sum method");
		}

}
