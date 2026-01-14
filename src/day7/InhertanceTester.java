package day7;
import day4.Rectangle;

public class InhertanceTester  {
    public static void main(String[] args) {
//        Person p=new Person();
//
//
//        // before the employee constructor call the super (parents) class must called first
//        Employee e=new Employee();
//
//        Rectangle r=new Rectangle();
//        r.setLength(20);
//        r.setWidth(10);
//        System.out.println(r.calculatePerimeter());
//
//        Square s = new Square();
//        s.setLength(10);
//        System.out.println(s.calculatePerimeter());
        Woman w=new Woman();
        System.out.println("-------- ---");
        Mother m = new Mother();
        System.out.println(m.getName());
    }
}
