package com.company;

import java.util.Scanner;
public class VowelOrConsonantUsingSwitch {
    // Check whether an Alphabet is Vowel or Consonant Using Switch
    public static void main(String [] args){
        // Creating Scanner Object For taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Alphabet as a Input from the USER
        System.out.print(" Enter Any Alphabet: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a Vowel ");
            default -> System.out.println(ch + " is a Consonant ");
        }
    }
}
