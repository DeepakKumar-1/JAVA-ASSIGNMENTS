package com.company;

import java.util.Scanner;
public class GenericRootOfNumber {
    // Find A Generic Root of a Number
    public static void main(String [] args){
        /*
        EXPLANATION:
           Generic Root --> of a number is sum of all the digits of the number
                            until we get a single-digit output.
           Example:
                number --> 12345
                Generic Root --> 1+2+3+4+5 = 15
         */
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Number as a Input From the USER
        System.out.print(" Enter Any Number: ");
        int num = sc.nextInt();
        // Display the Generic root of Given Number on the Screen
        System.out.println(" Generic Root of " + num + " is: " + genRoot(num));
    }

    static int genRoot(int number){
        int genericRoot = 0;
        while(number > 0){
            int remainder = number % 10;
            genericRoot += remainder;
            number /= 10;
        }
        return genericRoot;
    }
}
