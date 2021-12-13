package com.company;

import  java.util.*;

public class FrequencyOfAllCharactersInString {
    // Count the Frequency of Each Character in the String
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Displaying Frequency of All Character
        System.out.print(" Frequency of All Characters in " + str + " are: " + freq(str));
    }

    static Dictionary<Character, Integer> freq(String str){
        Dictionary<Character, Integer> output = new Hashtable<>();
        for(int i=0; i< str.length(); i++){
            int count = 0;
            char ch = str.charAt(i);
            for(int j = 0; j < str.length(); j++){
                if( ch == str.charAt(j))
                    count++;
            }
            output.put(ch, count);
        }
        return  output;
    }
}
