package day4;

public class RoomAreaCalculator {
    public static void main(String[] args) {
        // I did that because i made the setlength() method static that's why i can call it with the name of the class not
        // with the object + don't use this word if it's static
        Rectangle room1=new Rectangle();
        Rectangle.setLength(10);
        Rectangle.setLength(20);

        //or  without static
//        Rectangle room1=new Rectangle();
//        room1.setLength(10);

      double area=  room1.calculateArea();
        System.out.println("The counter ");
        System.out.println(Rectangle.getCounter());


        System.out.println("The area of room1 is : "+area);
        double perimeter =room1.calculatePerimeter();
        System.out.println("The perimeter of room1 is: "+perimeter);

        System.out.println("___________________________________");
        Rectangle room2=new Rectangle();
        System.out.println("The counter ");
        System.out.println(Rectangle.getCounter());
        double area2=  room2.calculateArea();
        System.out.println("The area of room2 is : "+area2);
        double perimeter2 =room2.calculatePerimeter();
        System.out.println("The perimeter of room2 is: "+perimeter2);

    }
}
