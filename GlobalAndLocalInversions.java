package com.company;

import java.util.*;
public class GlobalAndLocalInversions {
    // Global and Local Inversions
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/global-and-local-inversions/

        Return true of Local Inversion == global Inversion
         */
        // Creating Scanner Object for taking Input from the User
        Scanner sc = new Scanner(System.in);

        // Take the SIZE of the 1D array from the USER
        System.out.print(" Enter SIZE of the 1D array: ");
        int n = sc.nextInt();
        // Now declare the Array with given SIZE
        int [] arr = new int[n];
        // Fill the Array
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Display the 1D Array
        System.out.println(Arrays.toString(arr));

        // Display the Result
        System.out.println(" OUTPUT : " + isIdealPermutation(arr));
    }
    public static boolean isIdealPermutation(int [] nums){
        for(int i =0; i<nums.length; i++){
            if(Math.abs(nums[i]-i)>1)
                return false;
        }
        return true;
    }

    public static boolean isIdealPermutation2(int[] nums) {
        // NOT An EFFICIENT Method

        int globalInversionCount = 0;     // Counter for Number of Global Inversion
        int localInversionCount = 0;      // Counter for Number of Local Inversion
        for(int i=0; i< nums.length ; i++){     // Iterate Over a LOOP
            for(int j=i; j< nums.length; j++){    // For Comparison
                if(nums[i]>nums[j])                 // Condition for Global Inversion
                    globalInversionCount++;
            }
            if(i< nums.length-1){
                if(nums[i]> nums[i+1])      // Condition For Local Inversion
                    localInversionCount++;
            }
        }
        // System.out.println(" Local Inversion: "+ localInversionCount + " Global Inversion: "+ globalInversionCount);
        return localInversionCount == globalInversionCount;
    }
}

