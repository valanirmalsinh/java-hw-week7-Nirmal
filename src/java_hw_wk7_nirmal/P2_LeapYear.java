package java_hw_wk7_nirmal;

import java.util.Scanner;

public class P2_LeapYear {
    /**
     * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
     * not?
     */

    public void myMethod() {
        Scanner scan = new Scanner(System.in);
        // Scanner declaration
        System.out.println("Please enter a year: ");
        int year = scan.nextInt();
        // putting value in variable "year" from console
        boolean isLeapYear = (year % 4 == 0);
        // declaring boolean variable where the true condition is that year is divisible by 4
        isLeapYear = isLeapYear && (year %100!=0||year%400==0);
        //Also, adding few more conditions in the variable like divisible by 4, not by 100, or divisible by 400
        if(isLeapYear){
            System.out.println(year + " is a leap year"); // if the condition is true year is a leap year
           }else{
            System.out.println(year + " is not a leap year"); // if the condition is false year is not a leap year
        }
        scan.close();
    }

    public static void main(String[] args) {
        P2_LeapYear obj = new P2_LeapYear();
        // creating object
        obj.myMethod();
        // calling instance method with the object
    }
}
