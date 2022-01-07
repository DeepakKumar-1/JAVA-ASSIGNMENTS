package com.company;

import java.util.Scanner;
public class ValidPerfectSquare {
    // Valid Perfect Square
    public static void main(String [] args){
        /*
        Valid Perfect Square
        https://leetcode.com/problems/valid-perfect-square/
         */
        // Creating Scanner object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Number as a Input From the USER
        System.out.print(" Enter Any number For Which You want to Find SquareRoot: ");
        int num = sc.nextInt();
        // Display number is Valid Perfect Square or Not
        System.out.println(num + " is Valid Perfect Square (True or false): " + isPerfectSquare(num));

    }
    static boolean isPerfectSquare(int num) {
        int start = 1;
        int end   = num;
        while(start <= end){
            // find mid
            int mid = start + (end - start)/2;
            if((float)(mid) == (float)(num)/mid)
                /*
                  Why I type cast mid and num into float ?
                  Reason:
                       Suppose num --> 5
                       In this Case when we Check for 2
                       2 == 5/2 --> 2 == 2 (WRONG) --> Because 5 is not Valid SQUARE
                       but without type Cast it will give us True
                       So when we type cast into Float
                       2.0 == 5.0/2  -->  2.0 == 2.5 NOW it will give false for 5
                 */
                return true;
            else if(mid > num/mid)
                end = mid-1;
            else
                start = mid+1;
        }
        return false;
    }
}
