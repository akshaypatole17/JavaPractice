package Part_03_Loops;

public class LoopsConcept {
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		//1.while loop
		//Disadvantage:while loop is keep on executing infinite times if we remove incremental part. 
			
		int i = 1;//Initialization
		while(i<=10){//Conditional Part
			System.out.println(i);
			i=i+1;// Incremental/Decremental Part : while loop keep on executing infinite times if we remove incremental part.
		}
		
		//2.for loop
		//j++ means j=j+1
		//print 1 to 10
		for(int j=1;j<=10;j++){//(Initialization;Condition;Increment)
			System.out.println(j);
		}
		
		//print 10 to 1
		//k-- means k=k-1
		for(int k=10;k>=1;k--){
			System.out.println(k);
		}
		
		
	}

}
