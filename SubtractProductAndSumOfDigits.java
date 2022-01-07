package com.company;

import java.util.Scanner;
public class SubtractProductAndSumOfDigits {

    public static int sumOfDigits(int number){
        int sum = 0;
        while(number>0){
            int remainder = number % 10;  // Taking Remainder i.e Last Digits in this Case
            sum += remainder;
            number  /= 10;
        }
        return sum;
    }

    public static int productOfDigits(int number){
        int product = 1;
        while(number > 0){
            int remainder = number % 10;
            product *= remainder;
            number /= 10;
        }
        return product;
    }

    // Subtract the Product and Sum of Digits of an Integer
    public static void main(String [] args){
        /*
         Link : --> https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
        Given an integer number n, return the difference between the product of its digits and the sum of its digits.
            Input: n = 234
            Output: 15
            Explanation:
            Product of digits = 2 * 3 * 4 = 24
            Sum of digits = 2 + 3 + 4 = 9
            Result = 24 - 9 = 15
         */

        // Creating Scanner Object For taking Input from the User
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter any Integer Number: ");
        int num = sc.nextInt();

        int digitSum = sumOfDigits(num);
        int prodOfDigit = productOfDigits(num);

        // Subtracting product of Digits and sum of Digits
        int result = prodOfDigit - digitSum ;

        System.out.println(" Required Result is: " + result);
    }
}
