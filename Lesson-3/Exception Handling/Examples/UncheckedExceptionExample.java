public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7 };
        System.out.println(arr[10]); // may throw exception

        System.out.println("rest of the code");
    }
}
