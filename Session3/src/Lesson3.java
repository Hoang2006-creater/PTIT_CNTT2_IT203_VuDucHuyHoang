import java.util.Scanner;
public class Lesson3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = quantities[0];
        for (int i =1; i<quantities.length;i++){
            if(quantities[i]>max){
                max=quantities[i];
            }
        }
        System.out.println("Sach co so luong lon nhat " +max);

        for (int i =0;i<quantities.length;i++){
            if (quantities[i] == max){
                System.out.println("- " + names[i] + " : " + quantities[i]);
            }
        }
        System.out.println();
    }
    public static void  minQuantityOfBooks(String[] names, int[] quantities){
        int min = quantities[0];
        for (int i =1; i<quantities.length;i++){
            if(quantities[i]<min){
                min=quantities[i];
            }
        }
        System.out.println("Sach co so luong nhỏ nhất " +min);

        for (int i =0;i<quantities.length;i++){
            if (quantities[i] == min){
                System.out.println("- " + names[i] + " : " + quantities[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] books = {
                "Doraemon",
                "Dragon ball",
                "No Pain, No gain",
                "Naruto",
                "Ty quay"
        };
        int [] quantities = {10,25,25,5,5};
        minQuantityOfBooks(books, quantities);
        maxQuantityOfBooks(books, quantities);
    }
}