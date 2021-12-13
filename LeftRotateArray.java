package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {
    // Left Rotate the Array --> AntiClock Wise Rotation
    public static void main(String [] args) {
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking SIZE of Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Creating Array of Required SIZE
        int[] arr = new int[n];
        // Fill the Array with n elements
        System.out.print(" Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the ARRAY
        System.out.println(Arrays.toString(arr));
        // Take Number of Rotations from the USER
        System.out.print(" Enter How Many Left Rotations You want to Perform: " );
        int k = sc.nextInt();
        leftRotate(arr, k);
        // Display Array After k Left Rotations
        System.out.println(" Array After " + k + " left Rotations is: " + Arrays.toString(arr));
    }
    // Method for Left Rotation of an Array
    static void leftRotate(int [] arr, int k){
        /* [ 1,2,3,4,5 ]
        After 2 Left Rotations it Becomes
           [ 4,5,1,2,3 ]
         */
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    // Method to Reverse the Array
    static void reverse(int [] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]   = temp;
            start ++;
            end --;
        }
    }
}
