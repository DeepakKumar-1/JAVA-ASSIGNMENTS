package com.company;

import java.util.Scanner;
public class AsciiValueOfCharacter {
    // Print ASCII Value of Character
    public static void main(String [] args){
        /*
        Program to Print ASCII Value of the Character
        The full form of ASCII is the American Standard Code for information interchange
         */
        // Creating Scanner Object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // taking any Character as a Input From the USER
        System.out.print(" Enter Any Character: ");
        char ch = sc.next().charAt(0);
        // Display the ASCII Value of Character
        System.out.println(" ASCII Value of " + ch + " is: " + (int)(ch));
    }
}
