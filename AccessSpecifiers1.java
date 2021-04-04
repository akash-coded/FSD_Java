// Class is having default access modifier 
class DefAccessSpecifier
{
  void display() 
     { 
         System.out.println("You are using default access specifier"); 
     } 
} 
// Driver class
public class AccessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Default Access Specifier");
		DefAccessSpecifier obj = new DefAccessSpecifier(); 		  
        obj.display(); 
	}
}
