package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class NumbersWithEvenNumberOfDigits {
    // Numbers with Even Number of Digits
    public static void main(String [] args){
        /*
         Find Numbers with Even Number of Digits
        https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
        Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore only 12 and 7896 contain an even number of digits.
         */

        // Creating Scanner Object For taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Size of 1D Array nums from the USER
        System.out.print(" Enter size of the Array: ");
        int n = sc.nextInt();

        // Now Declaring Array of Required Size
        int [] nums = new int[n];
        // Filling the Array
        System.out.print(" Enter " + n + " Digits: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        // Display the Array
        System.out.println(Arrays.toString(nums));
        System.out.println(" Count of Numbers with Even Digits: " + findNumbers2(nums));
    }

    public static int findNumbers(int[] nums) {
        int evenNumberCount = 0;  // Initial EVEN Numbers are 0
        for(int element : nums){  // For Every Element in nums Array
            int countDigits = 0;  // Initial Digit Count is 0
            while(element > 0){   // Check till number is greater than 0
                countDigits ++;   // Increment the Count Every time
                element /= 10;    // Now Update the Element For Ex if element= 987 then element / 10 --> 98
            }
            if(countDigits %2 == 0)   // Now After Counting Number of Digits of Element of Array nums
                // Check is it Even or Not? if YES then Increment EVEN COUNT
                evenNumberCount++;
        }
        // Return the Count of EVEN NUMBERS
        return evenNumberCount;
    }

    // Using Math Function
    public static int findNumbers2(int [] nums){
        int evenNumberCount = 0;
        for(int element: nums){
            int numberOfDigits = (int)(Math.log10(element)) + 1;
            if(numberOfDigits % 2 == 0)
                evenNumberCount++;
        }
        return evenNumberCount;
    }

//    public static int findNumbers3(int [] nums){
//        int evenNumberCount = 0;
//        for(int element: nums){
//            System.out.println(Integer.toString(element).length());
//            if(Integer.toString(element).length() % 2 == 0)
//                evenNumberCount++;
//        }
//        return evenNumberCount;
//    }
}
