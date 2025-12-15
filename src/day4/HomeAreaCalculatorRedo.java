package day4;
import java.util.Scanner;
public class HomeAreaCalculatorRedo {
    static HomeAreaCalculatorRedo cal =new HomeAreaCalculatorRedo();
    public static void main(String[] args) {

      Rectangle kitchen=  cal.getDimensions();
        Rectangle bathroom=  cal.getDimensions();
        double totalArea= cal.calTotalArea(kitchen,bathroom);

        System.out.println("the total area : "+totalArea);
    }

    public  Rectangle getDimensions() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter room length");
        double length=scanner.nextDouble();

        System.out.println("Enter room width");
        double width=scanner.nextDouble();
        Rectangle room = new Rectangle();
        room.setLength(length);
        room.setWidth(width);
        return room;
    }

    public  double calTotalArea(Rectangle room1 ,Rectangle room2){
        return room1.calculateArea()+room2.calculateArea();

    }
}
