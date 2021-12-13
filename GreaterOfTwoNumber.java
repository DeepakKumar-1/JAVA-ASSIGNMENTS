package com.company;

import java.util.Scanner;
public class GreaterOfTwoNumber {
    // Find Greater of two Numbers
    public static void main(String [] args){
        // Creating Scanner Object for taking input from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Two Numbers as a Input from the USER
        System.out.print(" Enter Any Two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Displaying Maximum Number on the Screen
        System.out.println(" Maximum Number is: " + Math.max(a,b));
    }
}
