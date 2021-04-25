public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        int searchValue = 30;
        int result = linearing(arr, searchValue);

        if (result == -1) {
            System.out.println("Element not in the array");
        } else {
            System.out.println("Element found at " + result + " and the search key is " + arr[result]);
        }
    }

    public static int linearing(int[] arr, int x) {
        int arrlength = arr.length;
        for (int i = 0; i < arrlength - 1; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }
}
