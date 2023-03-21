package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 *  _______________________________
 * | Salary Slip                  |
 * |______________________________|
 * | Employee Id     : 2564       |
 * | Employee Name   : Jay        |
 * |______________________________|
 * | Basic Salary    : 25000.0    |
 * | HRA 10%         : 2500.0     |
 * | TA 8%           : 2250.0     |
 * | DA 9%           : 2000.0     |
 * | PF - 20&        : 5000.0     |
 * |______________________________|
 * | Gross Salary : 26750.0       |
 * | ===========================  |
 */
public class P5_SalarySlip {
    public static void main(String[] args) {
        P5_SalarySlip obj = new P5_SalarySlip();
        obj.salary();
    }
    public void salary(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your Employee ID:");
        int id = scan.nextInt();
        System.out.println("Please enter Employee Name: ");
        String name = scan.next();
        System.out.println("Please input the Basic Salary: ");

        double salary = scan.nextDouble();
        double hra = salary * 0.10;
        double da = salary * 0.08;
        double ta = salary * 0.09;
        double pf = salary * 0.20;
        double gs = salary + hra + da + ta - pf;
        System.out.println("-----------------------------");
        System.out.println("|        Salary Slip        |");
        System.out.println("-----------------------------");
        System.out.println("| Employee ID   :   "+id+"     |");
        System.out.println("| Employee Name :   "+name+"  |");
        System.out.println("-----------------------------");
        System.out.println("| Basic Salary  :   "+salary+" |");
        System.out.println("| HRA 10%       :   "+hra+"   |");
        System.out.println("| TA 8%         :   "+ta+"    |");
        System.out.println("| DA 9%         :   "+da+"    |");
        System.out.println("| PF -20%       :   "+pf+"    |");
        System.out.println("-----------------------------");
        System.out.println("| Basic Salary  :   "+gs+"  |");
        System.out.println("=============================");

        scan.close();


    }
}
