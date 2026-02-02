import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Moi ban nhap tuoi");
        int age = sc.nextInt();

        System.out.println("Moi ban nhap so sach dang muon");
        int books = sc.nextInt();
        if(age >= 18 && books <=3) {
            System.out.println("Ban du dieu kien muon sach quy hiem");
        } else if (age < 18 ) {
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("Bạn chưa đủ tuổi");
        } else {
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("Bạn đã mượn quá số lượng cho phép");
        }
    }
}