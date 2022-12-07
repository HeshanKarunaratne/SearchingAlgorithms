package DataStructuresMoshHamedani.SearchingAlgorithm;

import java.util.Arrays;

public class JumpSearch {

    public static void main(String[] args) {
        int[] array = new int[]{11, 9, 6, 5, 3, 18, 20, 21, 24, 30};
        int search = 30;

        System.out.println(jumpSearch(array, search));
    }

    private static int jumpSearch(int[] array, int search) {
        Arrays.sort(array);
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (start < array.length && array[next - 1] < search) {

            start = next;
            next += blockSize;

            if (next > array.length) next = array.length;
        }

        for (int i = start; i < next; i++) {
            if (array[i] == search) return i;
        }

        return -1;

    }
}
