package java_hw_wk7_nirmal;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class P11_NumDivBy3Or5 {
    public static void numDivBy3() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void numDivBy5() {
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("numbers divisible by 3");
        numDivBy3();
        System.out.println("numbers divisible by 5");
        numDivBy5();
    }
}