package day7;

public class Zoo {
    public static void main(String[] args) {
//        Dog d= new Dog();
//        d.makeSound();

        //Polymorphism == many forms object
        // an --> polymorphic object
        // get only the method in base that share with the child

        // Reference of type parent pointed to the object from child
        Animal an =new Dog();
        an.makeSound();

        //Reference casting to the child because isn't found in the base class
        // Two types of casting 1) primitive casting 2) reference casting
        ((Dog)an).bite();
        feed(an);

        System.out.println("--------------");


        an=new Cat();
        an.makeSound();
        ((Cat)an).Scratch();
        feed(an);
    }




    public static void feed(Animal a)
    {
        // to check if the object type of dog+
        // any form of child pf the animal
     if (a instanceof Dog)
     {
         System.out.println("Here is your dog food");
     }
     else {
         System.out.println("Here is your cat food");
     }
    }
}
