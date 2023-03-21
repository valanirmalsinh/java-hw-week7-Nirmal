package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class P8_CityNameIfElse {
    public void city() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input any  alphabet from A TO F");
        String a = scan.next();
        if (a.equalsIgnoreCase("A")) {
            System.out.println("Ahmedabad");
        } else if (a.equalsIgnoreCase("B")) {
            System.out.println("Bombay");
        } else if (a.equalsIgnoreCase("C")) {
            System.out.println("Calcutta");
        } else if (a.equalsIgnoreCase("D")) {
            System.out.println("Delhi");
        } else if (a.equalsIgnoreCase("E")) {
            System.out.println("Etawa");
        } else if (a.equalsIgnoreCase("F")) {
            System.out.println("Fatehpur Sikri");
        } else {
            System.out.println("Invalid entry");
        }
        scan.close();
    }

    public static void main(String[] args) {
        P8_CityNameIfElse obj = new P8_CityNameIfElse();
        obj.city();
    }
}
