package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class RotationCount {
    // Find Rotation Count in an Sorted Rotated Array
    public static void main(String [] args){
        // Creating Scanner Object For taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // take SIZE of the Array as a Input From the USER
        System.out.print(" Enter SIZE of the Sorted Rotated Array: ");
        int n = sc.nextInt();
        // Create Array of Required SIZE
        int [] arr = new int[n];
        // Fill the Array by taking Inputs from the USER
        System.out.print(" Enter " + n  + " Elements: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the Array
        System.out.println(Arrays.toString(arr));
        // Display the Rotation Count
        int count = pivotIndex(arr) + 1;
        System.out.println(Arrays.toString(arr) + " is Rotated " + count + " Times");
    }

    static int pivotIndex(int []arr){   // This Will Not Work For Sorted Rotated Array Containing Duplicates
        int start = 0;
        int end   = arr.length -1 ;
        while(start <= end){
            // find mid
            int mid = start + (end - start) /2;
            if(mid < arr.length-1 && arr[mid] > arr[mid+1])
                return mid;
            if(start < mid && arr[mid] < arr[mid-1])
                return mid-1;
            else if(arr[start] > arr[mid])
                end = mid -1;
            else
                start = mid+1;
        }
        return -1;
    }
}
