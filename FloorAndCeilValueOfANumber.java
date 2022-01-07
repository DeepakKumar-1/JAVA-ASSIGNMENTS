package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class FloorAndCeilValueOfANumber {
    // Program to Find Floor and Ceil Value of A Given Target Number in an Sorted Array
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();

        // Declare the 1D Array with Required SIZE
        int [] arr = new int[n];
        // Fill this Array by Taking Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();
        //Display the ARRAY
        System.out.println(Arrays.toString(arr));
        // take The target Element from the USER For which USER wants to Find Floor and Ceil VAlUE
        System.out.print(" Enter Number for Which You Want to Find the Floor and Ceil Value: ");
        int target = sc.nextInt();
        // Display the Floor and Ceil Value
        System.out.println(" Ceil and Floor Values are: " + Arrays.toString(floorAndCeil(arr, target)));
    }

    static int[] floorAndCeil(int [] arr, int target){
        // Use Binary Search to Find Floor and Ceil value
        int start = 0;
        int end   = arr.length -1;
        while(start <= end){
            // Find Mid
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return new int[]{arr[mid], arr[mid]};
            else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return new int[] {arr[start], arr[end]};
    }
}
