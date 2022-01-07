package com.company;

import java.util.Scanner;
public class DepreciationOfValue {
    // Calculate Depreciation of Value
    public static void main(String [] args){
        /*
        Calculation of Depreciation of Value
                 v = v0(1 - r/100)^n
                 here
                 r% --> Rate of Depreciation per Year
                 n  --> Number of Years
                 v0 --> Present Value
                 v  --> Value After n Years
         */

        // Creating Scanner Object for Taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking All required Perimeters from the User
        System.out.print(" Enter Initial Value: ");
        float v0 = sc.nextInt();

        System.out.print(" Enter Rate of Depreciation: ");
        int r = sc.nextInt();

        System.out.print(" Enter Number of years: ");
        int n = sc.nextInt();

        // Calculating Depreciation value i.e Value after n Year
        float v = v0 * (float)(Math.pow((1 - (float)r/100), n));

        // Displaying Depreciation value i.e Value after n Year
        System.out.println(" Depreciation Value is: " + v );
    }
}
