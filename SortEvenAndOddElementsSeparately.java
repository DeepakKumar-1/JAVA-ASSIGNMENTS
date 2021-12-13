package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortEvenAndOddElementsSeparately {
    // Put Even and Odd Elements of an Array in two Separate Arrays
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking SIZE of Array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Creating Array of Required SIZE
        int [] arr = new int[n];
        // Fill the Array with n elements
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the ARRAY
        System.out.println(Arrays.toString(arr));
        // Procedure to Count Number of EVEN and ODD Elements
        ArrayList<Integer> evenEle = new ArrayList<>();
        ArrayList<Integer> oddEle = new ArrayList<>();
        for(int element: arr){
            if(element % 2 == 0)
                evenEle.add(element);
            else
                oddEle.add(element);
        }

        // Display Results
        System.out.println(" Original Array is: " + Arrays.toString(arr));
        System.out.println(" Even Elements of Array: " + evenEle);
        System.out.println(" Odd Elements of Array: " + oddEle);

        System.out.println(" **** SORTED ARRAYS **** ");
        Arrays.sort(arr);
        System.out.println(" Original Array is: " + Arrays.toString(arr));
        Collections.sort(evenEle);
        System.out.println(" Even Elements of Array: " + evenEle);
        Collections.sort(oddEle);
        System.out.println(" Odd Elements of Array: " + oddEle);
    }
}
