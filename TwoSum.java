package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class TwoSum {
    // Two Sum
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/two-sum/
         */
        // Creating Scanner Object for taking Inputs from the User
        Scanner sc = new Scanner(System.in);
        // Take Size of 1D array from the USER
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // Declare 1D ARRAY of Required SIZE
        int [] arr = new int[n];
        // Fill the ARRAY
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Take Target SUM
        System.out.print(" Enter Target SUM: ");
        int sum = sc.nextInt();
        // Display the 1D Array with Target SUM
        System.out.println(" Array With Target SUM is: " + Arrays.toString(twoSum(arr,sum)));

    }
    public static int [] twoSum(int[] nums, int target) {
        // Declare the result Array That Contains Index of that Element with SUM equals to target
        // Because we have to return the Indices of Elements with SUM == target
        // it means we have to Return the 2 indices so Resultant Array must be of Size 2
        int [] result = new int[2];
        for(int i=0;i<nums.length; i++){   // For Every Element
            for(int j = i+1; j<nums.length;j++){   // Try To SUM to Other ELEMENTS Except itself
                if(nums[i] + nums[j] == target){   // Check is the SUM of Elements is equals to target
                    result[0] = i;    // Store Index of Elements
                    result[1] = j;    // Store Index of Elements
                }
            }
        }
        // Return the resultant Array
        return result;
    }

    public static int [] twoSum2(int[] nums, int target) {
        // Declare the result Array That Contains Index of that Element with SUM equals to target
        // Because we have to return the Indices of Elements with SUM == target
        // it means we have to Return the 2 indices so Resultant Array must be of Size 2
        int [] result = new int[2];
        for(int i=0;i<nums.length; i++){   // For Every Element
            for(int j = i+1; j<nums.length;j++){   // Try To SUM to Other ELEMENTS Except itself
                if(nums[i] + nums[j] == target){   // Check is the SUM of Elements is equals to target
                    result[0] = i;    // Store Index of Elements
                    result[1] = j;    // Store Index of Elements
                }
            }
        }
        // Return the resultant Array
        return result;
    }
}
