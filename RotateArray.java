package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    // Rotate Array
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/rotate-array/
        Given an array, rotate the array to the right by k steps, where k is non-negative.
         */
        // Creating Scanner Object for taking input from the USER
        Scanner sc = new Scanner(System.in);
        // Take the SIZE of the Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Now Declare the 1D Array of Given SIZE
        int [] arr = new int[n];
        // Fill the Array
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // Display the Array
        System.out.println(Arrays.toString(arr));
        System.out.print(" How many Times do you want to Rotate this Array: ");
        int k = sc.nextInt();
        // Call the Method for Rotation
        rotate(arr, k);
        // Display the Resultant After k times Right Rotations
        System.out.println(" Array After " + k + " Rotations is: " +  Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        /*
        Array Rotation Using Reversal Algorithm
        Step 1: reverse the Array from indices 0 to length-1
        Step 2: reverse the Array from indices 0 to k-1
        Step 3: reverse the Array from indices 0 to length-1

        Example:
           let  arr is --> [ 1, 2, 3, 4, 5 ]      k = 2

           index -->     0   k-1  k  3  length-1
                       [ 1,  2,  3,  4,  5 ]

            Reversing from 0 to length -1
                      We get     [5,4,3,2,1]
            Reversing from 0 to k-1
                      We get     [4, 5, 3, 2, 1]
            Reversing from k to length-1
                      We get     [4, 5, 1, 2, 3]   --> RESULTANT Rotated Array
         */
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    static void reverse(int [] nums, int start, int end){
        // reversing the Array Using two pointer Method
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
