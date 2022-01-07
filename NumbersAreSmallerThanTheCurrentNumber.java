package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class NumbersAreSmallerThanTheCurrentNumber {
    // How Many Numbers Are Smaller Than the Current Number
    public static void main(String [] args){
        /*
        How Many Numbers Are Smaller Than the Current Number
        https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

            Input: nums = [8,1,2,2,3]
            Output: [4,0,1,1,3]
            Explanation:
            For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
            For nums[1]=1 does not exist any smaller number than it.
            For nums[2]=2 there exist one smaller number than it (1).
            For nums[3]=2 there exist one smaller number than it (1).
            For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
         */

        // Creating Scanner Object for Taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Size of the Array From the USER
        System.out.print(" Enter Size of the Array: ");
        int n = sc.nextInt();
        // Declaring Array of Size n
        int [] arr = new int[n];

        // Taking Required Numbers of Inputs from the User
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Displaying Array
        System.out.println(Arrays.toString(arr));

        System.out.println(" Resultant Array is: " + Arrays.toString(smallerNumbersThanCurrent(arr)));


    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // Resultant Array
        int [] resultantArray = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                int max = nums[i];
                if(nums[j]  < max && j!=i )
                    count++;
            }
            resultantArray[i] = count;
        }
        return resultantArray;
    }
}
