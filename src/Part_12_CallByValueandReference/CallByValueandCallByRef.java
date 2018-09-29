package Part_12_CallByValueandReference;

public class CallByValueandCallByRef {
	
	int p;
	int q;
	
	public static void main(String[] args) {
		CallByValueandCallByRef obj = new CallByValueandCallByRef();
		int x = 10;
		int y = 20;
		
		obj.testSum(x, y);//Call by value or pass by value.
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		//After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	public int testSum(int a, int b){
		a = 30;
		b = 40;
		int c = a+b;
		return c;		
		
	}
	
	public void swap(CallByValueandCallByRef t){// passing obj to t i.e. call by reference.
		int temp;
		temp = t.p;// temp = 50
		t.p = t.q;// p = 60
		t.q = temp;// q = 50
	}


}
