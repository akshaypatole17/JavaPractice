package Part_19_LinkedList;

import java.util.LinkedList;

public class LinkedListConcept {
	
public static void main(String[] args) {
		
		//add
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("Contents of LinkedList:"+ll);
		
		//adfirst
		ll.addFirst("Navin");
		
		//addlast
		ll.addLast("Automation");
		System.out.println("Contents of LinkedList:"+ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of LinkedList"+ll);
		
		ll.remove(2);
		System.out.println("Contents of LinkedList"+ll);
		
		System.out.println("**************");

		//How to Iterate or print all the values of LinkeList.
		//1.foe loop.
		
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		} 
		
		System.out.println("**************");
		
		//2.advance for loop or for each loop
		
		for(String str : ll) {
			System.out.println(str);
		}
		
		System.out.println("**************");
		
		//3.Iterator
		
		java.util.Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("***************");
		
		//4.while loop
		
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
	}


}
