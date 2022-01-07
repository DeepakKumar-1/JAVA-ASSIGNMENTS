package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class FindInMountainArray {
    // Find in Mountain Array
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/find-in-mountain-array/
        Que -> Find the Target in Mountain( Bitonic ) Array
        Steps to Solve this Problem
        Step 1 :  Find Peak Element
                  Check if Peak is that Element we are Searching for
                  then return the peak
        Step 2 :  Apply Search Search on left Sub ARRAY ( on Ascending Part )
        Step 3 : if not Found Apply Binary Search on Right Sub Array ( on Descending part )

        arr  ->  [ 1, 2, 2, 4, 3, 1 ]
                          4  -> PEAK
                        2   3
                      2       1
                    1
         */
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of bitonic Array From the USER
        System.out.print(" Enter SIZE of Bitonic/Mountain Array: ");
        int n = sc.nextInt();
        // Create Array of Required SIZE
        int [] arr = new int[n];
        // Take n Elements from the USER and Store them in Array
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the Mountain Array
        System.out.println(Arrays.toString(arr));
        // Take the Target Element to Search in the ARRAY
        System.out.print(" Enter Element that you want to Search: ");
        int target = sc.nextInt();
        // Display if the Target Element Found or Not
        if(findInMountainArray(target, arr) != -1)
            System.out.println(target + " Found in Given Mountain Array " + Arrays.toString(arr));
        else
            System.out.println(target + " NOT Found in the Given Mountain Array " + Arrays.toString(arr));

    }
    static int findInMountainArray(int target, int [] mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);
        if(mountainArr[peakIndex] == target)
            return peakIndex;
        int indexOfTarget = binarySearch(target , mountainArr,0, peakIndex-1);
        if(indexOfTarget == -1)
            indexOfTarget = binarySearch(target , mountainArr, peakIndex, mountainArr.length-1);
        return indexOfTarget;
    }

    static int binarySearch(int target , int [] arr, int start, int end){
        while(start <= end){
            // Find Mid
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
    static int findPeakIndex(int [] arr){
        int start = 0;
        int end   = arr.length - 1;
        while(start < end){
            // Find MID
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid +1])
                end = mid;
            else
                start = mid+1;
        }
        return start;
    }
}
