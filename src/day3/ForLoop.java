package day3;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        double total =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num of items");
        int numberOfItems =scanner.nextInt();
        for(int i=0 ; i<numberOfItems;i++)
        {
            System.out.println("Enter the cost of item"+(i+1));
            double price =scanner.nextDouble();
            total=total+price;
        }
        System.out.println("The total price is "+total);
        scanner.close();

    }
}
