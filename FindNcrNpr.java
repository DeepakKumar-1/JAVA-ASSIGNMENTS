package com.company;

import java.util.Scanner;
public class FindNcrNpr {

    public static int factorial(int number){
        // Base Condition
        if(number == 0)
            return 1;
        else
            return number * factorial(number-1);
    }

    // Find Ncr & Npr
    public static void main(String [] args) {
        /*
        nCr = n ! / r! (n-r)!
        nPr = n! / (n-r)!
        nCr --> Combination
        nPr --> Permutation
         */

        // Creating Scanner Object for Taking Input From the User
        Scanner sc = new Scanner(System.in);

        // Taking Required Inputs from the User
        System.out.print(" Enter n: ");
        int n = sc.nextInt();

        System.out.print(" Enter r: ");
        int r = sc.nextInt();

        if (n >= r) {
            // Calculating nCr
            int nCr = factorial(n) / (factorial(r) * factorial(n - r));

            // Calculating nPr
            int nPr = factorial(n) / factorial(n - r);

            System.out.println(" nCr: " + nCr + "\n nPr: " + nPr);
        } else{
            System.out.println(" Invalid INPUTS !! ");
    }
    }
}
