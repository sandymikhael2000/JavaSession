package day6;
import java.util.Scanner;

public class RepetitionOfCertainNumber {
static int count=0;
  static   Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        int arr[] =setArray();
        System.out.println("Enter the repetition value : ");
       int reptValue=scanner.nextInt();
        coutRepetitionValue(arr,reptValue);

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

   public static void coutRepetitionValue(int a[],int reptValue)
   {
     for(int value :a)
     {
         if (value==reptValue)
         {
             count+=1;
         }
     }
       System.out.println("The Repetition Value is : "+count);
   }

}
