//call by value
public class callMethod {

int val; // instance variable

// No-argument constructor
callMethod() 
{
    val = 150;
}

// Parameterized
callMethod(int val)
{
    this.val = val;
}

int operation(int xyz) {
	val =xyz*10/100;
	return(val);
}

public static void main(String args[]) {
	callMethod d = new callMethod();
	System.out.println("Before operation value of data is "+d.val);
	int result = d.operation(100);
    System.out.println("After operation value of data is "+d.val);
    System.out.println("Value returned by the function "+result);
	}
}
