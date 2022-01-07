package com.company;

import java.util.Scanner;
public class SumTillUserInput0 {
    // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String [] args){
        // Initializing Sum Variable to 0 for Later updation
         int sum = 0;
        // Creating Scanner Object for Taking inputs from the user
        Scanner sc = new Scanner(System.in);

        // Infinite While loop is used for taking input Again and Again
        // if the User inputs 0 while loop will break and will show the Sum of all the Entered Numbers
        while(true){
            // Taking number Input From the USER
            System.out.print(" Enter Any Number: ");
            int number = sc.nextInt();      // Storing input in number Variable

            // if the user enters the number as 0 then break the While loop and Display SUM
            if(number == 0){
                break;
            }
            // Adding the Number to Sum variable if number is not 0
            sum += number;
        }
        // Once loop will end display the sum
        System.out.println(" Sum of Numbers are : " + sum );
    }
}
