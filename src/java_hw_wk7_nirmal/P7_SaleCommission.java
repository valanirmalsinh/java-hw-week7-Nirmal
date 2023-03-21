package java_hw_wk7_nirmal;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class P7_SaleCommission {
    public void myMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Sales ID:");
        int id = scan.nextInt();

        System.out.println("Please enter seller's Name: ");
        String name = scan.next();

        System.out.println("Please enter the Sales amount:");
        int sales = scan.nextInt();

        System.out.println("please enter the Basic Salary:");
        int basic = scan.nextInt();

        int comm;
        if (sales >=50000){
            comm = sales * 35 / 100;
            System.out.println("Commision is "+comm);
        }else if(sales >= 30000){
            comm = sales * 20 / 100;
            System.out.println("Commision is "+comm);
        }else if (sales >= 20000){
            comm = sales * 10 / 100;
            System.out.println("Commision is "+comm);
        }else if (sales >= 10000){
            comm = sales * 5 / 100;
            System.out.println("Commision is "+comm);
        }else{
            comm = sales * 2 / 100;
            System.out.println("Commision is "+comm);
        }
        scan.close();
    }

    public static void main(String[] args) {
        P7_SaleCommission obj = new P7_SaleCommission();
        obj.myMethod();
    }
}
