package day5;
import java.util.Random;
//Constant capital letter
// class Pascal
//Method camel case
//Variable Name camel case
//Constant capital letter

public class LottaryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    private static final int MIN_TICKET_NUMBER = 1;

    public static void main(String[] args) {
        int[] tic = generateTicketNumbers();
        printTicket(tic);
    }

    public static int[] generateTicketNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
              int  randomNumber = random.nextInt(MIN_TICKET_NUMBER, MAX_TICKET_NUMBER);
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static void printTicket(int[] tic) {
        // Inhanced for loop
        // Variable must in the same datatype of the array
        for (int number : tic) {
            System.out.print(number + " ");
        }

    }
}



//    public static void icket(int [] tic){
//        // Inhanced for loop
//        // Variable must in the same datatype of the array
//        for (int i=0 ; i<6;i++)
//        {
//            System.out.print(number+" ");
//
// }


