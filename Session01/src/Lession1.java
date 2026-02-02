import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lession1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập ID sách");
        String bookID =sc.nextLine();

        System.out.print("Nhập tên sách");
        String bookName  =sc.nextLine();

        System.out.print("Nhập năm xuất bản");
        int publishYear  =sc.nextInt();

        System.out.print("Nhap giá bìa");
        double price  =sc.nextDouble();

        System.out.print("Sách còn trong kho");
        boolean isAvailable  =sc.nextBoolean();

        int bookAge =2026 -publishYear;

        String upperBookName=bookName.toUpperCase();
        String formattedPrice =String.format("%.2f",price);
        String status =isAvailable ? "Còn Sách":"Đã mượn";
        System.out.println("\n Thông tin sách ");
        System.out.println("ID: " + bookID);
        System.out.println("Tên: " + upperBookName);
        System.out.println("Năm XB: " + publishYear);
        System.out.println("Giá: " + formattedPrice);
        System.out.println("Còn hàng: " + status);
    }
}

