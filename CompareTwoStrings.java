package com.company;

import java.util.Scanner;

public class CompareTwoStrings {
    // Concatenate Two Strings
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Strings as a Input from the USER
        System.out.print(" Enter First String: ");
        String str1 = sc.next();
        System.out.print(" Enter Second String: ");
        String str2 = sc.next();
        // Display the Resultant
        /*
            conditions :
            if (string1 > string2) it returns a positive value.
            if both the strings are equal lexicographically
            i.e.(string1 == string2) it returns 0.
            if (string1 < string2) it returns a negative value.
       */
        System.out.println(" Comparing " + str1 + " and " + str2 + ": " + str1.compareTo(str2));
    }
}
