package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class FirstAndLastPositionOfElementInSortedArray {
    // Find First and Last Position of Element in Sorted Array
    public static void main(String [] args){
        /*
        Explanation:

         */
        // Creating Scanner Object for taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Size of the 1D Array from the USER
        System.out.print(" Enter Size of the Array: ");
        int n = sc.nextInt();
        // Declaring 1D Array of Required Size
        int [] arr = new int[n];
        // Fill the Array
        for(int i=0; i<n ; i++)
            arr[i] = sc.nextInt();
        // Displaying the 1D Array
        System.out.println(Arrays.toString(arr));
        // Take Target Element as a Input From the USER
        System.out.print(" Enter Target Element to Find: ");
        int target = sc.nextInt();
        // Displaying the Resultant Array
        System.out.println(" First and Last Occurrence of Elements is at Indices: " + Arrays.toString(searchRange(arr, target)));

    }
    public static int[] searchRange(int[] nums, int target) {
        // Apply Binary Search
        int [] result = new int[2];
        int start = 0;
        int end = nums.length-1;
        binarySearch(nums,result, target, start , end);
        return result;
    }
   static void binarySearch(int [] nums, int [] result , int target , int start, int end){
       result[0] = -1;
       result[1] = -1;
        int mid =start + (end -  start)/2;
//       //System.out.println(" Mid " + mid + " mid+1 " + (mid+1)+ " mid-1 " + (mid-1));
//      // System.out.println(" nums[Mid] " + nums[mid] + " nums[mid+1] " + nums[(mid+1)]+ " nums[mid-1] " + nums[(mid-1)]);
//       System.out.println(( mid-1 >= 0 )&& (nums[mid] == target) && (nums[mid-1] == target ));
//       System.out.println(( mid+1 < nums.length) &&( nums[mid] == target) && (nums[mid+1] == target) );
        if(( mid-1 >= 0 )&& (nums[mid] == target) && (nums[mid-1] == target )){
            result[0] = mid-1;
            result[1] = mid;
            return;
        } else if(( mid+1 < nums.length) &&( nums[mid] == target) && (nums[mid+1] == target) ){
            result[0] = mid;
            result[1] = mid +1;
            return;
        }
        if(nums[mid] > target)
            binarySearch(nums, result, target, start, mid-1);
        else if (nums[mid] < target)
            binarySearch(nums, result, target , mid+1 , end);

   }
}
