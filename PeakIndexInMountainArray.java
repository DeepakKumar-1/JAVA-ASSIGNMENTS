package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class PeakIndexInMountainArray {
    // Peak Index in a Mountain Array
    public static void main(String[] args) {
        /*
        https://leetcode.com/problems/peak-index-in-a-mountain-array/
         */
        // Creating Scanner Object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the Array as a Input from the USER
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // Create Array of Required SIZE
        int[] arr = new int[n];
        // Fill the Array by taking Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Display the Array
        System.out.println(Arrays.toString(arr));
        // Display the Peak Index in the Mountain Array
        System.out.println(" Peak Index in the Mountain Array " + Arrays.toString(arr) + " is: " + peakIndexInMountainArray(arr));
    }
    /*
   CODE EXPLANATION

    let's take   arr --> [ 0, 1, 0 ]

    Here,
    Initially                       0   1  2
                          arr --> [ 0, 1, 0 ]
                                   /      \
                                start     end

    First Pass :
    mid = 1                 AS     0 + (  2-0  ) /2   --> 1
    arr[mid]  --> 1    and    arr[mid +1]  --> 0
    here , arr[mid]  > arr[mid + 1]       and mid +1 != arr.length     --> TRUE
    Here,  1 > 0   TRUE
    so               end = mid                   end  --> 1

    Second Pass :
              0  1  2
    arr --> [ 0, 1, 0 ]
             /   \
          start  end
    mid = 0                 AS     0 + (  1-0  ) /2   --> 0
    arr[mid]  --> 0    and    arr[mid +1]  --> 1
    Check  , arr[mid]  > arr[mid + 1]       and  mid +1 != arr.length     --> FALSE in this CASE
    Here,  0 > 1   FALSE
    so               start = mid +1                    start  --> 1

    HENCE , RETURN 1 Index BCZ at 1st INDEX there EXIST MAX ELEMENT of the Mountain ARRAY
    */

    public static int peakIndexInMountainArray(int[] arr) {
        // O(log N) Approach
        // Take two Pointers START and END
        // START Initially Points to 0th INDEX
        int start = 0;
        // END Initially Points to n-1 th Index where  n is is Length of the ARRAY
        int end = arr.length - 1;
        // Repeat Following Till start < end
        while (start < end) {
            // Find the MID Index
            int mid = start + (end - start) / 2;
            // Check is Element at mid Index is > than It's Successor and mid+1 Doesn't be the LAST Index
            if (arr[mid] > arr[mid + 1] && mid + 1 != arr.length)
                // You are Decreasing part of the Array
                // This may be the Possible Ans But look at Left
                // this is why end != mid-1
                end = mid;
            else
                // Otherwise i can say you are in Ascending Part of the Array
                start = mid + 1; // because we know that mid+1 element is > element at mid
            // Hence we are ignoring mid element
        }
        // At the END Start == end and pointing to the Largest Element because of the Above two checks
        // Start and end Always trying to find max Element in above two checks
        // hence when they are pointing to just one Element, that is the max one that what the checks say
        // more Elaboration: At every point of time for start and end, they have the best possible ans till that time
        // and if we are saying that one Element is remaining, hence because of the above line that is the best possible ans
        return start;   // or return end as Both are Equal
    }
}
