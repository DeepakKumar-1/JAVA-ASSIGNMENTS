package com.company;

import java.util.Scanner;
public class SimpleInterest {
    // Simple Interest
    public static void main(String [] args){
        /*
        Simple Interest can be Calculated as
        S.I = ( P*r*t )/ 100
        here,
           S.I --> Simple Interest
           P   --> Principal Amount
           r   --> Rate percentage
           t   --> Time Period
         */
        // Creating Scanner Object For Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking the Required Inputs from the USER
        System.out.print(" Enter Value of Principal Amount: ");
        int p = sc.nextInt();
        System.out.print(" Enter Rate (in %): ");
        int r = sc.nextInt();
        System.out.print(" Enter Time Period (in Year): ");
        int t = sc.nextInt();
        // Calculating Simple Interest
        float si = (float)(p * r * t)/ 100;

        // Display the Simple Interest on the Screen
        System.out.println(" You Entered ");
        System.out.println(" Principal Amount: ₹" + p);
        System.out.println(" Rate : " + r + "%");
        System.out.println(" Time Period: " + t + " years");
        System.out.println(" So, Simple Interest is: " + si);
    }
}
