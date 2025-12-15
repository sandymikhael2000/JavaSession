package day5;



public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        int target = 3;

        int index = linearSearch(numbers, target);
        System.out.println("Index of " + target + " using Linear Search: " + index);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}
