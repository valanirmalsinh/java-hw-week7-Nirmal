package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 9. Same as program-8 using switch statement
 */
public class P9_CityNameSwitch {
    public static void main(String[] args) {
        P9_CityNameSwitch obj = new P9_CityNameSwitch();
        obj.city();
    }

    public void city() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet between A - F");
        String city = scan.next();
        String a = city.toUpperCase();
        switch (a) {
            case "A":
                System.out.println("Allahbad");
                break;
            case "B":
                System.out.println("Boston");
                break;
            case "C":
                System.out.println("Caracas");
                break;
            case "d":
                System.out.println("Dublin");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Florence");
                break;
            default:
                System.out.println("Invalid Entry");
                scan.close();
        }
    }
}


