package Part_16_Constructor;

public class ConstructorWithThisKeyword {
	
	//Class variables or global variables
		String name;
		int age;
		
		public ConstructorWithThisKeyword(String name, int age){
			this.name=name;//this.global = local.
			this.age=age;

			System.out.println(name);
			System.out.println(age);
		}

		public static void main(String[] args) {
			ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);
			
			
		}

}
