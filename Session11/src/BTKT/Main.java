package BTKT;

public class Main {
    public static void main(String[] args){
        Drink[] drinks =new Drink[3];
        drinks[0]= new Coffe(1,"Bac siu",30000,true);
        drinks[1]=new FruitJuice(2,"Nuoc cam",40000,10);
        drinks[2]=null;

        for (Drink drink : drinks) {
            if (drink != null) {
                System.out.println("HOA DON");
                drink.displayInfo();

                System.out.println("Thanh tien: " + drink.calculatePrice());
                if (drink instanceof IMixable) {
                    ((IMixable) drink).mix();
                }
                System.out.println();
            }
        }
    }
}
