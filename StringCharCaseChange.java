package com.company;

import java.util.Scanner;
public class StringCharCaseChange {
    // String Char Case Change
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // take Any String From the USER
        System.out.print(" Enter Any String: ");
        String inputStr = sc.next();
        // Display String in UpperCase
        System.out.println(inputStr + " in Upper Case is: " + inputStr.toUpperCase());
        // Display String in LowerCase
        System.out.println(inputStr + " in Lower Case is " + inputStr.toLowerCase());
    }
}
