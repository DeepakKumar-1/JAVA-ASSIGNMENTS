package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class BuildArrayFromPermutation {
    //  Build Array from Permutation
    public static void main(String [] args){
       /*
        Input: nums = [0,2,1,5,3,4]
        Output: [0,1,2,4,5,3]
            Explanation: The array ans is built as follows:
            ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
                = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
                = [0,1,2,4,5,3]
         */
        // Creating Scanner For Taking Inputs
        Scanner sc = new Scanner(System.in);

        // Taking SIZE of the Array as a Input From the User
        System.out.print(" Enter the Size of the Array: ");
        int n = sc.nextInt();

        // Now Creating Array of Size n
        int [] arr = new int[n];

        // Now Taking Elements from the User
        for(int i=0;i<arr.length ; i++){
            System.out.print(" Enter " + (i+1) + " Element: ");
            arr[i] = sc.nextInt();
        }

        // Displaying Array Once
        System.out.println(" Array is: " + Arrays.toString(arr));

        // Now Passing Array to build Array Function
        int [] ans = buildArray(arr);

        // Displaying Resultant Array
        System.out.println(" Resultant Array is: " + Arrays.toString(ans));


    }

    public static int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i=0;i<nums.length ;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
