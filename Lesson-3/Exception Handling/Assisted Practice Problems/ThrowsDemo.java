public class ThrowsDemo {
    void division() throws ArithmeticException {
        int a = 45;
        int b = 0;
        int rs;
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        try {
            obj.division();
        } catch (ArithmeticException ex) {
            System.out.print("\n\tError : " + ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }

}
