package com.company;

import java.util.Scanner;
public class CompoundInterest {
    // Compound Interest Java Program
    public static void main(String [] args){
        /*
        compound Interest = p * ( 1 + (r/(100*n))) ^ nt
         */

        // creating Scanner Object for Taking Input from the User
        Scanner sc = new Scanner(System.in);

        // taking Required Inputs from the User for calculating Compound Interest
        System.out.print(" Enter Principal: ");
        int principal = sc.nextInt();

        System.out.print(" Enter Rate in Percentage: ");
        int rate = sc.nextInt();

        System.out.print(" Enter time in Years: ");
        float time = sc.nextFloat();

        System.out.print(" Enter Number of Times Interest is compounded per year: ");
        int n = sc.nextInt();

        // Now calculating compound Interest
        float compoundInterest = principal * (float)(Math.pow((1+((float)(rate)/(100*n))), (n*time)));


        // Displaying Compound Interest on the Screen
        System.out.print(" Compound Interest is: " + compoundInterest);
    }
}
