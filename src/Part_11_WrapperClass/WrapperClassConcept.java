package Part_11_WrapperClass;

public class WrapperClassConcept {
	
public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//Data conversion from String to int.
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double
		String y = "12.33";		
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		//int to String
		int j = 200;
		System.out.println(j+20);
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		
		
		
	}

}
