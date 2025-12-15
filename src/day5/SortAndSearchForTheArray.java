package day5;

import java.util.Arrays;

public class  SortAndSearchForTheArray{
        public static void main(String[] args) {
            int[] numbers = {5, 3, 8, 1, 2};
            int target = 3;

            // Sort the array using Bubble Sort
            bubbleSort(numbers);
            System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(numbers));

            // Perform Binary Search
            int index = binarySearch(numbers, target);
            if (index != -1) {
                System.out.println("Index of " + target + " using Binary Search: " + index);
            } else {
                System.out.println(target + " not found in the array.");
            }
        }

        // Bubble Sort Method
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                // Last i elements are already sorted
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        // Binary Search Method
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

