package day5;

import java.util.Arrays;

public class BinarySearchWithoutSorted {
    public static void main(String[] args) {
        // Unsorted array
        int[] numbers = {5, 3, 8, 1, 2};
        int target = 3;

        System.out.println("UnSorted array: " +Arrays.toString(numbers));
        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers)); // Show the sorted array

        // Perform binary search
        int index = binarySearch(numbers, target);
        System.out.println("Index of " + target + " using Binary Search: " + index); // Output index
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                return mid; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}