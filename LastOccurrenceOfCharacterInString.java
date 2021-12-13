package com.company;

import java.util.Scanner;

public class LastOccurrenceOfCharacterInString {
    // Find Last Occurrence of a Character in a Given String
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking String From the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Taking Any Character from the USER
        System.out.print(" Enter Any Character: ");
        char ch = sc.next().charAt(0);
        // Displaying Last Occurrence of Given Character in str
        System.out.print(" Last Occurrence of " + ch + " in " + str + " is at Index " + lastOccurrence(str, ch));
    }

    static int lastOccurrence(String str, char ch){
        for(int i = str.length() - 1; i>= 0; i--) {
            char c = str.charAt(i);
            if(c == ch) {
                return  i;
            }
        }
        return -1;
    }
}