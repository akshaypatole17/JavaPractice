package Part_21_HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	
	public static void main(String[] args) {
		//It is similar to HashMap but it is synchronized.
		//Store the values on the basis of key-value.
		//key--> Object HashCode (32-Bit) -->value
		//Hashtable contains unique elements/values if added it will ignore.
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		//Create a clone copy/shallow copy.
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable) h1.clone();
		
		System.out.println("The values from h1 "+h1);
		System.out.println("The values from h2 "+h2);
		
		h1.clear();		
		System.out.println("The values from h1 "+h1);
		System.out.println("The values from h2 "+h2);
		
		//contains value
		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.contains("Naveen"))
			System.out.println("Naveen is found");
		
		//Print all the values from Hashtable using -- Enumeration -- elements()
		Enumeration e = st.elements();
		System.out.println("Print values for st");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//Get all the values from Hashtable using -- entrySet() -- set of Hashtable values.
		System.out.println("Print all the values of st using entry set");	
		Set s = st.entrySet();
		System.out.println(s);
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");//Contains only unique values.
		//No null key and null values in Hashtable will give nullpointer exception.
		//st1.put("0", null); null pointer exception.
		
		System.out.println("Values from st1");
		System.out.println(st1);


		//To check if both the Hashtables are equal or not.
		if(st.equals(st1))
			System.out.println("Both are equal");
		
		//Get the value from a key.
		System.out.println(st1.get("A"));
		
		//Get the HashCode Hashtable object.
		System.out.println("The Hashcode value of st1 : "+st1.hashCode());

		//can define generic as well.
		Hashtable<String, String> st3 = new Hashtable<String, String>();

		

	}


}
