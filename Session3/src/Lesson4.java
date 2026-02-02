import java.util.Scanner;
public class Lesson4 {

    public static void sortBooks(int[] arr) {
        int n = arr.length;
//        for(int i = 0;i<n-1;i++){
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

    }

    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,2,11,9};
        sortBooks(arr);
        displayBooks(arr);
    }
}