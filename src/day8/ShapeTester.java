package day8;

public class ShapeTester {
    public static void main(String[] args) {
        // we did the object type of rectangle not shape
        //because it's abstract


        // Polymorphism
        Shape s=new Rectanglee();
            System.out.println(s.calculateArea());
            //s.print();
        s.setSize(50);
        System.out.println(s.getSize());

        //Casting
        ((Rectanglee)s).getLength();

        //OR This
            Rectanglee r=new Rectanglee();
            r.print();





    }
}
