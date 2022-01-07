package com.company;

import java.util.Scanner;
public class PalindromeNumberUsingFunction {
    // Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        System.out.println( number + " is: " + isPalindrome(number));
    }

    static String isPalindrome(int number){
        int originalNumber = number;
        int revNumber = 0;
        while(number > 0){
            int remainder = number%10;
            revNumber = (revNumber * 10) + remainder;
            number /= 10;
        }
        // Check Original Number are Same of Not
        if(originalNumber == revNumber)
            return "Palindrome";
        return "Not Palindrome";
    }
}
