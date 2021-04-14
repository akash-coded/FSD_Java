public class JavaExceptionExample {
    public static void main(String args[]) {
        try {
            // code that may raise exception
            int data = 100 / 0;
            System.out.println("Value of data: " + data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        // rest code of the program
        System.out.println("rest of the code...");
    }
}

// try{
// code that may throw an exception
// }catch(Exception_class_Name ref){
// ...
// }

// try{
// code that may throw an exception
// }finally{
// ...
// }