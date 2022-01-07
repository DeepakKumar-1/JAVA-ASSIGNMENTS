package com.company;

import java.util.Scanner;
public class ReverseInteger {
    // reverse the Given Integer Number
    public static void main(String [] args) {
        /*
        https://leetcode.com/problems/reverse-integer/
        If Reverse Number Exceeds the Range of the Integer than return 0
         */
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Integer Number from the USER
        System.out.print(" Enter any Number: ");
        int num = sc.nextInt();
        // Display the Reverse of the Number on the Screen
        System.out.println(" Reverse of " + num + " is: " + reverse(num));
    }
    // Method that Reverse the Given Number
    public static int reverse(int x) {
        // If Number is Positive then Take as it is
        // if Negative then make it positive
        int oldNumber = x < 0 ? -x : x;
        // Declare revNum Variable as 0 for further Updation
        long revNum = 0;
        // Repeat Following till oldNum > 0
        while(oldNumber > 0){
            // take the Remainder Every Time
            int remainder = oldNumber % 10;
            // Add remainder to the revNum*10
            revNum  = revNum *10 + remainder;
            // if at any Point revNum Increases the range of Integer Numbers
            // the Return 0
            if(revNum > Integer.MAX_VALUE)
                return 0;
            // Update the Old Number
            oldNumber /= 10;
        }
        // Now if given Number is Negative then Return -revNum else revNum
        // Because above we have taken the Positive part for the Negative Number
        return x < 0 ? -(int)(revNum):(int) (revNum);
    }
}