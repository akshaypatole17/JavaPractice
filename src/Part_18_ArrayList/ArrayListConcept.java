package Part_18_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
public static <E> void main(String[] args) {
		
		int a[] = new int[3];//Size is fixed.
		
		//Dynamic Array: Array List.
		//1.Can contain duplicate values/elements.
		//2.Maintain insertion order.(0 1 2 3 4 5)
		//3.Non Synchronized. Not Thread Safe.
		//4.It allows random access to fetch elements because it stores values on basis of index.
		//5.Allows to store any data type without generic.
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1		
		ar.add(30);//2
		
		System.out.println(ar.size());
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		ar.add("SAP");
		ar.add('$');
		ar.add(12.33);
		
		
		System.out.println(ar.size());//Size of ArrayList
		
		System.out.println(ar.get(4));//To get value from index.
		
		//To print all values use for loop
		//1.for loop
		//2.Iterator
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		//ar1.add("Selenium");
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Selenium");
		//ar2.add(100);
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//Employee Class object.
		
		Employee E1 = new Employee("Navin", 27, "QA");
		Employee E2 = new Employee("Tom", 28, "Dev");
		Employee E3 = new Employee("Peter", 29, "Admin");
		
		//Create ArrayList
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		
		ar4.add(E1);
		ar4.add(E2);
		ar4.add(E3);
		
		//Iterator to traverse the values.
		Iterator<Employee> it = ar4.iterator();//Does not work on index. Use while loop.
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("***************");
		//Array List - addall()
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("Javascript");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("**************");
		//Array List - removeall()
		
		ar5.removeAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("**************");
		
		//retainall()
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Test");
		ar8.add("Java");

		ar7.retainAll(ar8);
		
		for(int i=0; i<ar7.size();i++){
			System.out.println(ar7.get(i));
		}
		
		
	}


}
