package com.company;


import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicatesInAnArray {
    // Find All Duplicates In An Array
    public static void main(String [] args) {
        /*
        https://leetcode.com/problems/find-all-duplicates-in-an-array/
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
        System.out.println(" Missing Number is : " + findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        cyclicSort(nums);
        for(int i=0; i<nums.length; i++){
            if(i != nums[i]-1)
                result.add(nums[i]);
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

