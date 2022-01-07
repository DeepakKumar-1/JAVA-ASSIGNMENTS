package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class FindTheHighestAltitude {
    // Find the Highest Altitude
    public static void main(String [] args) {
        /*
        Find the Highest Altitude
        https://leetcode.com/problems/find-the-highest-altitude/

        Input: gain = [-5,1,5,0,-7]
        Output: 1
        Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
         */

        // Creating Scanner Object for Taking Input From the User
        Scanner sc = new Scanner(System.in);

        // Taking Size of the Array from the User
        System.out.print(" Enter Size of the Array: ");
        int n = sc.nextInt();
        // Now Declaring Array of Size n
        int [] arr = new int[n];
        // Now Taking Inputs from the User
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // Displaying Array on the Screen
        System.out.println(" Array is: " + Arrays.toString(arr));
        // Displaying Highest on the Screen
        System.out.println(" Highest Altitude is: " + largestAltitude2(arr));
    }

    public static int largestAltitude2(int[] gain) {
        int prevSum = 0;
        int maxAltitude = 0;
        int i=0;
        while(i<gain.length) {
            int altitude = gain[i]+prevSum;
            if ( altitude > maxAltitude)
                maxAltitude = altitude;

            prevSum = altitude;
            i++;
        }
        return maxAltitude;
    }

        public static int largestAltitude(int[] gain) {
        // Creating new Array altitude of Size n+1 i.e gain.length + 1
            int [] altitude = new int[gain.length + 1];
            // Initially Take PrevSum as 0 for later updation
            int prevSum = 0;
            // Loop to fill the altitude Array
            for(int i=0; i<altitude.length-1;i++){
                // altitude[0] --> is By Default 0
                // So start with next Element altitude[1]
                altitude[i+1] = prevSum + gain[i];
                prevSum = altitude[i+1];    // Update the PrevSum and store the new prevSum to it
            }
            System.out.println(" Altitude Array is: " + Arrays.toString(altitude));
            // Now Finding Largest Value in altitude Array
            // For this Take First Element of the maxAltitude as maxAltitude and
            // Compare it with other Elements of the Array
            int maxAltitude = altitude[0];
            for(int element: altitude){      // For Every Element Check is their any Element
                // Larger than The maxAltitude (initially contains First Element of altitudeArray)
                if(element > maxAltitude)
                    // Now if any Element is Greater than the maxAltitude then update the maxAltitude
                    maxAltitude = element;
            }
            // Return the Max Altitude
            return maxAltitude;
        }


}
