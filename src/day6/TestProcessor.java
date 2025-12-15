package day6;
// String immutable --> can't be change
//StringBuffer or StringBuilder mutable --> can be change
// delimeter , if i want use . should be like this \\.
public class TestProcessor {
    public static void main(String[] args) {
        countWord("I Love Route");
        reverseText("sandy");
        addSpace("ILoveRoute");

    }

   public  static void countWord(String text){
     String[] words =  text.split(" ");
     //or
//     String message =String.format("Your test contain %d words",words.length);
//       System.out.println(message);
       System.out.println("The number of word is "+words.length);
       for (String word : words){
           System.out.println(word);
       }
   }
   public static void reverseText(String text)
   {
for (int i =text.length()-1; i>=0 ; i--)
{
    System.out.print(text.charAt(i));
}
   }

    // or
//    public static void reverseText(String text)
//    {
//        String reverse=" ";
//        for (int i =text.length()-1; i>=0 ; i--)
//        {
//            reverse=reverse+text.charAt(i);
//        }
//        System.out.println(reverse);
//    }
    public static void addSpace(String text){
        StringBuilder modifiedText=new StringBuilder();
        for (int i =1 ; i<modifiedText.length();i++)
        {
          if(Character.isUpperCase(modifiedText.charAt(i)))
            {
                modifiedText.insert(i," ");
                i++;
            }
        }
       System.out.println(modifiedText);
        }

}
