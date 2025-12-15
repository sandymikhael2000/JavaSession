package day4;

import java.util.Scanner;

public class GreetUser {
    //Global Variables:
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String name =getUserName();
        greetUser(name);
        scanner.close();
    }
//Another way
//    static void  getUserName(){
//       Scanner scanner=new Scanner(System.in);
//       System.out.println("Enter the user name :");
//       String userName=scanner.nextLine();
//       System.out.println("Hello :"+userName);
//    }

    static String getUserName(){
       System.out.println("Enter the user name :");
       String userName=scanner.nextLine();
      return userName;
    }
    static void greetUser(String userName){
        System.out.println("Hello"+" "+userName);
    }
}
