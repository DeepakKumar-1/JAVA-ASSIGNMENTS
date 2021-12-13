package com.company;

import java.util.Scanner;
public class AlphabetOrNot {
    // A Character is An alphabet or Not
    public static void main(String [] args){
        /*
        A character will be an Alphabet if it lies in
        Either A to Z
            or a to z
         */
        // Creating Scanner object for taking Input From the USER
        Scanner sc = new Scanner(System.in);
        // Take Any character as a Input from the USER
        System.out.print(" Enter Any Character: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <='z' || ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an Alphabet");
        else
            System.out.println(ch + " is not an Alphabet");
    }
}
