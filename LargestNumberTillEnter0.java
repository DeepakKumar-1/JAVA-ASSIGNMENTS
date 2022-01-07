package com.company;

import java.util.Scanner;

public class LargestNumberTillEnter0 {
       // Take integer inputs till the user enters 0 and print the largest number from all.
        public static void main(String [] args){
            // Initializing variable largestNumber with the minimum value of Integer
            int largestNumber = Integer.MIN_VALUE;
            // Creating Scanner Object for Taking inputs from the user
            Scanner sc = new Scanner(System.in);

            // Infinite While loop is used for taking input Again and Again
            // if the User inputs 0 while loop will break and will show the Largest of all the Entered Numbers
            while(true){
                // Taking number Input From the USER
                System.out.print(" Enter Any Number: ");
                int number = sc.nextInt();      // Storing input in number Variable

                // if the user enters the number as 0 then break the While loop and Display LARGEST NUMBER
                if(number == 0){
                    break;
                }
                // Check if any Number is Greater that the initial largest Number then set that number as a Largest Number
                if(number > largestNumber)
                    largestNumber = number;
            }
            // Once loop will end display the LARGEST NUMBER
            System.out.println(" Largest Number is: " + largestNumber );
        }
}

