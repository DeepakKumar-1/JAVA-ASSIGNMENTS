package com.company;

import java.util.*;
public class ProductOfArrayExceptSelf {
    // Product of Array Except Self
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/product-of-array-except-self/
         */

        // Creating Scanner Object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take the SIZE of 1D array from the USER
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        // Declare the Array of Required SIZE
        int [] arr = new int[n];
        // Fill the Array
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Display the ARRAY
        System.out.println(Arrays.toString(arr));

        // Display the Resultant ARRAY
        System.out.println(" Resultant Array is: " + Arrays.toString(productExceptSelf4(arr)));

    }
    public static int[] productExceptSelf(int[] nums) {
        // Declare Array of Same SIZE as nums i.e resultant Array
        int [] result = new int[nums.length];   // Result Array will Contain Product of Elements except itself
        for(int i=0 ; i<nums.length; i++){ // Iterate over a Array and fill the result Array
            result[i] = findProduct(nums, i);   // For Every Element find Product except itself and Store that in result Array
        }
        // Now return the Resultant Array
        return result;
    }

    public static int findProduct(int []nums, int index){
       int prod = 1; // Initialize Product Variable to 1  NOT to 0 --> Because Zero will make product as 0
       for(int i=0; i<nums.length; i++) { //Now Iterate over nums array
           if (i == index)       // Check is the Index we Passed to this Function is Equal to i or not
               // if YES then SKIP that iteration
               continue;
           prod *= nums[i];     // do Product
       }
       // Return the Product for the Particular Element Except Itself
       return prod;
    }

    // Function USING Division and TWO POINTER METHOD
  public static int[] productExceptSelf2(int[] nums) {
        // Declare Array of Same SIZE as nums i.e resultant Array
        int [] result = new int[nums.length];   // Result Array will Contain Product of Elements except itself
        for(int i=0 ; i<nums.length; i++){ // Iterate over a Array and fill the result Array
           int product = 1;
           int start = 0;
           int end = nums.length -1;
           while(start<=end){
               product *= (nums[start] * nums[end]);
               start++;
               end--;
           }
           result[i] = product/nums[i];  // --> this will Produce RUN TIME ERROR for nums[i] = 0 ?
        }
        // Now return the Resultant Array
        return result;
    }

    // TIME LIMIT EXCEED
    public static int[] productExceptSelf3(int[] nums) {
        // Declare Array of Same SIZE as nums i.e resultant Array
        int [] result = new int[nums.length];   // Result Array will Contain Product of Elements except itself
        for(int i=0 ; i<nums.length; i++){ // Iterate over a Array and fill the result Array
            int product = 1;
            for(int j=0; j<nums.length; j++) { //Now Iterate over nums array
                if (j == i)       // Check is the Index we Passed to this Function is Equal to i or not
                    // if YES then SKIP that iteration
                    continue;
                product *= nums[j];     // do Product
            }
            result[i] = product;
        }
        // Now return the Resultant Array
        return result;
    }

    // TIME LIMIT EXCEED FOR LARGE INPUT
    public static int[] productExceptSelf4(int[] nums) {
        // Declare Array of Same SIZE as nums i.e resultant Array
        int [] result = new int[nums.length];   // Result Array will Contain Product of Elements except itself
        for(int i=0 ; i<nums.length; i++){ // Iterate over a Array and fill the result Array
            int product = 1;
            int start =0;
            int end = nums.length-1;

            while(start <= end) { //Now Iterate over nums array
                if (start == i){
                    start++;
                    // System.out.println(" I am Here " + i);
                }else if(end == i) {
                    end--;
                    // System.out.println(" I am END Here " + i);
                }

                if(start > end){
                    break;
                }else if(start == end){
                    product *= nums[start];
                }
                else{
                    product *= (nums[start] * nums[end]);  // do Product
                    // System.out.println(" TT ");
                }
                start ++;
                end--;
            }
            // System.out.println("P" + product);
            result[i] = product;
        }
        // Now return the Resultant Array
        return result;
    }

    //Product Except Itself
    // TIME LIMIT EXCEED
    public static int[] productExceptSelf5(int[] nums) {
        int [] result = new int[nums.length];
        for(int i=0; i<nums.length ; i++){
            result[i] = leftProduct(nums, i) * rightProduct(nums,i);
        }
        return result;
    }

    public static int leftProduct(int [] nums, int lastIndex){
        int prod = 1;
        for(int i=0; i<lastIndex; i++){
            prod *= nums[i];
        }
        return prod;
    }
    public static int rightProduct(int [] nums, int lastIndex){
        int prod = 1;
        for(int i=nums.length-1; i>lastIndex; i--){
            prod *= nums[i];
        }
        return prod;
    }


    // NEW METHOD --> VERY VERY IMPORTANT  --> APPLE CODDING QUES:
    public static int [] productExceptSelf6(int [] nums){
        int [] output_arr = new int[nums.length];
        /*
        CODE Explanation:
        let
              index -->  0   1   2   3   4
              nums -->  [1,  2,  3,  4,  5]

   initially output_arr is:
             output_arr --> [0, 0, 0, 0 , 0]
          Step 1: output_arr[0] = 1 --> [1, 0, 0, 0, 0]
       1st Pass:  i = 1
                  output[1] = output[0] * nums[0]
                  output[1] = 1 * 1  --> [1, 1, 0, 0, 0]
       2nd Pass:  i = 2
                 output[2] = output[1] * nums[1]
                 output[1] = 1 * 2  --> [1, 1, 2, 0, 0]
       3rd Pass:  i = 3
                 output[3] = output[2] * nums[2]
                 output[1] = 2 * 3  --> [1, 1, 2, 6, 0]
       4th Pass:  i = 4           4 < 5  TRUE
                 output[4] = output[3] * nums[3]
                 output[4] = 6 * 4  --> [1, 1, 2, 6, 24]    --> Here NOTE 24 is the Product for nums[4] except itself

    Now
          let rightProduct = 1
        1st Pass:  i = 4              4 >= 0 TRUE
                  output[4] = output[4] * 1                   As, output[i] = output[i] * rightProduct
                  output[4] = 24 * 1  --> [1, 1, 2, 6, 24]
                  rightProduct = 1 * 5 = 5                    As, rightProduct = rightProduct * nums[i]
       2st Pass:  i = 3               3 >= 0 TRUE
                  output[3] = output[3] * 5                   As, output[i] = output[i] * rightProduct
                  output[3] = 6 * 5  --> [1, 1, 2, 30, 24]
                  rightProduct = 5 * 4 = 20                    As, rightProduct = rightProduct * nums[i]
       3rd Pass:  i = 2                2 >= 0 TRUE
                  output[2] = output[2] * 20                   As, output[i] = output[i] * rightProduct
                  output[2] = 2 * 20  --> [1, 1, 40, 30, 24]
                  rightProduct = 20 * 3 = 60                    As, rightProduct = rightProduct * nums[i]
       4th Pass:  i = 1                1 >= 0 TRUE
                  output[1] = output[1] * 60                   As, output[i] = output[i] * rightProduct
                  output[1] = 1 * 60  --> [1, 60, 40, 30, 24]
                  rightProduct = 60 * 2 = 120                    As, rightProduct = rightProduct * nums[i]
         5th Pass:  i = 0                0 >= 0 TRUE
                  output[0] = output[1] * 120                   As, output[i] = output[i] * rightProduct
                  output[0] = 1 * 120  --> [120, 60, 40, 30, 24]
                  rightProduct = 120 * 1 = 120                    As, rightProduct = rightProduct * nums[i]

      So,
         Resultant Output Array is -->  [120, 60, 40, 30, 24]
         */

        output_arr[0] = 1;
        for(int i=1; i<nums.length; i++){
            output_arr[i] = output_arr[i-1] * nums[i-1];
        }

        int rightProduct = 1;
        for(int i= nums.length-1; i>=0; i--){
            output_arr[i] = output_arr[i]*rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return  output_arr;
    }
}