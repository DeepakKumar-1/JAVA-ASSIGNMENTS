package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class CeilingOfNumber {
    // Find Ceiling of a Given Target Number From the Array
    public static void main(String [] args){
        // Creating Scanner object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of 1D Array from the USER
        System.out.print(" Enter SIZE of Array: ");
        int n = sc.nextInt();
        // Declare 1D Array with Required SIZE
        int [] arr = new int[n];
        // Fill the Array by Taking Input From the USER
        System.out.print(" Enter " + n + " Elements: ");  // ASK USER to Enter n Elements
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();     // Store Inputs in Array
        }
        // Display the 1D Array
        System.out.println(Arrays.toString(arr));
        // Take Number for which USER wants to Find Ceiling
        System.out.print(" Enter target Number for which you want to find Ceiling: ");
        int target = sc.nextInt();
        // Display Ceiling of the target Number
        System.out.println(" Ceiling of " + target + " in Array " + Arrays.toString(arr) + " is: " + ceilingOfNum2(arr, target));
    }

    static int ceilingOfNum(int [] arr, int target){
        // O(N) Approach
        for (int element : arr) {  // For Every Element in Array
            if (element >= target)   // if Any Element is Greater than or Equal to
                // the given Target Element return that Element
                return element;
        }
        // Otherwise return -1 Assuming that -1 is not the Part of the Array
        return -1;
    }

    static int ceilingOfNum2(int [] arr, int target){
        // O(logN) Approach
        int start = 0;
        int end   = arr.length -1;
        // if target is greater than the Largest Number in the ARRAY
        // In This Case No Ceiling EXIST
        if(target > arr[arr.length -1])
            return -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target )
                return arr[mid];
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return arr[start];
    }
}
