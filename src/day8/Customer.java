package day8;

public class Customer {
    public static void main(String[] args) {
        // Error can't be instantiated
        //Product p= new Product();

        Product p =new Book();
        p.setColor("black");
        System.out.println(p.getColor());

      //Used casting
        ((Book)p).setName("Sandy");
        System.out.println( ((Book)p).getName());
    }

}
