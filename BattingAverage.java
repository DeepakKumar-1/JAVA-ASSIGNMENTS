package com.company;

import java.util.Scanner;
public class BattingAverage {
    // Calculate Batting Average
    public static void main(String [] args){
        /*
        Batting Average = Total Number of Runs Scored / Total Times Outs
         */

        // Creating Scanner Object for Taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Required Inputs from the user for Calculating Batting Average
        System.out.print(" Enter Number of Runs Scored: ");
        int runs = sc.nextInt();

        System.out.print(" Enter Total Times Outs: ");
        int outs = sc.nextInt();

        // Calculating Batting Average
        float battingAvg = (float)(runs)/(float)(outs);

        // Displaying Batting Average on the Screen
        System.out.println(" Batting Average with Runs " + runs + " Outs " + outs + " is: " + battingAvg);
    }
}
