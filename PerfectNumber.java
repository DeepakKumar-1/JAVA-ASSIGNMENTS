package com.company;

import java.util.Scanner;
public class PerfectNumber {
    // Perfect Number In Java
    public static void main(String [] args){
        /*
            Perfect Number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself
            Example 6
            factors of 6 --> 1,2,3 (Except 6)
            So    1+2+3 = 6
         */

        // Creating Scanner Object for Taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // taking Any Number From the User
        System.out.print(" Enter any Number: ");
        int num = sc.nextInt();

        // Initializing SumOfFactors Variable to 0 for later use
        int sumOfFactors = 0;
        for(int i = 1;i<num;i++){
            if(num% i == 0){
                sumOfFactors += i;
            }
        }
        // Now checking if the Number and Sum of Factors of the Number are Equal or Not
        // if Equal then print Number is a Perfect Number
        // Otherwise Number is not Perfect
        if(num == sumOfFactors){
            System.out.println(num + " is a perfect Number ");
        } else{
            System.out.println(num + " is Not a Perfect Number ");
        }
    }
}
