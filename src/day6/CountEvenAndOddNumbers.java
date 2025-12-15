package day6;
import java.util.Scanner;

public class CountEvenAndOddNumbers {
    static Scanner scanner=new Scanner(System.in);
   static int EvenCount=0;
   static int OddCount=0;
    public static void main(String[] args) {
        int arr[] =setArray();
       countEvenAndOdd(arr);
    }
    public static void countEvenAndOdd(int a[])
    {
   for (int num :a)
   {
       if (num%2==0)
       {
           EvenCount++;
       }
       else {
           OddCount ++;
       }
   }
        System.out.println("The number of even count is "+EvenCount);
        System.out.println("The number of odd count is "+OddCount);
    }
    public static int []setArray(){
        int a[];
        System.out.println("Enter the length of the array:");
        int length=scanner.nextInt();
        a=new int[length];

        System.out.println("Enter the array value:");
        for (int i=0 ; i<a.length; i++)
        {
            a[i]=  scanner.nextInt();
        }
        return a;
    }
}
