package com.company;

import java.util.Scanner;
public class FactorialOfNumber {
    // Factorial of a Number
    public static void main(String [] args){
        /*
        Factorial of a Number Can be Calculated as:
           n! = 1 * 2 * 3 * 4 * 5 * ........ n   --> In Iterative Approach
           Base Conditions 0! = 1

         */
        // creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Number as a Input From the USER
        System.out.print(" Enter Any Number: ");
        int num = sc.nextInt();
        // Check if the Number is Negative
        // Then Factorial doesn't Exist
        if(num < 0) {
            System.out.println(" Factorial Doesn't Exist for a Negative Number ");
        } else{
            // if Number is 0 then print 1 as a factorial
            if(num == 0)
                System.out.println(" Factorial of " + num + " is: 1");
            else{
                int fac = 1; // let initially Factorial is 1
                // Now Multiply i=1 to num for calculating Factorial
                for(int i=1 ;i<=num; i++ ){
                    fac *= i;  // Update the factorial
                    // it will work like     n! = 1 * 2 * 3 ......... * n
                }
                // Now Print the Factorial on the Screen
                System.out.println(" Factorial of " + num + " is: " + fac);
            }
        }
    }
}
