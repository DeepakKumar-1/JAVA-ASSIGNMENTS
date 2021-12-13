package com.company;

import java.util.Scanner;
public class FindTheDay {
    // Find the Day
    public static void main(String [] args){
        /*
        Explanation:
           Day Number --> 2
           Output: Tuesday
         */
        // Creating Scanner Object for Taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Day Number From the USER
        System.out.print(" Enter Day Number: ");
        int dayNumber = sc.nextInt();
        // Display the Corresponding Day
        switch(dayNumber){
            // There are total 7 Days in the Week
            // if User Enter 8 or Anything Else Display Wrong Input !!
            case 1 -> { System.out.println(" Monday "); }
            case 2 -> { System.out.println(" Tuesday "); }
            case 3 -> { System.out.println(" Wednesday "); }
            case 4 -> { System.out.println(" Thursday "); }
            case 5 -> { System.out.println(" Friday "); }
            case 6 -> { System.out.println(" Saturday "); }
            case 7 -> { System.out.println(" Sunday "); }
            default -> { System.out.println(" Wrong Input !! "); }
        }
    }
}
