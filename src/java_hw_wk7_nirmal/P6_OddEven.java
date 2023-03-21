package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
public class P6_OddEven {
    public static void main(String[] args) {
        P6_OddEven obj = new P6_OddEven();
        obj.myMethod();
    }
    public void myMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int num = scan.nextInt();
        if (num%2==0){
            System.out.println(num + " is an Even Number");
        }else System.out.println(num + " is an Odd Number");
        scan.close();
    }
}
