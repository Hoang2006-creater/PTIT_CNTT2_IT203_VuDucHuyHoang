import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lesson2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm trể");
        int outDate = sc.nextInt();

        System.out.print("Nhập Số lượng sách mượn");
        int Book = sc.nextInt();

        double total = outDate * Book * 500;

        if (outDate >= 7 && Book >= 3) {
            total = total * 1.2;
        }
        boolean lock = total > 50000;
        System.out.println("Tổng tiền phạt: " + total + " VND");
        System.out.println("Yêu cầu khóa thẻ: " +lock);
    }
}