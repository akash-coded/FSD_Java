//call by value
public class MethodCall {

	int val; // instance variable

	// No-argument constructor
	MethodCall() {
		val = 150;
	}

	// Parameterized
	MethodCall(int val) {
		this.val = val;
	}

	int operation(int xyz) {
		val = xyz * 10 / 100;
		return (val);
	}

	public static void main(String args[]) {
		MethodCall d = new MethodCall();
		System.out.println("Before operation value of data is " + d.val);
		int result = d.operation(100);
		System.out.println("After operation value of data is " + d.val);
		System.out.println("Value returned by the function " + result);
	}
}
