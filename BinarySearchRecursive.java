package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
     // Recursive Binary Search  --> Only Works for Sorted Array
        public static void main(String [] args) {
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
            // Take the Target Element that USER wants to Find
            System.out.print(" Enter Element that You Want to Find : ");
            int target = sc.nextInt();
            // Display Is Element Found in Given Array or Not
            if (binarySearch(arr, target, 0, arr.length -1))
                System.out.println(" Congratulations!! " + target + " Found in the Array " + Arrays.toString(arr));
            else
                System.out.println(" Sorry!! " + target + " Doesn't Found in the Array " + Arrays.toString(arr));
        }

        static boolean binarySearch(int [] arr, int target, int start , int end){
                int mid = start + (end - start) / 2;
                if(arr[mid] == target)
                    return true;
                else if(arr[mid] > target)
                   // Search in Left Sub Array
                    binarySearch(arr, target, 0, mid-1);
                else
                    // Search in Right Sub Array
                    binarySearch(arr, target, 0, mid-1);
            return false;
        }
}
