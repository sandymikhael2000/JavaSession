package day7;

public class Woman extends Person{
    public String getMentalState() {
        return mentalState;
    }

    public void setMentalState(String mentalState) {
        this.mentalState = mentalState;
    }

    private String mentalState;

    public Woman()
    {
        System.out.println("I'm woman default constructor   ");
        setName("Sandy");
    }
}
