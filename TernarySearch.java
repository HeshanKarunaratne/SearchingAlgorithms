package DataStructuresMoshHamedani.SearchingAlgorithm;

import java.util.Arrays;

public class TernarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{11, 9, 6, 5, 3, 18, 20, 21, 24, 30};
        int search = 12;

        System.out.println(ternarySearchRecursive(array, search));
    }

    public static int ternarySearchRecursive(int[] array, int search) {
        Arrays.sort(array);
        return ternarySearchRecursive(array, search, 0, array.length - 1);
    }

    private static int ternarySearchRecursive(int[] array, int search, int left, int right) {

        if (right < left) return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (search > array[mid2]) return ternarySearchRecursive(array, search, mid2 + 1, right);

        if (search == array[mid2]) return mid2;

        if (search < array[mid2] && search > array[mid1])
            return ternarySearchRecursive(array, search, mid1 + 1, mid2 - 1);

        if (search == array[mid1]) return mid1;

        if (search < array[mid1]) return ternarySearchRecursive(array, search, left, mid1 - 1);

        return -1;
    }
}
