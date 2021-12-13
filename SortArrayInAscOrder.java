package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class SortArrayInAscOrder {
    // Sort the Array In Ascending Order
    public static void main(String [] args){
        // Creating Scanner Object For Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of Input Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Create an Array of Require SIZE i.e of SIZE n
        int[] arr = new int[n];
        // Fill this Array By taking n Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Display the Array Before Sorting
        System.out.println(" Array Before Sorting is: " + Arrays.toString(arr));
        Arrays.sort(arr);
        // Display Array After Sorting
        System.out.println(" Array After Sorting is: " + Arrays.toString(arr));
    }
}
