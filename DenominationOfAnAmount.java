package com.company;

import java.util.Scanner;
public class DenominationOfAnAmount {
    // Denomination of An Amount
    public static void main(String [] args){
        /*
                 Enter Amount: 542
                 Denominations of 542 are
                500 * 1 = 500
                20 * 2 = 40
                1 * 2 = 2
         */

        // Creating Scanner object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Denominations Array
        int [] denominations = {500, 100, 50, 20, 10, 1};
        // Take Amount from the USER
        System.out.print(" Enter Amount: ");
        int amount = sc.nextInt();

        System.out.println(" Denominations of " + amount + " are ");
        // For Every Denomination in Denominations
        for (int denomination : denominations) {
            // Find Number of Notes
            int notes = amount / denomination;
            if (notes >= 1) {    // if Notes are Greater than 1
                // Remaining Amounts
                amount = amount % denomination;
                System.out.println(denomination + " * " + notes + " = " + (notes * denomination));
            }
        }
    }
}
