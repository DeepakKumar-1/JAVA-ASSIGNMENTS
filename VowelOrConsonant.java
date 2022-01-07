package com.company;

import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String [] args){
        /*
        Vowels Are : a, e, i, o, u
        if Character lies in this then it will be vowel otherwise Consonant
         */

        // Creating Scanner Object for taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Character from the User
        System.out.print(" Enter any Character: ");
        char c = sc.next().charAt(0);

        // if Character Lies in the Range of Vowels the Print Character is a Vowel otherwise Consonantal
        if( c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u' ){
            System.out.println(c +" is Vowel ");
        } else{
            System.out.println(c + " is Consonant ");
        }

    }
}
