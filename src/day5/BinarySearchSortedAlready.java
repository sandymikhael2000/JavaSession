package day5;
public class BinarySearchSortedAlready {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8}; // This array must be sorted
        int target = 5;

        int index = binarySearch(numbers, target);
        System.out.println("Index of " + target + " using Binary Search: " + index); // Output: Index of 3: 2
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