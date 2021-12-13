package com.company;

import java.util.Scanner;
public class GCDofTwoNumbers {
    // Find GCD of Two Number
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Two Numbers as a Input from the USER
        System.out.print(" Enter any Two Number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = Math.min(num1, num2);
        while ((num1 % gcd != 0) || (num2 % gcd != 0)) {
            gcd--;
        }
        /*
        while(true){
            if((num1 % gcd == 0) && (num2 % gcd == 0))
                break;
            gcd--;
            }
         */
        System.out.println(" GCD of "+ num1 + " and " + num2 + " is: " + gcd);

    }
}
