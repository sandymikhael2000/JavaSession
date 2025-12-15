package day6;

import java.util.Scanner;

public class MultidimensionalArray {
    static int[][] a;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        a = setMultiDimentionalArray();
        System.out.println("The two-dimensional array is:");
        printMultiDimentinalArray();
    }

    public static int[][] setMultiDimentionalArray() {
        System.out.println("Enter number of rows:");
        int numOfRow = scanner.nextInt();
        System.out.println("The number of rows: " + numOfRow);

        System.out.println("Enter number of columns:");
        int numOfCol = scanner.nextInt();
        System.out.println("The number of columns: " + numOfCol);


        a = new int[numOfRow][numOfCol];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        return a;
    }

    public static void printMultiDimentinalArray() {
        // Print the array in a formatted way
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // Print the number of rows and columns
        System.out.println("The number of rows: " + a.length);
        System.out.println("The number of columns: " + a[0].length);
    }
}