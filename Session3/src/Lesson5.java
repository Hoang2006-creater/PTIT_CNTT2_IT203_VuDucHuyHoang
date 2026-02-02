import java.util.Scanner;
public class Lesson5 {

    public static int deleteBook (int[] arr, int n, int bookId){
        int pos = -1;
        for (int i =0;i<n;i++){
            if(arr[i] == bookId){
               pos = i;
               break;
            }
        }
        if(pos==-1){
            System.out.println("Khong thay sach co ma: "+bookId);
            return n;
        }
        for(int i =pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("Da xoa sach co ma" +bookId);
        return n-1;
    }

    public static void displayBooks(int []arr,int n){
        for (int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = {105,102,109,101,103};
        int n=5;
        int choice = -1 ;
        while(choice!=0 ){
            System.out.println("Nhap ma sach can xoa(0 de thoat): ");
            choice=sc.nextInt();
            n= deleteBook(arr,n,choice);
            displayBooks(arr,n);
        }
    }
}