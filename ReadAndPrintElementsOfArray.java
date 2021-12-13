package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class ReadAndPrintElementsOfArray {
    // Read and Print Elements of the Array - Using Recursion
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Creating Array of Required SIZE
        int [] arr = new int[n];
        // Fill the Array by taking input from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        // Display the Array
        System.out.println(Arrays.toString(arr));
    }
}
