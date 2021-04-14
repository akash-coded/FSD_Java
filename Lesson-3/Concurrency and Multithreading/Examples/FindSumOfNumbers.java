/**
 * FindSumOfNumbers will count the sum of the number from 1 to the parameter
 * countUntil and then write the result to the console.
 * 
 * FindSumOfNumbers is the task which will be performed
 *
 * @author Akash Das
 *
 */
public class FindSumOfNumbers implements Runnable {
    private final long countUntil;

    FindSumOfNumbers(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}