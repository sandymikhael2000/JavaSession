package day3;

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        System.out.println("Enter some Text");
        String text =scanner.nextLine();
        scanner.close();
        boolean LetterFound=false; // Flag
        int position=0;
        for(int i=0 ; i<text.length();i++)
        {
          char currentLetter=  text.charAt(i);
          if(currentLetter=='A'|| currentLetter=='a'){
              position=i+1;
              LetterFound=true;
              break;
          }
        }if (LetterFound==true){
            System.out.println("Letter A found at position "+" "+position);
        }
        else {
            System.out.println("Letter A not found");
        }
    }
}
