package DataStructuresMoshHamedani.SearchingAlgorithm;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[]{11, 9, 6, 5, 3, 18, 20, 21, 24, 30};
        int search = 30;

        System.out.println(binarySearchIterative(array, search));
        System.out.println(binarySearchRecursive(array, search));
    }

    private static int binarySearchIterative(int[] array, int search) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;
            if (array[middle] == search) return middle;

            if (array[middle] < search) left = middle + 1;

            if (array[middle] > search) right = middle - 1;

        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int search) {
        Arrays.sort(array);
        return binarySearchRecursive(array, search, 0, array.length - 1);

    }

    public static int binarySearchRecursive(int[] array, int search, int left, int right) {

        if (right < left) return -1;

        int middle = (left + right) / 2;
        if (array[middle] == search) return middle;

        if (array[middle] < search) return binarySearchRecursive(array, search, middle + 1, right);

        return binarySearchRecursive(array, search, left, middle - 1);

    }
}
