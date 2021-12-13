package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class SecondLargestElementOfTheArray {
    // Find Second Largest Element of the ARRAY
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking SIZE of the Array from the USER
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // Creating Array of Required SIZE
        int [] arr = new int[n];
        // Fill the Array by taking inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the Array
        System.out.println(Arrays.toString(arr));
        String array = Arrays.toString(arr);
        // Sort the Array
        Arrays.sort(arr);
        // Second Largest Element will be arr[length -2]
        System.out.println(" Second Largest Element of the Array " + array + " is: " + arr[arr.length -2]);
    }
}
