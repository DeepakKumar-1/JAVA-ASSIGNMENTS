package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SetMismatch {
    // Set Mismatch
    public static void main(String [] args){
        // https://leetcode.com/problems/set-mismatch/
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
        // Display the Set Mismatch
        System.out.println(" Missing Number is : " + Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        int [] result = new int[2];
        cyclicSort(nums);
        for(int i=0; i<nums.length; i++){
            if(i != nums[i]-1){
                result[0]  = nums[i];
                result[1] = i+1;
            }
        }
        return result;
    }

    static void cyclicSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
    }
}

