import java.util.Scanner;
public class Lesson1 {

    public static int [] addBook(int n){
        Scanner sc=new Scanner(System.in);
        int [] books=new int[n];

        for (int i =0;i<n;i++){
            System.out.println("Nhập mã sách thứ "+(i+1)+ ":");
            books[i]=sc.nextInt();
        }
        return books;
    }

    public static void displayBooks(int []arr){
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập số lượng sách n: ");
        int n =sc.nextInt();

        int [] bookCodes = addBook(n);

        displayBooks(bookCodes);
        }
    }