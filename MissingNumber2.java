package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber2 {
    public static void main(String[] args) {
        /*
        https://leetcode.com/problems/missing-number/
        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
                     2 is the missing number in the range since it does not appear in nums.
         */
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking SIZE of 1D Array from the USER
        System.out.print(" Enter SIZE of 1D Array: ");
        int n = sc.nextInt();
        // Creating Array of Required SIZE
        int[] arr = new int[n];
        // Fill this Array By taking n number of Inputs from the USER
        System.out.print(" Enter " + n + " Elements: ");
        // Storing Inputs in the Array
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        // Displaying the Array Once
        System.out.println(" Array Before Sorting is: " + Arrays.toString(arr));
        // Display the Missing Number
        System.out.println(" Missing Number is : " + missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
/*
CODE EXPLANATION
STEP 1 : Find EXOR of Elements of Given Array
          --> Also Take Care That Array Contains 0 or Not

STEP 2 : Find EXOR of N Natural Numbers
             Here, N is the SIZE of Array
STEP 3 : Now Find the resultant EXOR by taking EXOR of Step1 and Step 2
       --> If Array Contains 0 and Resultant EXOR is also 0 then Return
	         Element at Last Index of Array + 1
	  -->if Array Doesn't Contain 0 But Resultant EXOR is Zero then Return 0
	  --> Otherwise Return the Resultant EXOR

Example :
                 arr --> [ 3, 2, 1 , 0 ]                N --> 4
				 N natural Numbers --> { 1, 2, 3, 4}
				 Resultant EXOR be Like
				  -->   0 ^ ( 1^1 ) ^ ( 2 ^2 )^ ( 3^3 ) ^ 4
				  -->  0 ^ 4 --> 4

				  Here,  Result is Not ZERO
				            Array Contains ZERO
							So, return the RESULT --> i.e  4 it's the Missing Number
*/
        int xorArr = 0, xorN = 0;
        boolean hasZero = false;
        for (int num : nums) {
            xorArr ^= num;
            if (num == 0)
                hasZero = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            xorN ^= i;
        }
        int result = xorArr ^ xorN;

        if (hasZero && result == 0)
            return nums[nums.length - 1] + 1;
        else if (result == 0)
            return 0;

        return result;
    }
}
