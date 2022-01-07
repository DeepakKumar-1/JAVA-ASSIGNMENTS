package com.company;

import java.util.Scanner;
public class SumOfNaturalNumbersUsingFunctions {
    // Write a function that returns the sum of first n natural numbers.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Till Which Natural Numbers You want To Print Sum?: ");
        int end = sc.nextInt();

        System.out.println(" Sum is: " + sum(end));
    }

    static int sum(int end){
        int result = 0;
        // Natural Numbers Starts From 1
        for(int i=0 ;i<= end ;i++){
            result += i;
        }
        return  result;
    }
}

