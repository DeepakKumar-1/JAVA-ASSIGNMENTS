package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class TwoSumII {
    // Two Sum II
    public static void main(String [] args){
        /*
        Two Sum II
        https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
        STATUS --> PENDING (ALSO TRY TO SOLVE USING BINARY SEARCH)
         */
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of the 1D Array From the USER
        System.out.print(" Enter SIZE of 1D Array: ");
        int n = sc.nextInt();
        // Create Array of Required SIZE
        int [] arr = new int[n];
        // Fill the ARRAY by taking Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length ; i++)
            arr[i] = sc.nextInt();
        // Display the ARRAY
        System.out.println(Arrays.toString(arr));
        // take Target Sum from the USER
        System.out.print(" Enter target SUM: ");
        int tSum = sc.nextInt();
        // Display the Required Answer
        System.out.println(tSum + " can be Obtained by Adding Elements of Indices -> " + Arrays.toString(twoSum(arr, tSum)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int  end  = numbers.length - 1;
        while(numbers[start] + numbers[end] != target ){
            if(numbers[start] + numbers[end] < target ){
                start++;
            }else{
                end--;
            }

        }
        return new int[]{start +1,end +1};
    }

}
