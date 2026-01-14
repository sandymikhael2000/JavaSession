package day8;

public class Rectanglee extends Shape {
    private double length=10;
    private  double width=20 ;

    @Override
    public double calculateArea() {
       return length*width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
