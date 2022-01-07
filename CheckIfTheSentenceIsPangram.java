package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Character;
public class CheckIfTheSentenceIsPangram {
    // Check if the Sentence Is Pangram
    public static void main(String[] args) {
        /*
        A pangram is a sentence where every letter of the English alphabet appears at least once.
        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
            Example 1:
            Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
            Output: true
            Explanation: sentence contains at least one of every letter of the English alphabet.

            Example 2:
            Input: sentence = "leetcode"
            Output: false
         */

        // Creating Scanner Object for taking Input From the User
        Scanner sc = new Scanner(System.in);

        // Taking Any String as a Input From the USER
        System.out.print(" Enter Any String: ");
        String str = sc.next();

        // Passing Input String to the function
        if (checkIfPangram2(str)) {
            System.out.println(str + " is Pangram ");
        } else {
            System.out.println(str + " is Not Pangram ");
        }

    }

    public static boolean checkIfPangram(String sentence) {
        // Declaring an Array List
        ArrayList<Character> list = new ArrayList<>();
        // Initial count of characters is 0
        int count = 0;
        // Now Iterate over the String Sentence and add All the Characters of sentence to list
        for (int i = 0; i < sentence.length(); i++) {
            // taking Characters at ith Index
            char x = sentence.charAt(i);
            // Adding Characters to the Array List
            list.add(x);
        }
        // Now Check for Every English Alphabets from 'a' to 'z
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // if list contains that Character then Increment the Count by 1
            if (list.contains(ch)) {
                count++;
            }
        }
//        if (count == 26)
//            return true;
//        return false;
        // As we Know that English language contains total 26 Characters
        // So Count must be 26 if count is not 26 then it means Array List doesn't Contain all the characters
        // so return true and false According to count == 26
        return count == 26;
    }

    /*
    Another Easy Method
     */
    public static boolean checkIfPangram2(String sentence) {
        /*
  EXPLANATION:
        ASCII Value of 'a' --> 97   --> 0 + 97
        ASCII Value of 'b' --> 98   --> 1 + 97
        .............................. So On
        ASCII Value of 'z' --> 122  --> 25 + 97

        We Can Write it as  i+97 --> for i from 0 to 25
         */


        for(int i=0; i<26;){
            if(sentence.contains(Character.toString(i+97))) {
                i++;    // if true That Means String Sentence Contains the Character then Check for Next One
            }
            // Otherwise Return False
            else
                return false;
        }
        // After checking for All Character and String Sentence Contains all the Characters then Return true
        return true;
    }

}

