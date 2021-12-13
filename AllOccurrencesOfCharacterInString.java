package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllOccurrencesOfCharacterInString {
    // Find All Occurrence of a Character in a Given String
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking String From the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Taking Any Character from the USER
        System.out.print(" Enter Any Character: ");
        char ch = sc.next().charAt(0);
        // Displaying All Occurrence of Given Character in str
        System.out.print(" All Occurrence of " + ch + " in " + str + " are at Indices " + firstOccurrence(str, ch));
    }

    static List <Integer> firstOccurrence(String str, char ch){
        List <Integer> list = new ArrayList<>();
        for(int i = 0; i< str.length(); i++) {
            char c = str.charAt(i);
            if(c == ch) {
               list.add(i);
            }
        }
        return list;
    }
}