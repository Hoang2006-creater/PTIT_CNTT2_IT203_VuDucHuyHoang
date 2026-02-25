package BTKT;

public abstract class Drink {
    protected int id;
    protected String name;
    protected double price;

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public abstract double calculatePrice();

    public void displayInfo(){
        System.out.println("Ma do uong"+id);
        System.out.println("Ten do uong"+name);
        System.out.println("Gia do uong"+price);
    }
}

