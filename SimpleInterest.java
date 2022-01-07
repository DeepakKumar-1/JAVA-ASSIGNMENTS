package com.company;

import java.util.Scanner;

public class SimpleInterest {
    // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {

        // Creating Scanner Object for Taking Input From User
        Scanner sc = new Scanner(System.in);

        // Taking Required Inputs From the User
        System.out.print(" Enter Principal Amount : ");
        float principal = sc.nextFloat();
        System.out.print(" Enter Rate %age : ");
        float rate = sc.nextFloat();
        System.out.print(" Enter Time Duration : ");
        int time = sc.nextInt();

        // Calculating Simple Interest
        float simpleInterest = (principal * rate * time) / 100;

        // Printing Simple Interest on the Screen
        System.out.println(" Simple Interest is : " + simpleInterest);


    }
}
