package OnTap;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong mang");
        int n= sc.nextInt();
        int[] arr = new int[n];


        for (int i=0;i<n;i++){
            System.out.print("Nhap mang");
            arr[i]=sc.nextInt();
        }
        System.out.print("Nhap so can xoa");
        int x =sc.nextInt();
        int k = 0;

        for (int i=0;i<n;i++){
            if (arr[i]!=x){
                arr[k++]=arr[i];
            }
        }
        for (int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Kich thuoc mang con"+k);
    }
}
