package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class P12_InputValueNumAlphaSym {
    public void checkInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any single digit number, alphabet or symbol:");
        char a = scan.next().charAt(0);
        if (Character.isDigit(a)) {
            System.out.println("Input is a number.");
        } else if (Character.isAlphabetic(a)) {
            System.out.println("Input is an alphabet.");
        } else {
            System.out.println("Input is a Symbol.");
        }
        scan.close();
    }

    public static void main(String[] args) {
        P12_InputValueNumAlphaSym obj = new P12_InputValueNumAlphaSym();
        obj.checkInput();
    }
}
