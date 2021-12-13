package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class RemoveAllVowelsFromString {
    // remove All Vowels from the String
    public static void main(String [] args){
        // Creating Scanner Object for Taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Iterate Over the String and form ans by adding Consonants to it
        String ans = "";
        for(int i=0; i<str.length(); i++){
          char ch = str.charAt(i);
         switch (ch){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                 break;
             default:
                 ans = ans + ch;
         }
        }
        // Display the Result
        System.out.println(" Required String is: " + ans);

    }
}
