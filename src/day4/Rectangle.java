package day4;

public class Rectangle {
     static private double length=10;
      private double  width=20;
     private static double counter;

     public Rectangle()
     {
         System.out.println("I'm default constructor!!!");
         counter++;

     }
    public Rectangle(double length,double width)
    {
        System.out.println("I'm parameterized constructor!!!");
        this.length=length;
        setWidth(width); //this.width=width;
        counter++;
    }

    public static double getCounter() {
        return counter;
    }

    public  static void setLength(double l) {
        length = l;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

     double  calculateArea(){
//        double area=length*width;
//        return area;
        return length*width;
    }

    double calculatePerimeter(){
//        double perimeter=length*2+width*2;
//        return perimeter;
        return length*2+width*2;
    }
}
