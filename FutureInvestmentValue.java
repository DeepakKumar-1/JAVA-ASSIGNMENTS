package com.company;

import java.util.Scanner;

public class FutureInvestmentValue {
    // Future Investment Value
    public static void main(String [] args){
        /*
        Future Investment Value
         */

        // Creating Scanner Object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // taking Required Inputs from the user
        System.out.print(" Enter Present Value: ");
        int pv = sc.nextInt();

        System.out.print(" Enter Interest paid by Investment: ");
        int i = sc.nextInt();

        System.out.print(" Enter Number of Periods the Investment will be held: ");
        int n = sc.nextInt();

        // calculating Future Value
        int fv = pv * (int)(Math.pow(1+i , n));

        // Displaying Future Interest on the Screen
        System.out.println(" Future Interest is: " + fv);
    }
}
