package day7;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
    public void bite()
    {
        System.out.println("I'm dog ,I Bit");
    }
    public void print(String name)
    {
        System.out.println("I'm animal print");
    }
}
