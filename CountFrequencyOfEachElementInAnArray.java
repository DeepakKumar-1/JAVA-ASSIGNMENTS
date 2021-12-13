package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class CountFrequencyOfEachElementInAnArray {
    // Count Frequency of Each Element in an ARRAY
    public static void main(String [] args){
        // Creating Scanner Object for taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Array From the USER
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // Create an Array of SIZE n
        int [] arr = new int[n];
        // Fill the Array By Taking Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the Array
        System.out.println(Arrays.toString(arr));
        // Procedure to Count the Frequency
        for(int i=0; i<arr.length ; i++){
            int frq = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j])
                    frq++;
            }
            System.out.println(" Frequency of " + arr[i] + " is: " + frq);
        }
    }
}
