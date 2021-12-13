package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HighestFrequencyCharacterInString {
    // Find Highest Frequency Character in String
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Displaying Highest Frequency Character
        System.out.print(" Highest Frequency Char in " + str + " is: " + highestFreq(str));
    }

    static char highestFreq(String str){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i< str.length(); i++){
            int count = 0;
            char ch = str.charAt(i);
            for(int j = 0; j< str.length(); j++){
                if( ch == str.charAt(j))
                    count++;
            }
            list.add(count);
        }

        int max = Integer.MIN_VALUE;
        char highFreqChar = str.charAt(0);
        for(int i = 0; i <  list.size(); i++){
             if ( list.get(i) > max){
                 max = list.get(i);
                 highFreqChar = str.charAt(i);
             }
        }
        return  highFreqChar;
    }
}
