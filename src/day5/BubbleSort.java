package day5;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 8, 1, 2};

        bubbleSort(numbers);

        System.out.println("Sorted array using Bubble Sort: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        //or
        //  System.out.println(Arrays.toString(numbers));

    }

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
}
