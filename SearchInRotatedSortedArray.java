package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class SearchInRotatedSortedArray {
    // Search in Rotated Sorted Array
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/search-in-rotated-sorted-array/
         */
        // Creating Scanner object for taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Rotated Sorted ARRAY
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // Create the Array of n SIZE
        int [] arr = new int[n];
        // Fill the Array by taking inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();  // Take Input and Store in Array
        // Display the Array once
        System.out.println(Arrays.toString(arr));
        // Take Target Element to Search
        System.out.print(" Enter Element that you want to Search: ");
        int target = sc.nextInt();
        int index = search(arr, target);
        if(index != -1)
            System.out.println(target + " Found in Array " + Arrays.toString(arr) + " at Index " + index);
        else
            System.out.println(target + " Doesn't Found in Array " + Arrays.toString(arr));
    }
    static int search(int[] nums, int target) {
        // find Pivot
        int pivot = findPivot(nums);
        int ans= -1;
        if(pivot == -1)
            // Do Simple Binary Search
            // Because if pivot not Found it means Array is not Rotated At all
            return ans = binarySearch(nums, target,0, nums.length -1);
        // Now Check if the Element at pivot is target or not when Pivot is not Equal to -1
        if(nums[pivot] == target)
            return pivot;
            // Now We have Two Ascending Parts of the ARRAY
            // Either Target may Lie in First Half or in another Half
            // For First half  [..., ..., ..., target, ..., pivot, ..., ..., ...]
            // target element < pivot element
        else if(nums[pivot] > target)
            ans = binarySearch(nums, target, 0, pivot-1);
        // If target not Lies in the First Half then it means it may Lie in the Next Half
        if(ans == -1)
            ans = binarySearch(nums, target, pivot+1, nums.length-1);
        // At the End just return the ans
        return ans;
    }

    // Method for Binary Search
    static int binarySearch(int [] nums, int target,int start, int end){
        // repeat Following till start <= end
        while(start <= end){
            // find mid Index
            int mid = start + (end - start)/2;
            // Check if the Element at the mid is Equal to the Target or not
            // If yes then return the mid
            if(nums[mid] == target)
                return mid;
                // if target is less than mid end Reduce Search Space and Find in Left Sub Array
            else if(nums[mid] > target)
                end = mid - 1;
                // otherwise try to Find in the Right sub Array
            else
                start = mid + 1;
        }
        // if target not Found then return -1 Assuming that -1 ia not the Part of the Array
        return -1;
    }

    // Method to Find the Pivot Index
    static int findPivot(int [] nums){
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            // find mid
            int mid = start + (end - start)/2;
            // if Element at mid is Greater than Element at mid + 1
            // then it means mid Element is the Pivot
            // [7, 6, 1, 2, 3, 4, 5]
            //  ---- /  \ --------
            //  Asc Part   Desc Part   Asc Part
            // Also mid + 1 should not Exceed the length of the Array
            if(mid < end && nums[mid] > nums[mid +1])
                return mid;
                // if mid element < mid -1  Similar to Above Case return mid -1
            else if(mid > start  && nums[mid] < nums[mid-1])
                return mid-1;
                // Otherwise Try to Find Pivot in Ascending Parts of the Array
            else if(nums[mid]< nums[start])
                end = mid-1;
            else
                start = mid +1;
        }
        return -1;
    }
}
