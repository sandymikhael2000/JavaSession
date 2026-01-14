package day8;
// abstract is a template
public  abstract class Shape {
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    double size;
    public abstract double calculateArea();
    public void  print()
    {
        System.out.println("I'm abstract class");
    }

    }

