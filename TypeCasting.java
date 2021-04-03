public class TypeCasting {

	public static void main (String [] args) {
		
		//implicit type conversion (type promotion)
		System.out.println("Implicit Type Conversion: -");

		char a = 'A';
		System.out.println("Value of a: " + a);
		
		int b = a;
		System.out.println("Value of b: " + b);
		
		float c = a;
		System.out.println("Value of c: " + c);
		
		long d = a;
		System.out.println("Value of d: " + d);
		
		double e = a;
		System.out.println("Value of e: " + e);
		
				
		System.out.println("\n");

		//explicit type conversion (type casting)
		System.out.println("Explicit Type Conversion: -");

		double x = 45.5;
		int y = (int)x;
		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);	
	}
}
