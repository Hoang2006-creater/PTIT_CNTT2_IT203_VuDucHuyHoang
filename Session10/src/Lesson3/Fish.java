package Lesson3;

public class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Dang boi duoi nuoc");
    }
}
