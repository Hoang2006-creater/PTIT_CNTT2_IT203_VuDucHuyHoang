import java.util.Scanner;

public class Cau2Phan2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Moi ban nhap so phan tu trong mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int tongThucTe = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Moi ban nhap phan tu vao mang: ");
            arr[i] = sc.nextInt();
            tongThucTe += arr[i];
        }

        int tongDung = (n + 1) * (n + 2) / 2;

        int soThieu = tongDung - tongThucTe;

        System.out.println("So con thieu la: " + soThieu);
    }
}