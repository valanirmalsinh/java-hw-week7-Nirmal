package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class P18_SumValuesArray {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum of the array is:" + sum);
        scan.close();
    }
}
