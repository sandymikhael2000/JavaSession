package day3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Do While Calculator
        boolean again;
        Scanner scanner=new Scanner(System.in);
    do{
        System.out.println("Enter first num");
        int num1=scanner.nextInt();
        System.out.println("Enter first num");
        int num2=scanner.nextInt();
int sum =num1+num2;
        System.out.println("The sum of the 2 numers is "+ sum);
        System.out.println("Do you want to repeat again ?");
        again =scanner.nextBoolean();
    }while (again);
    scanner.close();
    }
}
