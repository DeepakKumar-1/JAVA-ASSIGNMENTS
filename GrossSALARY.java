package com.company;

import java.util.Scanner;
public class GrossSALARY {
    // Gross Salary of An Employee
    public static void main(String [] args){
        /*
        Gross Salary = Basic Salary  + HRA + DA
        here,
             HRA --> House Rent Allowance
             DA  --> Dearness Allowance

           Let us take this scenario
        1. If the Basic Salary is less than or equal to 10000 then HRA = 8% of the basic, and DA = 10% of the basic
        2. Basic Salary is less than or equal to 20000 then HRA = 16% and DA = 20%
        3. Basic Salary is greater than 20000 then HRA = 24% and DA = 30%

         */
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // taking Basic Pay as a input from the USER
        System.out.print(" Enter Your Basic Salary: ");
        int basicPay = sc.nextInt();
        float hra = 0;
        float da = 0;
        if(basicPay <= 10000){
            hra = (float)(basicPay * 0.08);
            da  = (float)(basicPay * 0.1);

        } else if(basicPay <= 20000){
            hra = (float)(basicPay * 0.16);
            da  = (float)(basicPay * 0.2);
        } else {
            hra = (float)(basicPay * 0.24);
            da  = (float)(basicPay * 0.3);
        }

        // Calculation of gross salary
        float grossSalary = basicPay + hra + da;
        // Display the Gross Salary
        System.out.println(" Gross Salary is: " + grossSalary);
    }
}
