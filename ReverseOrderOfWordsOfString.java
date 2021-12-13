package com.company;

import java.util.Scanner;

public class ReverseOrderOfWordsOfString {
    // Reverse Order of Words in a Given String
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking String From the USER
        System.out.print(" Enter Any String: ");
        String str = sc.nextLine();
        // Displaying Reversed String
        System.out.print(reverseStr(str));
    }
    static String  reverseStr(String str){
        // Creating String Builder
        StringBuilder builder = new StringBuilder();
        builder.append(str);

        return builder.reverse().toString();
    }
}
