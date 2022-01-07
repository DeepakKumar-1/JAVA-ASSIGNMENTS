package com.company;

import java.util.Scanner;
public class AverageOfNumbersTillN {
   // Calculate Average Of N Numbers
    public static void main(String [] args){
        /*
        Average of n Numbers = Sum of Numbers / n
         */

        // Creating Scanner Object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Numbers of Inputs from the User
        System.out.print(" Enter Number of Inputs: ");
        int n = sc.nextInt();

        // Initializing Sum Variable sum to 0 for it's Later Updation
        int sum = 0;
        // Now Taking All numbers till Number of Inputs
        for(int i = 0;i < n; i++){
            System.out.print(" Enter " + (i+1) +" Number: " );
            int num = sc.nextInt();
            // Updating Sum variable by Adding Input number with it
            sum = sum + num;
        }

        // Once Sum is Calculated then find the Average of Numbers
        float average = (float)(sum)/(float)(n);

        // Displaying Average on the Screen
        System.out.println(" Average of Numbers is: " + average);

    }
}
