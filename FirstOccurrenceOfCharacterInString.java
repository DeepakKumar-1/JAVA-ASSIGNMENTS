package com.company;

import java.util.Scanner;

public class FirstOccurrenceOfCharacterInString {
    // Find First Occurrence of a Character in a Given String
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking String From the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Taking Any Character from the USER
        System.out.print(" Enter Any Character: ");
        char ch = sc.next().charAt(0);
        // Displaying First Occurrence of Given Character in str
        System.out.print(" First Occurrence of " + ch + " in " + str + " is at Index " + firstOccurrence(str, ch));
    }

    static int firstOccurrence(String str, char ch){
        for(int i=0; i< str.length(); i++) {
            char c = str.charAt(i);
            if(c == ch) {
                return  i;
            }
        }
        return -1;
    }
}
