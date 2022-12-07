package DataStructuresMoshHamedani.SearchingAlgorithm;

import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] array = new int[]{11, 9, 6, 5, 3, 18, 20, 21, 24, 30};
        int search = 34;

        System.out.println(exponentialSearch(array, search));
    }

    private static int exponentialSearch(int[] array, int search) {
        Arrays.sort(array);
        int bound = 1;

        while (bound < array.length && array[bound] < search) {
            bound *= 2;
        }
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);

        return BinarySearch.binarySearchRecursive(array, search, left, right);
    }
}
