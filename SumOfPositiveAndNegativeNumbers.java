package com.company;

import java.util.Scanner;
public class SumOfPositiveAndNegativeNumbers {
    // Write a program to print the sum of negative numbers, sum of positive even numbers
    // and the sum of positive odd numbers from a list of numbers (N) entered by the user.
    // The list terminates when the user enters a zero.
    public static void main(String [] args){
        // creating Scanner object for taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        // Initializing Two Sum variables
        // One for Sum of Positive Numbers
        // and other for Sum of Negative Numbers
        int sumOfPositiveNumbers = 0;
        int sumOfNegativeNumbers = 0;

        while(true){
            System.out.print(" Enter Any Number: ");
            int num = sc.nextInt();
            // Check if Number is Positive then Update sum of Positive Numbers
            if(num > 0){
                sumOfPositiveNumbers += num;
            } else if(num < 0){
                // if Number is Negative then Update the sum of Negative Numbers
                sumOfNegativeNumbers += num;
            } else{
                // Otherwise break the Loop
                break;
            }
        }
        // Once While Loop Ends
        // Display Sum of Positive and Negative Numbers on the Screen
        System.out.println(" Sum of Positive Numbers Are: " + sumOfPositiveNumbers);
        System.out.println(" Sum of Negative Numbers Are: " + sumOfNegativeNumbers);
    }
}
