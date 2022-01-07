package com.company;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
public class KidsWithTheGreatestNumberOfCandies {
    // Kids With the Greatest Number of Candies
    public static void main(String [] args){
        /*
        https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

        Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]
        Explanation: If you give all extraCandies to:
        - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
        - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
        - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
        - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
        - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
         */

        int [] arr = {2,3,5,1,3};
//        int [] arr1 = {4,2,1,1,2};
        System.out.println(Arrays.toString(arr));
        List<Boolean> result =new ArrayList<>();
        result =  kidsWithCandies(arr,3);
//        result =  kidsWithCandies(arr1,1);
        System.out.println(result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Creating ArrayList for Storing Result
        List<Boolean> result = new ArrayList<>();
        //  Step1: Find Maximum Element in the Array
        int max = 0;
        for(int element : candies){
            if(element > max)
                max = element;
        }

        // Step2: After Finding the MAX Element
        // Add Extra Candies to each array Element and check if the result is greater than or Equal to Max or NOT
        // If YES add true in the List
        // Else add false in the List
        for(int candy: candies){
            if((candy + extraCandies) >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
