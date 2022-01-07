package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        /*
        https://leetcode.com/problems/missing-number/
        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
                     2 is the missing number in the range since it does not appear in nums.
         */
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking SIZE of 1D Array from the USER
        System.out.print(" Enter SIZE of 1D Array: ");
        int n = sc.nextInt();
        // Creating Array of Required SIZE
        int [] arr = new int[n];
        // Fill this Array By taking n number of Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        // Storing Inputs in the Array
        for(int i=0; i< arr.length ; i++)
            arr[i]  = sc.nextInt();
        // Displaying the Array Once
        System.out.println(" Array Before Sorting is: " + Arrays.toString(arr));
        // Display the Missing Number
        System.out.println(" Missing Number is : " + missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        // Sort the Array Using Cyclic Sort
        cyclicSort(nums);
        // Now Iterate Over the Array and Find the Element which is not at the Correct Position
        for(int i=0; i<nums.length; i++){
            if(i != nums[i])
                return i;
        }
        return nums[nums.length - 1] +1;
    }
    static void cyclicSort(int [] nums){
        for(int i=0; i<nums.length; ){
            if(nums[i] >= nums.length || i == nums[i])
                i++;
            else
                swap(nums, i, nums[i]);
        }
    }

    static void swap(int [] nums, int a, int b){
        int temp = nums[a];
        nums[a]  = nums[b];
        nums[b]  = temp;
    }
}
