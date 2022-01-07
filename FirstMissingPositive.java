package com.company;
import java.util.*;
public class FirstMissingPositive {
    // First Missing Positive
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/first-missing-positive/
         */
        // Creating Scanner Object For Taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take the SIZE of the Array from the USER
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // Declare the 1D Array with Required SIZE
        int [] arr = new int[n];
        // Fill the Array
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Displaying the Array
        System.out.println(Arrays.toString(arr));
        // Now Display the First Missing Positive from the ARRAY
        System.out.println(" First Missing Positive is: " + firstMissingPositive(arr));
    }
        static int firstMissingPositive(int[] nums) {
            cyclicSort(nums);
            for(int i=0; i<nums.length; i++){
                if(i != nums[i]-1){
                    return i+1;
                }
            }
            return nums.length +1 ;
        }

        static void cyclicSort(int[] nums){
            int i = 0;
            while(i<nums.length){
                int correct = nums[i]-1;
                if(nums[i] > 0 && nums[i] <nums.length && nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else
                    i++;
            }
        }
    }
