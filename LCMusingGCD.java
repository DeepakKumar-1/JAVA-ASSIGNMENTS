package com.company;

import java.util.Scanner;
public class LCMusingGCD {
    // Calculate LCM using GCD
    public static void main(String [] args){
        /*
        Formula:
            a*b = LCM(a,b) * GCD(a,b)
            LCM(a,b) = a*b / GCD(a,b)
         */
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take 2 Numbers as a Input from the USER
        System.out.print(" Enter any Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate gcd
        int gcd = Math.min(a,b);
        while(true){
            if((a%gcd == 0) && (b%gcd == 0))
                break;
            gcd--;
        }
        // calculate lcm Now
        int lcm = (a*b)/gcd;
        System.out.println(" GCD of "+ a + " and " + b + " is: " + gcd + "\n and LCM is: " + lcm);

    }
}
