import java.util.Scanner;

public class PrintDigits {
    private static String printEvenOrOdd(int digit) {
        return (digit % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String number = scanner.nextLine();

            int num = Integer.parseInt(number);

            while (num != 0) {
                int digit = num % 10;
                num /= 10;
                System.out.println(digit + " - " + printEvenOrOdd(digit));
            }
        }
    }
}
