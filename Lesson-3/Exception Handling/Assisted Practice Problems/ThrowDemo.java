public class ThrowDemo {
    public static void main(String[] args) {

        int a = 45;
        int b = 0;
        int rs;

        try {
            if (0 == b) // ? Can this condition be rewritten differently?
                throw (new ArithmeticException("Can't divide by zero."));
            else {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        } catch (ArithmeticException ex) {
            System.out.print("\n\tError : " + ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
    }

}
