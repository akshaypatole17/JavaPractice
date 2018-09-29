package Part_04_StaticArray;

public class ArrayConcept {
	
	public static void main(String[] args) {
		//Array: To store similar data type values in array variable. Array is a set of similar data types.
		//int i=10;
		//int i=20; Not allowed.Thats why array comes into picture.
		
		//1-Dimensional Arrays
		//Disadvantage of array:
		//1.Size is fixed...Static array...To overcome this problem we use collections...Dynamic array.
		//2.Stores only similar data types... To overcome this problem we use object array.
		
		
		//1.int array:
		//lower bound index = 0
		//upper bound index = n-1 (n is size of an array)
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[3]=48.33 not allowed. Only integer values are allowed because array is of integer data type.
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//Array index out of bound exception.
		
		System.out.println(i.length);//length or size of an array.
		
		//To print all the values of an array.
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		
		//2.double array:
		
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;
		
		System.out.println(d[2]);
		
		//3.char array:
		
		char c[] = new char[3];
		c[0]='a';
		c[1]='2';
		c[2]='$';
		
		//4.boolean array
		
		boolean b[] = new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.String array
		
		String s[] = new String[3];
		s[0]="Test";
		s[1]="Hello";
		s[2]="World";
		
		System.out.println(s.length);
		System.out.println(s[1]);
 		
		//6.Object array : Object is a class....used to store different data types values.
		
		Object ob[] = new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='w';
		ob[5]="London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		for(int k=0; k<ob.length;k++){
			System.out.println(ob[k]);
		}
			
	}

}
