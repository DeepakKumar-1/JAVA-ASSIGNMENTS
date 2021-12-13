package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class SortArrayInDescOrder {
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
        sort(arr);
        // Display Array After Sorting
        System.out.println(" Array After Descending Order Sorting is: " + Arrays.toString(arr));
    }

    static void sort(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j = 1; j <= arr.length- i -1; j++){
                if(arr[j-1] < arr[j])
                    swap(arr, j-1, j);
            }
        }
    }
    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a]   = arr[b];
        arr[b]   = temp;
    }
}
