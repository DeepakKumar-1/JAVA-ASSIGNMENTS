package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class MaxAndMinInArray {
    // Find Maximum and Minimum from the Array
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Array as a Input from the USER
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // creating Array of Required SIZE
        int [] arr = new int[n];
        // Fill the Array by taking n Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        // Display the Array
        System.out.println(Arrays.toString(arr));
        // Procedure to Find Max and Min in the Array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int element: arr){
            if(element > max)
                max = element;
            if(element < min)
                min = element;
        }

        // Display the Maximum and Minimum Element of the Array
        System.out.print("Array is : " + Arrays.toString(arr) + "\n Maximum Element is " + max + " \n Minimum Element is " + min);
    }
}
