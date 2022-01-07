package com.company;

import java.util.*;

public class AddToArrayFormOfInteger {
    //  Add to Array-Form of Integer
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/add-to-array-form-of-integer/

            Input: num = [1,2,0,0], k = 34
            Output: [1,2,3,4]
            Explanation: 1200 + 34 = 1234
        */

        // Creating Scanner Object for taking Inputs from the User
        Scanner sc = new Scanner(System.in);
        // Now take the Size of the Array from the USER
        System.out.print(" Enter size of the Array: ");
        int n = sc.nextInt();
        // Now Declare 1D Array of Same SIZE as Entered by the USER
        int [] arr = new int[n];
        // Now Take inputs for the ARRAY from the USER
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Display the ARRAY on the Screen
        System.out.println(Arrays.toString(arr));
        // Now Take Any Integer k
        System.out.print(" Enter the Value of k: ");
        int k = sc.nextInt();

        // Displaying Resultant 1D ARRAY
        System.out.println(" Resultant Array is: " + addToArrayForm(arr,k));


    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        // Create A List
        List<Integer> list = new ArrayList<>();
        // Start from Last index of num Array
        /*
                          INDEX -> 0 1 2
        Explanation: let  num --> [2,3,2]
                          k   -->  8947
                     ADD num[LAST INDEX] + k  --> 2 + 8947 =  8949 --> k'   ADD(9) to LIST
                     Now ADD num[1] + (k' % 10) --> 3 + 894 = 897   --> k'   ADD(7) to LIST
                     Now ADD num[0] + (k' % 10) --> 2 + 89 = 91     --> k'   ADD(1) to LIST
                      k = k' % 10 = 9
                     At the End of the loop k != 0    So
                     Now ADD DIGITS of k to list FROM the END     --> ADD(9) to List
                     Now k is 0 so END while Loop

       At this point we have List as --> [9,7,1,9]  --> Here NOTE that it is the REQUIRED ANS BUT IN REVERSE ORDER
                     --> So, now REVERSE the LIST
                     --> At the END return the Required List
         */
        for(int i=num.length-1 ; i>=0;i--) {
            int sum = num[i] + k;
            list.add(sum % 10);
            k = sum/ 10;
        }
        // if After Adding k in the Number  k is not ZERO then do this
        while(k > 0){
            list.add(k%10);
            k /= 10;
        }
        // Now Reverse the LIST
        Collections.reverse(list);
        // AT the end Return the list
        return list;
    }
}
