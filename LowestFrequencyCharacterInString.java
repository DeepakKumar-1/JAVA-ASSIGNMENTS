package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LowestFrequencyCharacterInString {
    // Find Highest Frequency Character in String
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Any String as a Input from the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();
        // Displaying Lowest Frequency Character
        System.out.print(" Lowest Frequency Char in " + str + " is: " + lowestFreq(str));
    }

    static char lowestFreq(String str){
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

        int min = Integer.MAX_VALUE;
        char lowestFreqChar = str.charAt(0);
        for(int i = 0; i <  list.size(); i++){
            if ( list.get(i)  < min){
                min = list.get(i);
                lowestFreqChar = str.charAt(i);
            }
        }
        return  lowestFreqChar;
    }
}
