package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class RunningSumOf1dArray {
    //  Running Sum of 1d Array
    public static void main(String [] args){
        /*
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
         */

        // Creating Scanner Object for taking input From the User
        Scanner sc = new Scanner(System.in);

        // Taking Size of the array from the User
        System.out.print(" Enter Size of the Array: ");
        int n = sc.nextInt();

        // Declaring Array of Required Size
        int [] arr = new int[n];

        // Now taking Inputs for the Array From the User
        for(int i=0;i<n;i++){
            System.out.print(" Enter " + (i+1) + " Element: ");
            arr[i] = sc.nextInt();
        }

        // Displaying Array
        System.out.println(" Array Elements are: " + Arrays.toString(arr));

        // Passing this Array to Running Sum Function
        int [] ans = runningSum(arr);

        // Displaying Resultant Array
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
        // Creating a New Array of Same size as nums Array
        int [] ans = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length; i++){
            if(count == 0) {
                ans[i] = ans[i] + nums[i];
                count++;
            } else{
                ans[i] = ans[i-1] + nums[i];
            }
        }
        return ans;
    }

    public static int[] runningSum2(int[] nums) {
        int prevSum = nums[0];
        for(int i=1;i<nums.length; i++){
            nums[i] = prevSum + nums[i];
            prevSum = nums[i];
        }
        return nums;
    }
}
