package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________|
 */
public class P3_MarkSheet {
    String result;
    String grade;

    public static void main(String[] args) {
        P3_MarkSheet obj = new P3_MarkSheet();
        obj.markSheet();
    }

    public void markSheet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :");
        String Name = sc.nextLine();
        System.out.println("Enter 2 digit Roll No :");
        int roll = sc.nextInt();
        System.out.println("Enter marks in Math");
        int math = sc.nextInt();
        System.out.println("Enter marks in Science");
        int sci = sc.nextInt();
        System.out.println("Enter marks in English");
        int eng = sc.nextInt();
        int total = math + sci + eng;
        double percentage = total / 3;
        System.out.println(" -------------------------------");
        System.out.println("|           Mark  Sheet         |");
        System.out.println("|-------------------------------|");
        System.out.println("|Name      :   " + Name + "           |");
        System.out.println("|Roll No   :    " + roll + "              |");
        System.out.println("|-------------------------------|");
        System.out.println("|Subject   :    Marks           |");
        System.out.println("|-------------------------------|");
        if (math < 0 || sci < 0 || eng < 0 || math > 100 || sci > 100 || eng > 100) {
            System.out.println("Invalid Input. Marks should be between 0 - 100");
        } else {
            System.out.println("|Math      :   " + math + "               |");
            System.out.println("|Sci       :   " + sci + "               |");
            System.out.println("|Eng       :   " + eng + "               |");
        }
        System.out.println("|-------------------------------|");
        System.out.println("|Total     :   " + total + "              |");
        System.out.println("|-------------------------------|");
        System.out.println("|Percentage:   " + percentage + "             |");

        if (math < 35 || sci < 35 || eng < 35) {
            result = "fail";
            System.out.println("|Result    :      " + result + "          |");
        } else {
            result = "Pass";
            System.out.println("|Result    :      " + result + "          |");
        }
        if (percentage >= 80) {
            grade = "A+";
            System.out.println("|Grade     :     "+grade+"             |");
        }else if(percentage <80 && percentage >=60){
            grade = "A";
            System.out.println("|Grade     :     "+grade+"              |");
        }else if(percentage <60 && percentage >=50){
            grade = "B";
            System.out.println("|Grade     :     "+grade+"             |");
        }else if (percentage <50 && percentage >=35){
            grade = "Pass";
            System.out.println("|Grade     :     "+grade+"             |");
        }
        System.out.println("|-------------------------------|");
        sc.close();
    }
}
