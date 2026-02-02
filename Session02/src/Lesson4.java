import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bookID;
        do {
            System.out.println("Moi ban nhap  ma id sach moi: ");
            bookID = sc.nextInt();
            if(bookID<=0) {
                System.out.println("Mã không hợp lệ");
            }
        }while (bookID <=0);
        System.out.println("Lưu mã sách thành công");
    }
}