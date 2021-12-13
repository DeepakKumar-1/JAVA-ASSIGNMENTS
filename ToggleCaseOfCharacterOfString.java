package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ToggleCaseOfCharacterOfString {
    // Program to toggle each character in a string
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        String result = "";
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                result += String.valueOf(str.charAt(i)).toUpperCase();
            else
                result += String.valueOf(str.charAt(i)).toLowerCase();
        }
        // Display the Toggled String
        System.out.println(" Toggled String is: " + result);
    }
}
