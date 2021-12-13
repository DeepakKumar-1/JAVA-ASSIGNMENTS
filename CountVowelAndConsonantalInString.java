package com.company;

import java.util.Scanner;

public class CountVowelAndConsonantalInString {
    // Count Total Number of Vowels and Consonantal in the String
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' ||ch == 'e'||ch == 'i' || ch == 'o' ||ch == 'u')
                vowelCount++;
            else
                consonantCount++;
        }
        // Display the Count of Vowels and Consonants in a Given String
        System.out.println(" Total Number of Vowels in " + str + " is: " + vowelCount);
        System.out.println(" Total Number of Consonants in " + str + " is: " + consonantCount);
    }
}
