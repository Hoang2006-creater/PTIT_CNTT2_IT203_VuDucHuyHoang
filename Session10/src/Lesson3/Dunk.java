package Lesson3;

public class Dunk extends Animal implements Flyable,Swimmable {
    public Dunk(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Dang bay tren troi");
    }

    @Override
    public void swim() {
    System.out.println("Dang boi duoi nuoc");
    }
}
