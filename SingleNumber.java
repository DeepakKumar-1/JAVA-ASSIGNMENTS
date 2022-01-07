package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class SingleNumber {
    // Number that's count is 1 in Array
    // Implement Algorithm that Work in Linear Time Complexity
    public static void main(String [] args){
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking SIZE of the ARRAY From the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Creating Array of Required SIZE
        int [] arr = new int[n];
        // Fill the Array by Taking Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the ARRAY
        System.out.println(Arrays.toString(arr));
        // Display the Element that's Count is 1 in ARRAY
        System.out.println(" Single Number in the Array " + Arrays.toString(arr) + " is: " + singleNumber(arr));
    }
    static int singleNumber(int[] nums) {
        /*
        CODE EXPLANATION
          Properties of XOR operation
          X ^ 0  --> X
          X ^ X  --> 0
          So, if Element Found twice in the Array then it's XOR will be 0
          And this 0 has No Impact on the Element that Exist with Count 1
          FOR EXAMPLE :
            Array -> [ 1, 2, 3, 2, 1 ]
          Find XOR of All Elements
             1 ^ 2 ^ 3 ^ 2 ^ 1
             (1 ^ 1) ^ (2 ^ 2) ^ 3
               0     ^    0    ^ 3
               0 ^ 3 = 3    --> RESULT

         */
        // Let Initially result is 0
        int result = 0;
        for(int element : nums)  // For Every Element in Array nums Find XOR
            result ^= element;   // --> result = result ^ element
        return result;
    }
}
