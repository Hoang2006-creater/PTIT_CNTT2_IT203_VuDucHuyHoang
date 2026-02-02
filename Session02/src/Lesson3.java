import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Moi ban nhap so luong sach trả muộn: ");
        int outbook = sc.nextInt();
        double total=0;
        for(int i =1;i<=outbook;i++){
            System.out.println("Nhập số ngày trễ của cuốn thứ " +i + ":");
            int outdate=sc.nextInt();
            double fine = outdate * 5000;
            total+=fine;
        }
        System.out.println("Tổng tiền phạt "+ total);
    }
}