package com.company;

import java.util.Scanner;
public class SumOfTwoNumbers {
    // Sum of Two Numbers
    public static void main(String [] args){
        // Creating Scanner Object For Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // In First Line Take Number of Test Cases
        int t = sc.nextInt();
        while(t-- > 0){
            // Read Two Numbers a and b
            int a = sc.nextInt();
            int b = sc.nextInt();
            // Calculate the SUM
            int ans = a+b;
            // Display the SUM
            System.out.println(ans);
        }
    }
}
