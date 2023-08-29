package ua.hillel.kovalyov.homeworks;

public class ArrayUtil {

    // if not found - return -1
    // if empty - return -2
    // if null - return -3
    public static int getIndexElement(int[] array, int element) {
        if (array == null) {
            return -3;
        }

        if (array.length == 0) {
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // Повертаємо 0, якщо масив порожній або null
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            return false;
        }

        int rows = matrix.length;
        for (int[] ints : matrix) {
            if (ints == null || ints.length != rows) {
                return false;
            }
        }

        return true;
    }
}