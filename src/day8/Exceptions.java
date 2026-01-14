package day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
         // createFile();
        // numberExceptionHandling();
        try {
            createFileRethrow();
            System.out.println(" File is found");
        } catch (IOException e) {
            System.out.println("File is not found");
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

    public static void createFile() {
        File f = new File("resource/nonexist.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("The file isn't exist");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

    //Antohr way other than handle exception is ( throw an exception)
    public static void createFileRethrow() throws IOException {
        File f = new File("resourcee/num.txt");
           boolean v= f.createNewFile();
        System.out.println(v);

    }


    public static void numberExceptionHandling() {
        File f = new File("resource/numbers.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
            while (scanner.hasNext()) {
                double num = scanner.nextDouble();
                System.out.println(num);
            }
//       } catch (FileNotFoundException e) {
//          System.out.println("File not found");
//         e.printStackTrace();
//       }catch (InputMismatchException e )
//     {
//          e.getMessage();
//          // e.printStackTrace();
//        }
//=================================================
            // or you can use
        } catch (FileNotFoundException | InputMismatchException e) {
            e.getMessage();
            // e.printStackTrace();
        }

        // to force this line to run + should be in try/ catch
        finally {
            scanner.close();
        }


        System.out.println("Hello");
    }
}



    // Or another way is called ( try with resources) + to grantee that it can run the scanner.close (specific resource)
//in the level of try/catch
//    File f=new File("resource/nonexist.txt"); // resources close automatically
//      try (Scanner scanner = new Scanner(f)){
//
//        while (scanner.hasNext()) {
//            double num = scanner.nextDouble();
//            System.out.println(num);
//        }

//    }catch (FileNotFoundException | InputMismatchException e)
//    {
//        e.getMessage();
//        // e.printStackTrace();
//    }
//    }}
