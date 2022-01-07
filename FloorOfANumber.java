package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfANumber {
    // Find Floor of a Given Target Number From the Array
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
        // Take Number for which USER wants to Find Floor
        System.out.print(" Enter target Number for which you want to find Floor: ");
        int target = sc.nextInt();
        // Display Ceiling of the target Number
        System.out.println(" Floor of " + target + " in Array " + Arrays.toString(arr) + " is: " + FloorOfNum2(arr, target));
    }

    static int FloorOfNum(int [] arr, int target){
        // O(N) Approach
        for (int element : arr) {  // For Every Element in Array
            if (element <=  target)   // if Any Element is less than or Equal to
                // the given Target Element return that Element
                return element;
        }
        // Otherwise return -1 Assuming that -1 is not the Part of the Array
        return -1;
    }

    static int FloorOfNum2(int [] arr, int target){
        // O(logN) Approach
        int start = 0;
        int end   = arr.length -1;
        // If Target is smaller than the Smallest Number in the Array
        // In this Case No Floor Value EXIST
        if(arr[0] > target)
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
        return arr[end];
    }
}

