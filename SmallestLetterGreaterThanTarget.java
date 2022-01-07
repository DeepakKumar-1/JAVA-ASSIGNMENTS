package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class SmallestLetterGreaterThanTarget {
    // 744. Find Smallest Letter Greater Than Target
    public static void main(String [] args){
        /*
        ******** NOTE : --> This QUESTION is SIMILAR to Find CEIL Value **********
        https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        Input: letters = ["c","f","j"], target = "a"
        Output: "c"
         */
        // Creating Scanner Object for Taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Size of Character Array from the USER
        System.out.print(" Enter SIZE of Character Array: ");
        int n = sc.nextInt();
        // Create Character Array of Required SIZE
        char [] arr = new char[n];
        // Fill the Array by taking Characters from the USER
        System.out.print(" Enter " + n + " Characters (In Increasing ORDER): ");
        for(int i=0; i < arr.length; i++){
            // Take Input From the USER
            char ch = sc.next().charAt(0);
            // Store char in Character Array
            arr[i] =ch;
        }
        // Display the Character Array
        System.out.println(Arrays.toString(arr));
        // Take Character for that USER wants to find Smallest Letter Greater than Target (i.e Ceil Value)
        System.out.print(" Enter Any Character: ");
        char target = sc.next().charAt(0);
        // Display the Ceil value
        System.out.println(" Smallest Letter Greater than " + target + " is: " + nextGreatestLetter(arr, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        // Apply Binary Search
        int start = 0;
        int end   = letters.length-1;
        while(start <= end){
            // Find Mid Value
            int mid = start + (end - start)/2;
//            if(letters[mid] == target)   --> NOTE:  In QUESTION ASKING for next Greatest letter not EQUAL TO
//                return letters[mid];
            if(letters[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];   // REASON : Letters Wrap AROUND  --> Given in QUESTION
       // return start >= letters.length ? letters[0] : letters[start]; --> ONE MORE WAY
    }
}
