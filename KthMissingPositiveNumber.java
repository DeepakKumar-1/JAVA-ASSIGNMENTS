package com.company;

public class KthMissingPositiveNumber {
    // Kth Missing Positive Number
    public static void main(String [] args){
        int [] arr = {2,3,4,7,11};
        int k = 5;
        int missingNumber = findKthPositive(arr, k);
        System.out.println(k + "th Missing Number is: " + missingNumber);
    }

    static int findKthPositive(int[] arr, int k) {
        for(int element: arr){
            if(element <= k)
                k++;
            else
                break;
        }
        return k;
    }
}
