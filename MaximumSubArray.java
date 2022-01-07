package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class MaximumSubArray {
    //Maximum SubArray
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/maximum-subarray/
         */

        // Creating Scanner Object for taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // taking Size of the 1D Array From the USER
        System.out.print(" Enter Size of the Array: ");
        int n = sc.nextInt();
        // declaring Array of Required SIZE
        int []arr = new int[n];
        // Fill the Array by Taking input From the USER
        System.out.print(" Enter " + n + " Elements: " );
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Displaying the Array
        System.out.println(" Array is: " + Arrays.toString(arr));
        // Display the RESULT
       System.out.println(" Maximum SUM is: " + maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        // Kadane's Algorithms   --> V.V. IMPORTANT
        // We can also Initialize maxSum to 0 but that will not work for ARRAY with ALL Negative Numbers
        int maxSum = Integer.MIN_VALUE;  // Initialise MaxSum to MIN Value of Integers
        int currSum = 0;                 // Initialize the Current Sum to 0
        for(int i=0 ;i<nums.length; i++){   // Iterate over the ARRAY
            currSum += nums[i];      // Sum Up the Elements
            if(currSum > maxSum)     // If CurrSum > MaxSum then UPDATE the Current Sum
                maxSum = currSum;
            if(currSum < 0)          // If CurrSum is negative then initialize it to 0
                currSum = 0;
        }
        // At the END Return the Maximum Sum
        return maxSum;
    }

    // Brute Force Solution --> Produces Time LIMIT Exceed
    public static int maxSubArray2(int[] nums) {
        // O(N^3)  --> Solution NOT EFFICIENT
        int maxSum = Integer.MIN_VALUE;
        for(int i =0 ;i< nums.length ; i++){
            for(int j = i; j<nums.length ; j++){
                int sum = 0;
                for(int k= i ; k<=j ;k++){
                    sum+= nums[k];

                }
                if(sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }
}
