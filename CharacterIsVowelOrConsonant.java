package com.company;

import java.util.Scanner;
public class CharacterIsVowelOrConsonant {
    // Check character is Vowel or Consonant
    public static void main(String [] args){
        /*
        A Character is Vowel if it lies in
               a, e, i, o, u
        Otherwise Character is Consonant
         */
        // Creating Scanner Object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Character as a Input From the USER
        System.out.print(" Enter Any Character: ");
        char ch = sc.next().charAt(0);

        if( ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u')
            System.out.println(ch + " is Vowel");
        else
            System.out.println(ch + " is Consonant ");
    }
}
