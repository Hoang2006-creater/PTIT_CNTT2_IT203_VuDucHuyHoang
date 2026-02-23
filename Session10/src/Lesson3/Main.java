package Lesson3;

public class Main {
    public static void main(String[] args){
        Dunk dunk = new Dunk("Vit");
        Fish fish = new Fish("Ca");

        dunk.fly();
        dunk.swim();

        fish.swim();
    }
}
