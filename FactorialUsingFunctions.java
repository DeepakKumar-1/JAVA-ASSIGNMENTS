package com.company;

import java.util.Scanner;
public class FactorialUsingFunctions {
    /*
    Write a program to print the factorial of a number by defining a method named 'Factorial'.
    Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
        4! = 1 * 2 * 3 * 4 = 24
        3! = 3 * 2 * 1 = 6
        2! = 2 * 1 = 2
        Also,
        1! = 1
        0! = 1
     */
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // taking Number as a input From the User
        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        System.out.println(" Factorial of " + number + " is: " + factorial(number));
    }

    static int factorial(int number){
        if(number == 0)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
