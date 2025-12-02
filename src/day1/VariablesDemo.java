package day1;
import java.util.Scanner;


public class VariablesDemo {
    public static void main(String[] args) {
//input
        Scanner v= new Scanner(System.in);
        System.out.print("Enter the first number (x): ");
        int x = v.nextInt();

        System.out.print("Enter the second number (y): ");
        int y = v.nextInt();

        System.out.println("The sum is " + (x + y));


    }
}