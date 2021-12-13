package com.company;

import java.util.Scanner;
public class FactorialOfNumberRecursive {
    // Calculate Factorial Using Recursive Function
    public static void main(String [] args){
        /*
        Factorial of Number can be calculated as:
           n! = n * (n-1) * (n-2) .......... * 1
         */

        // Creating Scanner Object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Number from the USER
        System.out.print(" Enter Any Number: ");
        int num = sc.nextInt();
        // check if the number is Negative then Print Factorial doesn't Exist for a Negative number
        if(num < 0){
            System.out.println(" Factorial for a Negative Number doesn't Exist !!");
        } else{
            System.out.println(" Factorial of " + num  + " is: " + recursiveFact(num));
        }
    }
    // recursive Function for Calculating the Factorial
    static int recursiveFact(int num){
        if( num == 0)
            return 1;
        else return num * recursiveFact(num -1 );
    }
}

