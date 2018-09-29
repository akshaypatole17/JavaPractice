package Part_08_LocalandGlobalVariable;

public class LocalvsGlobalVariables {
	
	//Global variables or class variables. This are currently non static hence copy of it given to object.
		String name = "Tom";
		int age = 25;

		public static void main(String[] args) {
			
			int i = 10;// local variable for main() method
			System.out.println(i);
			
			LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
			System.out.println(obj.name);
			System.out.println(obj.age);
		}
		
		public void sum(){
			int i = 15;// local variable for sum() method
			int j = 20;
			int age = 25;
			
		}


}
