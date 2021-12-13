package com.company;

import java.util.Scanner;

public class ConcatenateTwoStrings {
    // Concatenate Two Strings
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Strings as a Input from the USER
        System.out.print(" Enter First String: ");
        String str1 = sc.next();
        System.out.print(" Enter Second String: ");
        String str2 = sc.next();
        // Concatenate Both the input Strings
        String str = str1 + str2;
        // Display the Resultant Concatenated String
        System.out.println(" Concatenated String is: " + str);
    }
}
