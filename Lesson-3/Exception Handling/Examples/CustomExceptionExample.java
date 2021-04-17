class InvalidAgeException extends Exception {
    /**
     * Generated seialID
     */
    private static final long serialVersionUID = -2714273560914952041L;

    InvalidAgeException(String s) {
        super(s);
    }
}

public class CustomExceptionExample {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        try {
            validate(13);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }

        System.out.println("rest of the code...");
    }
}
