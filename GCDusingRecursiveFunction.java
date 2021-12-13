package com.company;

import java.util.Scanner;
public class GCDusingRecursiveFunction {
    // GCD using Recursive Function
    public static void main(String [] args){
        // Creating Scanner Object For taking Inputs from the USER
        Scanner sc = new Scanner(System.in);

        // Taking Two Numbers as a Input From the USER
        System.out.print(" Enter Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Display GCD on the Screen
        System.out.println(" GCD of " + a + " and " + b + " is: " + gcd(a,b));
    }
    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
}
