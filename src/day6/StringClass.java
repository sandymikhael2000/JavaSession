package day6;

//Class ---->
// String Builder or String Buffer
// String
//Integer
//Character
//Double
public class StringClass {
    public static void main(String[] args) {
        // To prove that the String immuatable --> can't be change
//        String name = "     sandy";
//        String name2 =name.trim();
//
//        System.out.println(name);
//        System.out.println(name2);
//        System.out.println(name.trim());
//        name ="Samir";
//        System.out.println(name);

// String Pole --> has all the string  if you want to intailize sandy like this String s1 = "sandy" plus it pointed at the same reference
        String s1="sandy";
        String s2="sandy";
        // String pole plus has copy in Heap memory and referece pointed in heap
        String s3=new String("sandy");
        String s4 =new String("sandy");

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
    }
}
