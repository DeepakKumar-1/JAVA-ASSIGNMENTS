package com.company;

import java.util.Arrays;
public class ShuffleTheArray {
    // Shuffle The Array
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/shuffle-the-array/

        Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
        Return the array in the form [x1,y1,x2,y2,...,xn,yn].
         */
        int [] arr = {1,2,3,4,5,6};
        System.out.println(" Original Array is: " + Arrays.toString(arr));

        int n = arr.length/2;

        int [] shuffledArray = shuffle(arr,n);
        // Displaying Shuffled Array
        System.out.println(" Shuffled Array is: " + Arrays.toString(shuffledArray));
    }

    public static int [] shuffle(int [] nums,int n){
        // Creating New Array
        int [] shuffledArray = new int[nums.length];
        /*
        Example:
  index   -->    0   1   2   3   4   5
                x1   x2  x3  y1  y2  y3
                 1 , 2 , 3 , 4 , 5,  6      n -> 3      nums.length = 6 here
                 /           \       \
              start1       start2    nums.length-1

Shuffled Array   .........................
               1, 4, 2, 5, 3, 6
              x1 y1 x2 y2 x3 y3
         */
        int start1 = 0;
        int start2 = n;
        int i=0;
        while(start1<=start2 && start2<nums.length){
            shuffledArray[i] = nums[start1];
            shuffledArray[i+1] = nums[start2];
            i += 2;    // i is used for Filling the Elements
              // Here i must be incremented by 2 not by 1 because During First Pass
             //  First two indices will be Filled so we have to Start to 3rd one not with 2nd one
            start1++;
            start2++;
        }
        return shuffledArray;

    }
}
