package com.company;

import java.util.Scanner;
public class SumOfNNumbers {
    // Sum Of N Numbers
    public static void main(String [] args){
        /*
        Sum = a + b + c + ....... + n
         */

        // Creating Scanner Object for Taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking How Many Numbers User Wants to Add
        System.out.print(" Enter How Many Numbers You want to Add: ");
        int n = sc.nextInt();

        // Now Taking numbers one by one and Adding them to Sum
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.print(" Enter " + (i+1) + " Number: ");
            int num = sc.nextInt();
            sum += num;
        }
        // Sum of All the Numbers has been Calculated
        // Displaying Sum on the Screen
        System.out.println(" Sum is: " + sum);
    }
}
