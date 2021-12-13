package com.company;

import java.util.Scanner;
public class GCDUsingForLoop {
    // Find GCD of two Numbers using For Loop
    public static void main(String[] args){
        // Creating Scanner Object for taking Input From the USER
        Scanner sc = new Scanner(System.in);
        // Taking two Numbers as a Input from the USER
        System.out.print(" Enter Any Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = Math.min(a,b);
        for(; true ; gcd--){
            if(a % gcd == 0 && b % gcd == 0)
                break;
        }
        // Display GCD of the Numbers
        System.out.println(" GCD of " + a + " and " + b + " is: " + gcd);

    }
}
