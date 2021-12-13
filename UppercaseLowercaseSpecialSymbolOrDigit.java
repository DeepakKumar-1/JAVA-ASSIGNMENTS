package com.company;

import java.util.Scanner;
public class UppercaseLowercaseSpecialSymbolOrDigit {
    // Check is the character is UpperCase, LowerCase, SpecialSymbol or Digit
    public static void main(String [] args){
        // Creating Scanner Object for taking input from the USER
        Scanner sc = new Scanner(System.in);
        // Take any Input From the USER
        System.out.print(" Enter Any Character: ");
        char ch = sc.next().charAt(0);
        // Use ASCII Values for Checking
        if( ch >= 'a' && ch <= 'z')
            System.out.println(ch + " Is in LowerCase");
        else if( ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is in UpperCase");
        else if ( ch >= 48 && ch <= 57)
            System.out.println(ch + " is a Number");
        else
            System.out.println(ch + " is An Special Symbol ");

    }
}
