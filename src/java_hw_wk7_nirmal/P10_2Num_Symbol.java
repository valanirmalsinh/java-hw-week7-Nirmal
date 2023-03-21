package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class P10_2Num_Symbol {
    public static void main(String[] args) {
        P10_2Num_Symbol obj = new P10_2Num_Symbol();
        obj.simpleMath();
    }
    public void simpleMath(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number 1:");
        int num1 = scan.nextInt();
        System.out.println("Input Number 2:");
        int num2 = scan.nextInt();
        System.out.println("Enter any calculation symbol from (+, -, *, /)");
        char sym = scan.next().charAt(0);

        if (sym == '+'){
            System.out.println("Number 1 + Number 2 is = "+(num1+num2));
        }else if(sym == '-'){
            System.out.println("Number 1 - Number 2 is = "+(num1-num2));
        }else if(sym == '*'){
            System.out.println("Number 1 x Number 2 is = "+(num1*num2));
        }else if(sym == '/'){
            System.out.println("Number 1 / Number 2 is = "+(num1/num2));
        }
        scan.close();
    }
}
