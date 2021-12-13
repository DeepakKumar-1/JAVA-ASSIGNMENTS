package com.company;

import java.util.Scanner;

public class ReverseString {
    // Reverse a String
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Display Reverse String
        System.out.println(" Reverse String is: " + reverse(str));
    }

    static String reverse(String str){
        String rev = "";
        for (int i = str.length() -1; i >= 0; i--)
            rev += str.charAt(i);
        return rev;
    }
}
