package com.company;

import java.util.Scanner;

public class LengthOfString {
    // Find the length of the String
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Display the Length of the String
        System.out.println(" Length of String " + str + " is: " + str.length());
    }
}
