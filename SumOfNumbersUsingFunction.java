package com.company;

import java.util.Scanner;
public class SumOfNumbersUsingFunction {
    // Write a program to print the sum of two numbers entered by user by defining your own method.
    public static void main(String [] args){

        // Creating Scanner Object for taking input From the User
        Scanner sc = new Scanner(System.in);

        // taking Two Numbers as a Input From the User
        System.out.print(" Enter Any Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Passing these to the Sum function
        System.out.println(" Sum of " + num1 + " " + num2 + " is: " + sum(num1, num2));
    }

    static int sum(int a, int b){
        return a+b;
    }

}
