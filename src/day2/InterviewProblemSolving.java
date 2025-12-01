package day2;

public class InterviewProblemSolving {
    public static void main(String[] args) {
        // Swapping two numbers
//        int a=10;
//        int b =20;
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("The value of a "+ a);
//        System.out.println("The value of b "+ b);

        //

        int a=10 , b=20;
        //Another way without using temp
        a=a+b;
        System.out.println(a);
        b=a-b;
        System.out.println(b);
        a=a-b;
        System.out.println(a);
        System.out.println("The value of a "+ a);
        System.out.println("The value of b "+ b);
    }
}
