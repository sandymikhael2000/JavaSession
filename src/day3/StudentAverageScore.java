package day3;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {
        int numOfStudent=3;
        int numOfCourse=4;
        Scanner scanner=new Scanner(System.in);
        for (int i=0 ; i<numOfStudent;i++){
        double total =0;
        for(int j=0 ; j<numOfCourse ; j++){
            System.out.println("Please enter score for course "+(j+1)
            +"for student " +(i+1));
            double score =scanner.nextDouble();
            total=total+score;
            }
        double avg =total/numOfCourse;
            System.out.println("The average score of student "+(i+1)+"is"+avg);
        }
        scanner.close();
    }

}
