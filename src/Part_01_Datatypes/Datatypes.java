package Part_01_Datatypes;

public class Datatypes {
	
	/* Author : Akshay Patole
	Purpose : To learn DataTypes.*/
	
	/**Notes:
	 * main() Method : Starting/execution point of a program. 
	 * All statements in java should be ended with semicolon i.e.;.
	 * int, double , char, boolean are primitive data types.
	 * String is a class, not data type.
	 * System is a class.
	 * Value should be printed after declaration only.
	 * If declared variable is not used then compiler will show yellow exclametory warnings i.e.k & l.
	 * */

	public static void main(String[] args) {
		//1.int:
		int i = 10;
		//int i = 20; Cannot create/declare duplicate variable, variable should be unique.
		i = 20; //But can write like this, new value of i becomes 20.
		int j = 30;
		System.out.println(j);
		int k = 40;
		//int l =12.33; Not allowed.In integer only pure integers are allowed.
		int l = 0; //Allowed.
		int m = -1; // Allowed.
		System.out.println(m);
		System.out.println(i+j);
		
		//2.double:
		double d = 12.33;
		double d1 = 34.44;
		System.out.println(d1);
		double d2 = 100; //100.00 Can store integers in double but cannot store double in integers.
		
		//3.char: Only single digit value.
		char c = 'a'; //All characters should be written within single quote ''.
		char c1 = 'A';
		char c2 = '$';
		char c3 = '1';
		
		//4.boolean:
		boolean b1 = true;
		boolean b2 = false;
		//true and false are keywords available in java.
		
		//5.String: String is a class, not data type.
		String s = "Hello World";
		String s1 = "Selenium";
		String s2 = "Hi this is my java code";
		String s3 = "1000";
		String s4 = "12.33";
		System.out.println(s2);
		
	}

}
