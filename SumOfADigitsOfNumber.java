package com.company;

import java.util.Scanner;
public class SumOfADigitsOfNumber {
    // Sum Of A Digits Of Number
    public static void main(String [] args){
        /*
        Sum Of A Digits Of Number
         */

        // Creating Scanner Object for taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Any Number as a Input From the User
        System.out.print(" Enter any Number: ");
        int number = sc.nextInt();
        int num = number;

        // Now Summing the Last Digits of the Number
        int sum = 0;
        while(number > 0){
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        // Displaying the sum of Digits on the Screen
        System.out.println(" Sum of Digits of " + num + " is: " + sum);
    }
}
