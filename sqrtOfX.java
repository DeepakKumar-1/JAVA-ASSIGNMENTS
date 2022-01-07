package com.company;

import java.util.Scanner;
public class sqrtOfX {
    // sqrt(x)
    public static void main(String [] args){
        /*
        sqrt(x) --> Without USE of Any Built in Function or Operator
        https://leetcode.com/problems/sqrtx/
        */
        // Creating Scanner object for taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Number as a Input From the USER
        System.out.print(" Enter Any number For Which You want to Find SquareRoot: ");
        int x = sc.nextInt();
        // Display the SquareRoot of that Number
        System.out.println(" SquareRoot of " + x +  " is: " + mySqrt(x));
    }
    static int mySqrt(int x) {
        int start = 1;
        int end = x;
        while (start <= end) {
            // find mid value
            int mid = start + (end - start) / 2;
            if (mid == x / mid)
                return mid;
            else if (mid > x / mid)
                end = mid - 1;
            else
                start = mid + 1;
        }
            // if X is not a Perfect SquareRoot then return Floor(sqrt(x))
            return end;
        }

    static int mySqrt2(int x) {
        /*
        CODE Explanation:
           Step1:  Check if the Given number is 0 then Simply return 0
           Step2: Now take three Variables as
                  start -> 1
                  end   -> x (Given Number)
              Reason: 1, 2, 3 .......... X      --> Because SquareRoot Always Lies Before the Given number  Not After it
                     /                   \
                  start                  end
                ans -> 0   For Storing the result
           Step3: Now repeat the Following Steps Till start <= end
                 --> Find Mid = start + (end - start)/2
                 --> check if mid * mid <= x ?   --> This will cause overflow so take mid = x/mid
                      if YES -->  then Store mid in Ans Because it might be the Possible ans
                      and Search in right half    start = mid + 1
                --> otherwise Search in left half   end = mid - 1
          Step4: At the and Return the ans
         */
        // if x is 0 then Simply Return 0
        if(x == 0)
            return x;
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end){
            // find mid value
            int mid = start + (end - start)/2;
            if(mid <= x/mid){
                ans = mid;   // Store mid in ans Because it might be the possible ans
                start = mid+1;  // then Search in Right Half
            }
            else
                end = mid-1;   // otherwise Search in left Half
        }
        // if X is not a Perfect SquareRoot then return Floor(sqrt(x))
        return ans;
    }

}
