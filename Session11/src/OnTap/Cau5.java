package OnTap;

import java.util.Scanner;

public class Cau5 {

    public static boolean isExist(int[] arr, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {

            boolean foundInB = false;

            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    foundInB = true;
                    break;
                }
            }

            if (foundInB && !isExist(result, size, A[i])) {
                result[size++] = A[i];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}