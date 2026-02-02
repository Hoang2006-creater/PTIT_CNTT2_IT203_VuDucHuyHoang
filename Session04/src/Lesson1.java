import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ten sach");
        String title = sc.nextLine();

        System.out.println("Nhap vao tac gia");
        String author = sc.nextLine();

        String fixTitle =title.trim().toUpperCase();
        String fixAuthor = author.trim().toLowerCase();

        System.out.printf("[%s]-Tac gia: %s",fixTitle,fixAuthor);
    }
}