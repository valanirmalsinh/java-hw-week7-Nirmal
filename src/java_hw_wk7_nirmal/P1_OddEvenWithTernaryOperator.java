package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class P1_OddEvenWithTernaryOperator {
    public void myMethod(){
        Scanner scan = new Scanner(System.in);
        //Declaring Scanner method
        System.out.println("Enter a Number: ");
        //printing a msg to enter any number
        int num = scan.nextInt();
        //assigning variable to the system input
        String msg = (num % 2 == 0) ? "Number is Even" : "Number is Odd";
        //displaying msg as per the condition using ternary operator
        System.out.println(msg);
        scan.close();
    }
    public static void main(String[] args) {
        P1_OddEvenWithTernaryOperator obj = new P1_OddEvenWithTernaryOperator();
        //object creation
        obj.myMethod();
        //calling instance method with the object
    }

}
