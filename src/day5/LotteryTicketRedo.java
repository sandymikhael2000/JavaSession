package day5;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicketRedo {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    private static final int MIN_TICKET_NUMBER = 1;
    public static void main(String[] args) {
        int[] tic = generateTicketNumbers();
        // to sort
        Arrays.sort(tic);
        printTicket(tic);
        int index = Arrays.binarySearch(tic, 20);
        if (index < 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + index );
        }
    }
        public static int[] generateTicketNumbers() {
            int[] ticket = new int[LENGTH];
            Random random = new Random();
            for (int i = 0; i < ticket.length; i++) {
                int randomNumber;
                do {
                    randomNumber = random.nextInt(MIN_TICKET_NUMBER, MAX_TICKET_NUMBER);

                } while (search(ticket, randomNumber));
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
// more professtinal way (Java Doc)
    // /** then enter
    /**
     * This method search through
     * @param ticket array to search through an array seq:
     * @param number number to search for
     * @return true if found and false if not found
     */

        public static boolean search(int[] ticket, int number) {
            for (int value : ticket) {
                if (value == number) {
                    return true;
                }
            }
            return false;
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





