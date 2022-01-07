package com.company;

import java.util.Scanner;
public class ElectricityBill {
    // Calculate Electricity Bill
    public static void main(String[] args) {
        /*
            1 - 100 unit -> 5/-
            101-200 unit -> 7/-
            201-300 unit -> 10/-
            above 300    -> 15/-
         */

        // Creating Scanner Object for taking input from the User
        Scanner sc = new Scanner(System.in);

        // taking units as A input from the User
        System.out.print(" Enter Units: ");
        long units = sc.nextLong();

        float amount;

        if(units <= 100){
            amount = units * 5;
        } else if(units <= 200){
            amount = ((100 * 5) + ((units - 100) * 7));
        } else if(units <= 300){
            amount = ((100 * 5) + (200 * 7) + ((units - 300)*10) );
        } else{
            amount = ((100 * 5) + (200 * 7) +(300 * 10) + ((units - 700)*15));
        }

        System.out.println(" Bill Amount to Pay: " + amount);


    }
}
