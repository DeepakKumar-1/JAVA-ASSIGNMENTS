package com.company;

import java.util.Scanner;
public class PalindromeNumber {
    // Find if a number is palindrome or not
    public static void main(String [] args){
        /*

         */

        // Creating Scanner Object for Taking input From the User
        Scanner sc = new Scanner(System.in);

        // Taking Number as A Input From the User
        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        int num = number;
        // Reversing the Number
        int revNumber = 0;
        while(num>0){
            int remainder = num % 10;
            revNumber = (revNumber*10) + remainder;
            num /= 10;
        }

        // Now Checking if the Number and revNumber are Equal or not
        if(number == revNumber)
            System.out.println(number + " is Palindrome ");
        else
            System.out.println(number + " is Not Palindrome ");
    }
}
