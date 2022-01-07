package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class NumberOfGoodPairs {
    // Number of Good Pairs
    public static void main(String [] args){
        /*
        Given an array of integers nums, return the number of good pairs.
        --> A pair (i, j) is called good if nums[i] == nums[j] and i < j.
  Example:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
         */

        // Creating Scanner Object for Taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Size of 1D Array from the USER
        System.out.print(" Enter Size of the Array: ");
        int n = sc.nextInt();
        // Declaring Array of Size n
        int [] arr = new int[n];

        // Filling The Array with Elements
        for(int i=0; i<n ; i++){
            System.out.print(" Enter " + (i+1) + " Element: ");
            arr[i] = sc.nextInt();
        }

        // Displaying Array
        System.out.println(Arrays.toString(arr));

        // Displaying Number of Good Pairs in the Array
        System.out.println(" Number of Good Pairs are: " + numIdenticalPairs(arr) );
    }

    public static int numIdenticalPairs(int[] nums) {
        int numberOfGoodPairs = 0;  // Initially count of Good Pairs is 0
        for(int i=0; i<nums.length; i++){     // For Each Element
            for(int j=0 ; j<nums.length ; j++){    // For Comparison
                if(nums[i] == nums[j] && i<j)     // Required Conditions
                    numberOfGoodPairs ++;        // Increment the count if conditions satisfies
            }
        }
        return numberOfGoodPairs;                // return Total Count
    }

}
