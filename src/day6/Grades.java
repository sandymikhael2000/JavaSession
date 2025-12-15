package day6;

import java.util.Scanner;

public class Grades {
    private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
  int []grades=  getGrades();
    printGrades(grades);
    calculateAvg(grades);
    sum(grades);
    double cal=calculateAvg(grades);
        System.out.println("The average score is  "+cal);
       int highest= getHightest(grades);
        System.out.println("The highest score is  "+highest);
       int lowest= getLowest(grades);
        System.out.println("The lowest score is  "+lowest);
    }
    public static int[] getGrades()
    {
        int [] grades;

        System.out.println("How many grades you want to enter ?");
        int length=scanner.nextInt();
        grades=new int[length];
        for (int i=0 ; i<grades.length;i++)
        {
            System.out.println("Please enter grade "+(i+1));
            grades[i]=scanner.nextInt();
        }
        return grades;
    }

    public static void printGrades(int [] grades)
    {
    for (int grade:grades)
    {
    System.out.println(grade);
    }
    }
    public static double  calculateAvg(int []grades){
     return sum(grades)/grades.length;
    }

    public static int sum(int [] grades)
    {
        int sum=0;
        for (int grade:grades)
        {
            sum+=grade;
        }
        return sum;
    }

    public static int getHightest(int [] grades)
    {
        int hight=grades[0];
        for (int grade :grades)
        {
            if (grade>hight)
            {
                hight=grade;
            }
        }
        return hight;
    }

    public static int getLowest(int [] grades)
    {
        int lowest=grades[0];
        for (int grade :grades)
        {
            if (grade<lowest)
            {
                lowest=grade;
            }
        }
        return lowest;
    }
}
