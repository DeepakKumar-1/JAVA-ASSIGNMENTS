package com.company;

import java.util.Scanner;
public class DecrementStarPattern {
    // STAR PATTERN
    public static void main(String [] args){
        /*
        STAR PATTERN to Print
                *****     --> n times
                ****      --> n-1 times
                ***       --> n-2 times
                **
                *         --> 1 times
         */
        // Creating Scanner Object for Taking Input From the USER
        Scanner sc = new Scanner(System.in);

        // Taking Number of Rows and Columns from the USER
        System.out.print(" Enter Number of ROWS and COLUMNS : ");
        int noOfRows = sc.nextInt();
        int noOfColumns = sc.nextInt();

        // Procedure for Printing Required Star Pattern
        for(int row=0; row<noOfRows; row++){
            for(int columns=noOfColumns-row; columns>0;columns--){
                /*
                Explanation :
                outer for loop is for Number of ROWS
                inner for loop is for Number of COLUMNS
                --> columns = noOfColumns- row --> It Means columns will Decrease with the number of ROWS
                Example:    Let noOfRows = 3     and noOfColumns = 3
                     for row = 0     columns = noOfColumns - 0 --> Will print Stars noOfColumns Time i.e 3 Times
                     for row = 1     columns = noOfColumns - 1 --> Will print Stars noOfColumns-1 Time i.e 2 Times
                     and so on .....
                 */
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
