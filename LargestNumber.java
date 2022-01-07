package com.company;

import java.util.Scanner;

public class LargestNumber {
    // Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {

        // Creating Scanner Object for taking inputs from the user
        Scanner sc = new Scanner(System.in);

        // Taking Two Numbers as a input from the user
        System.out.print(" Enter First Number: ");
        float num1 = sc.nextFloat();

        System.out.print(" Enter Second Number: ");
        float num2 = sc.nextFloat();

        // Comparing Both the Numbers
        if (num1 > num2)
            System.out.println(num1 + " is Greater than " + num2);
        else
            System.out.println(num2 + " is Greater than " + num1);
    }
}
