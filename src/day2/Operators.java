package day2;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators:
        /*System.out.println("The sum is"+" " +a+b);
        System.out.println("The sub is"+" " +(a-b));
        System.out.println("The mult is"+" " +(a*b));
        System.out.println("The divi is"+" " +(a/b));
        System.out.println("The  Remainder " +(a%b));
    }
        /*
        // Relatinal / comparsion
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        */

        //Increment & Decrement
//        int a = 10;
//        int b =a++; // from left to right
//        System.out.println(a); //11
//        System.out.println(b);//10
//         b=++a;
//        System.out.println(a);//12
//        System.out.println(b);//12
//        System.out.println(b++);//12
//        System.out.println(b++);//13
//        System.out.println(b);//14
//        System.out.println(++b);//15

//        int x = 10;
//        x++;
//        int y=x;
//        System.out.println(y); //11
//
//        int a= 10;
//        ++a;
//        int b=a;
//        System.out.println(b);//11

// Comditional OR ternary(IMPORTANT)
// var = exp? true :false
//int a=20,b=10;
//int c =a>b ?a:b;
//System.out.println(c);

        // unary a++ ,a--
        //a+b , a>b
        //var = exp? true :false

      // #######################################################################################################
                // Example of assignment and equality
                int a = 5; // Assignment
                int b = 5; // Assignment

                // Checking equality
                System.out.println("a == b: " + (a == b)); // Output: true

                // Using unary operators
                a++; // Increment
                System.out.println("After incrementing, a: " + a); // Output: 6

                // Using binary operators
                int sum = a + b; // Addition
                System.out.println("Sum of a and b: " + sum); // Output: 11

                // Using ternary operator
                int max = (a > b) ? a : b; // Assigning the greater value
                System.out.println("Max value: " + max); // Output: 6 (since a is greater)

                // Using a nested example
                int c = 10;
                int d = 20;

                System.out.println("c == d: " + (c == d)); // Output: false
                System.out.println("c + d: " + (c + d)); // Output: 30
                System.out.println("Is c the maximum? " + (c > d ? "Yes" : "No")); // Output: No
            }


}
