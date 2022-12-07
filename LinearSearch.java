package DataStructuresMoshHamedani.SearchingAlgorithm;

public class LinearSearch {

    public static void main(String[] args) {
        int numbers[] = new int[]{5, 1, 2, 6, 8, 3, 4, 7};
        int search = 8;
        System.out.println(linearSearch(numbers, search));
    }

    private static int linearSearch(int[] numbers, int search) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search)
                return i;
        }
        return -1;
    }
}
