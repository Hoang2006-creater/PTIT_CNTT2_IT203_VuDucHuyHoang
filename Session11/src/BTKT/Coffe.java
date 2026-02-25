package BTKT;

public class Coffe extends Drink{
    boolean hasMilk;
    public Coffe(int id, String name, double price,boolean hasMilk) {
        super(id, name, price);
        this.hasMilk=hasMilk;
    }

    @Override
    public double calculatePrice() {
        if(hasMilk){
             return price+=5000;
        }else {
           return price;
        }
    }

    @Override
    public void displayInfo() {
        if (hasMilk){
            System.out.println("Co sua");
        }else {
            System.out.println("Den da");
        }
    }
}

