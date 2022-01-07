package com.company;

import java.util.Scanner;
public class StarPatterIncreasingOrder {
    // Print Start Pattern that will Increase Row Wise
    public static void main(String [] args){
        /*
        Print the Following Star Pattern
        *
        **
        ***
        ****
        *****
         */

        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Number of Rows and Columns from the USER
        System.out.print(" Enter Number of Rows: ");
        int noOfRows = sc.nextInt();
//        int column = sc.nextInt();
        for(int row=0; row<noOfRows; row++){   // For Iterating Over ROWS
            for(int column=0; column<=row ; column++){  // For Printing * in ROWS
                System.out.print(" " + "*");
            }
            System.out.println();   // For Space After Every Print
        }
    }
}
