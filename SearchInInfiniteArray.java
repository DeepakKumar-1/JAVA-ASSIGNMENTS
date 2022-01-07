package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class SearchInInfiniteArray {
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Array
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // Create Array of Required SIZE
        int [] arr = new int[n];
        //  Take n Inputs from the USER and Store them into Array
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Display the Array
        System.out.println(Arrays.toString(arr));
        // Take Element that USER wants to Find as a Input
        System.out.print(" Enter Element that You want to Find: ");
        int key = sc.nextInt();
        // Search in Array of Infinite SIZE
        if(keyFound(arr, key))
            System.out.println(key + " Found in Array " + Arrays.toString(arr));
        else
            System.out.println(key + " Not Found in Array " + Arrays.toString(arr));
    }

    // Method to Find target key Element in the Infinite Array
    static boolean keyFound(int [] arr, int key){
        // First Find the Range
        // First start with box of size 2
        // Firstly find The Start and End Indices to Apply Binary Search
        // Initially Take Start and End As Follow
        int start = 0;
        int end   = 1;
        while(key > arr[end]){
            // New Start becomes end
            start = end;
            // Double the Box SIZE
            end = end * 2;
        }
        // Now Apply Binary Search
        return binarySearch(arr,start, end,  key);
    }

    static boolean binarySearch(int [] arr, int start, int end, int key){
        while(start <= end){
            // Find mid
            int mid = start + (end - start)/2;
            if(arr[mid] == key)
                return true;
            else if(arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}
