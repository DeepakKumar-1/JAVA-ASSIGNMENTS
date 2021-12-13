package com.company;

import java.util.Scanner;
public class VoteEligibilityChecker {
    // voting Eligibility Checker
    public static void main(String [] args){
        /*
        EXPLANATION:
            One can vote if he/she's age is Greater than or Equal to 18
         */
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Age of the USER as a INPUT
        System.out.print(" Enter Your Age: ");
        int age = sc.nextInt();

        if(age >= 18)
            System.out.println(" You are Eligible to VOTE");
        else
            System.out.println(" You are NOT Eligible to VOTE");
    }
}
