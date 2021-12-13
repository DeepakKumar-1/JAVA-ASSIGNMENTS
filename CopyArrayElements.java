package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class CopyArrayElements {
    // Copy All the Elements from one Array to Another
    public static void main(String [] args){
        //Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Declare two Array of SIZE n
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        // Fill the array arr1 by taking n Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr1.length; i++)
            arr1[i] = sc.nextInt();
        // Display Array 1
        System.out.println(" Array 1 is: " + Arrays.toString(arr1));
        // Copy Elements from arr1 to arr2
        arr2 = arr1.clone();
        System.out.println(" Array 2 is: " + Arrays.toString(arr2));
    }
}
