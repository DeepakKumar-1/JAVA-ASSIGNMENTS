package com.company;

import java.util.Scanner;

public class ProductOfNumbersUsingFunction {
    // Define a method that returns the product of two numbers entered by user.
    public static void main(String [] args){
        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Taking Two Numbers as a Input From the User
        System.out.print(" Enter Any Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(" Product of " + num1 + " " + num2 + " is: " + product(num1, num2));
    }

    static int product(int a , int b){
        return a*b;
    }
}
