import java.util.Scanner;

public class Cau2Phan1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Moi ban nhap kich thuoc mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Moi ban nhap vi tri can xoa: ");
        int index = sc.nextInt();
        if (index < 0 || index >= n) {
            System.out.println("Vi tri khong hop le!");
            return;
        }
        int[] result = new int[n - 1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i != index) {
                result[j] = arr[i];
                j++;
            }
        }
        System.out.println("Mang sau khi xoa:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}