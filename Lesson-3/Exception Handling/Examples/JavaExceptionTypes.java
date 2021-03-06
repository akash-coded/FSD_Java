public class JavaExceptionTypes {
    public static void main(String[] args) {
        try {
            int a = 50 / 0; // ArithmeticException

            String s = null;
            System.out.println(s.length());// NullPointerException

            String str = "abc";
            int i = Integer.parseInt(str);// NumberFormatException
            System.out.println(i);

            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Uh-oh! ArithmeticException has occurred🎃");
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("Uh-oh! NullPointerException has occurred🎃");
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("Uh-oh! NumberFormatException has occurred🎃");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Uh-oh! ArrayIndexOutOfBoundsException has occurred🎃");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Uh-oh! Exception has occurred🎃");
        }
    }
}

// At a time only one exception occurs and at a time only one catch block is
// executed.

// All catch blocks must be ordered from most specific to most general, i.e.
// catch for ArithmeticException must come before catch for Exception.
