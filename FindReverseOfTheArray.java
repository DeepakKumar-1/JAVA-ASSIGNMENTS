package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class FindReverseOfTheArray {
    // Find Reverse of the ARRAY
    public static void main(String [] args){
        // Creating Scanner Object for taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Array From the USER
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // Create an Array of SIZE n
        int[] arr = new int[n];
        // Fill the Array By Taking Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the Array
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(" Reverse is: " + Arrays.toString(arr));
    }

    static void reverse(int [] arr){
        int start = 0;
        int end   = arr.length -1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
}
