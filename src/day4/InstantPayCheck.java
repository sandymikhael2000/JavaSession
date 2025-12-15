package day4;
import java.util.Scanner;

public class InstantPayCheck {
    //what we have
//    static double  requiredSalay=20000;
//    static  final double   requiredCreditScore=700;
    //what we need to get
    static Scanner scanner=new Scanner(System.in);
    static double  requiredSalay=20000;
    static  final double   requiredCreditScore=700;
    public final static void main(String[] args) {
      double s=  getEmployeeSalary();
       double c= getEmployeeCreditScore();
        boolean q =isQualified(s,c);
        notifyUser(q);
    }
    static  double getEmployeeSalary()
    {
        System.out.println("Enter your salary ");
        double salary =scanner.nextDouble();
       return salary;

    }

    static  double getEmployeeCreditScore()
    {
        System.out.println("Enter your credit score ");
        double creditScore=scanner.nextDouble();
        return creditScore;

    }
    static boolean isQualified(double s ,double c){
      if (s>requiredSalay&&c>requiredCreditScore){
          return true;
      }
      else {
          return false;
      }
    }
    static void notifyUser(boolean qualified)
    {
        if (qualified==true){
            System.out.println("Congratulation!! , Your're Qualified for the loan");
        }
        else {
            System.out.println("Sorry you're not qualified");
        }
    }

}
