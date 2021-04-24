public class FinallyBlockDemo {
    public static void main(String[] args) {
        int a = 45;
        int b = 0;
        int rs = 0;
        try {
            rs = a / b;
        } catch (ArithmeticException Ex) {
            System.out.print("\n\tError : " + Ex.getMessage());
        } finally {
            System.out.print("\n\tThe result is : " + rs);
        }
    }

}
