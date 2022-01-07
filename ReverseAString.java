package com.company;

import java.util.Scanner;
public class ReverseAString {
    // Reverse A String In Java
    public static void main(String [] args){
        /*
        String --> DEEPAK
        Reverse String --> KAPEED
         */

        // Creating Scanner Object For Taking Input From the User
        Scanner sc = new Scanner(System.in);

        // Taking String as a Input From the User
        System.out.print(" Enter Any String: ");
        String string = sc.next();

        String reverseString = "";

        for(int i = string.length()-1;i>=0; i--){
            reverseString += string.charAt(i);
        }

        // Displaying Reversed String on the Screen
        System.out.println(" Reverse of " + string + " is: " + reverseString);
    }
}
