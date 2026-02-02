import java.util.Scanner;

public class BTLE {

    public static int[] addNumber(int n) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static void displayNumbers(int[] arr) {
        System.out.println("Mảng vừa nhập:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 1. Kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0){
                return false;
            }
        return true;
    }

    public static void printPrimeNumbers(int[] arr) {
        System.out.println("Các số nguyên tố trong mảng:");
        for (int num : arr)
            if (isPrime(num))
                System.out.print(num + " ");
        System.out.println();
    }

    // 2. Kiểm tra Fibonacci
    public static boolean isFibonacci(int n) {
        if (n < 0) return false;
        int a = 0, b = 1;
        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return n == 0 || b == n;
    }

    public static void sumFibonacci(int[] arr) {
        int sum = 0;
        for (int num : arr)
            if (isFibonacci(num))
                sum += num;

        System.out.println("Tổng các số Fibonacci trong mảng: " + sum);
    }

    // 3. Tìm min – max
    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    // 4. Tính giai thừa
    public static long factorial(int n) {
        if (n < 0) return 0;
        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    public static void sumFactorials(int[] arr) {
        long sum = 0;
        for (int num : arr)
            sum += factorial(num);

        System.out.println("Tổng giai thừa các phần tử: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        int[] numberCodes = addNumber(n);

        displayNumbers(numberCodes);
        printPrimeNumbers(numberCodes);
        sumFibonacci(numberCodes);
        findMinMax(numberCodes);
        sumFactorials(numberCodes);
    }
}
