package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class CreateTargetArrayInTheGivenOrder {
    // Create Target Array in the Given Order
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/create-target-array-in-the-given-order

            Example :
            Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
            Output: [0,4,1,3,2]
            Explanation:
            nums       index     target
            0            0        [0]
            1            1        [0,1]
            2            2        [0,1,2]
            3            2        [0,1,3,2]
            4            1        [0,4,1,3,2]
         */

        // Creating Scanner Object for Taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Size of the Array from the User
        System.out.print(" Enter Size of the Array: ");
        int n = sc.nextInt();
        // Declaring Array of Required Size
        int [] arr = new int[n];
        // Taking Inputs from the User
        for(int i=0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Displaying Array on the Screen
        System.out.println(" Given Array: " + Arrays.toString(arr));

        // index Array
        int [] index = {0,1,0};
        //int [] index = {0,4,3,2,1};
        // Displaying index Array on Screen
        System.out.println(" Index Array: " + Arrays.toString(index));

        int [] result = createTargetArray(arr, index);
        // Display resultant Array
        System.out.println(" Result: " + Arrays.toString(result));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        // Creating targetArray array of Same Size as nums Array
        int [] targetArray = new int[nums.length];
        // For Loop to Fill the Target Array
        for(int i=0;i<targetArray.length; i++){
            // Now
            /*
            As we Know By default all the Values of Arrays are initialised to 0
            now check The nums[i] that we want to Insert in target Array Firstly check
            is That Position in the Array is 0 or Not
            if That Position is 0 it means place is Empty
            But REMEMBER if you have to Insert 0 in the Target Array (when 2 Zeros are there in given Array)
            in that case also check is the 0th place in the Target Array is 0?
             */
            if(targetArray[index[i]] != 0 || (targetArray[index[i]]==0 && index[i] == 0)){
                // Now Shift all the Elements Right Side Starting From END
                int j = targetArray.length-2;
                // Shifting Procedure
                while(j>=index[i]) {
                    targetArray[j+1] = targetArray[j];
                    j--;
                }
            }
            // Now if place is EMPTY in the target Array then Insert nums[i] in it
            targetArray[index[i]] = nums[i];

        }
        // At the End Return the Target Array
        return targetArray;
    }
}
