package com.company;

import java.util.Scanner;
public class CommissionPercentage {
    // Calculate Commission Percentage
    public static void main(String [] args){
        /*
        Commission Percentage = Commission Amount / Amount * 100
         */

        // Creating Scanner Object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Amount and Commission Amount From the User
        System.out.print(" Enter Amount: ");
        int amount = sc.nextInt();

        System.out.print(" Enter Commission Amount: ");
        int commissionAmount = sc.nextInt();

        // Calculating Commission Percentage
        float commissionPer =(float)(((float)(commissionAmount)/(float)(amount)) * 100);

        // Displaying Commission Percentage on the Screen
        System.out.println(" Commission Percentage is: " + commissionPer + "%");

    }
}
