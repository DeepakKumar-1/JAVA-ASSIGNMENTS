package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class ConcatenationOfArray {
    //  Concatenation of Array
    public static void main(String [] args){
        // Creating Scanner Object for Taking Input From The User
        Scanner sc = new Scanner(System.in);

        // Taking Size of the Array as a Input From the User
        System.out.print(" Enter Size of the Array: ");
        int n = sc.nextInt();

        // Creating Array of Size Entered by User
        int [] arr = new int[n];

        // Filling the Array
        for(int i=0;i<arr.length; i++){
            System.out.print(" Enter " + (i+1) + " Element: ");
            arr[i] = sc.nextInt();
        }

        // Display Array Once
        System.out.println(" Array is: " + Arrays.toString(arr));

        // Passing Array to Concatenate Function
        int [] concatenatedArray = getConcatenation2(arr);

        // Printing Resultant Array
        System.out.println(" Resultant Array is: " + Arrays.toString(concatenatedArray));

    }

    public static int[] getConcatenation(int[] nums) {
        // Creating New Array Doubles the Size of nums Array
        int [] concatenatedArray = new int[nums.length * 2];
        // Now Copy Elements on nums in Concatenated Array from 0 to n
        // After This Loop Indices 0 to n/2 of the Concatenated Array will be Filled with nums
        for(int i=0;i<nums.length;i++){
            concatenatedArray[i] = nums[i];
        }

        // Now We Left with indices n/2 to n
        // again Use a Loop and Copy nums[0 to n]
        for(int i=0 ; i<nums.length ; i++){
            concatenatedArray[nums.length + i] = nums[i];
        }
        // return the Concatenated Array
        return concatenatedArray;
    }


    public static int[] getConcatenation2(int[] nums) {
        // Creating New Array Doubles the Size of nums Array
        int [] concatenatedArray = new int[nums.length * 2];
        // Now Copy Elements on nums in Concatenated Array from 0 to n
        // After This Loop Indices 0 to n/2 of the Concatenated Array will be Filled with nums
        for(int i=0;i<nums.length;i++){
            concatenatedArray[i] = nums[i];
            concatenatedArray[nums.length + i] = nums[i];
        }

        // return the Concatenated Array
        return concatenatedArray;
    }
}
