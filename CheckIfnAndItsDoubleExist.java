package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class CheckIfnAndItsDoubleExist {
    //  Check If N and Its Double Exist
    public static void main(String [] args){
        /*
         Check If N and Its Double Exist
         https://leetcode.com/problems/check-if-n-and-its-double-exist/
         */
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take SIZE of 1D Array From the USER
        System.out.print(" Enter SIZE of 1D ARRAY: ");
        int n = sc.nextInt();
        // Create Array of Required SIZE
        int [] arr = new int[n];
        /// Fill the Array by taking n inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        // Display the ARRAY
        System.out.println(Arrays.toString(arr));
        // Display if the Element N and its Double Exist or Not
        System.out.println(" N and it's Double EXIT or NOT ? : " + checkIfExist(arr));

    }

    static boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length ; j++){
                if(arr[i] == 2*arr[j] || arr[j] == 2* arr[i])
                    return true;
            }
        }
        return false;
    }
}
