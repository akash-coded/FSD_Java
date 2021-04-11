public class ArrayDemo {
    public static void singleDimensionalArray() {
        int size = 5;
        int[] arrNum = new int[size];

        for (int i = 0, j = 10; i < size; i++, j += 10) {
            arrNum[i] = j;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arrNum[i]);
        }
    }

    public static void multiDimensionalArray() {
        int rows = 3;
        int cols = 3;
        int[][] arrNum = new int[rows][cols];

        int k = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arrNum[i][j] = k;
                k += 10;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arrNum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("1-D Array Demonstration: -");
        singleDimensionalArray();
        System.out.println();
        System.out.println("2-D Array Demonstration: -");
        multiDimensionalArray();
    }
}