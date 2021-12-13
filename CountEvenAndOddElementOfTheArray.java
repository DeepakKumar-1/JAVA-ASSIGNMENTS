package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class CountEvenAndOddElementOfTheArray {
    // Calculate Count of Even and Odd Numbers from the Array
    public static void main(String []args){
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
        int evenCount = 0;
        int oddCount  = 0;
        for(int element: arr){
            if(element % 2 == 0)
                evenCount ++;
            else
                oddCount ++;
        }

        // Display the Even and Odd Count
        System.out.print(" Array is: " + Arrays.toString(arr) + "\n Number of Even Elements " + evenCount + "\n Number of Odd Elements " + oddCount);
    }
}
