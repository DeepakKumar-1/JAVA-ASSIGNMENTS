
// STATUS --> PENDING
package com.company;

import java.util.Scanner;

public class Pattern23  {
    // Pattern 23
    public static void main(String [] args){
        /*
        Pattern 23
                       *      *
                     *   *  *   *
                   *      *      *
         */
        // Creating Scanner Object For taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Number of ROWS and COLUMNS from the USER
        System.out.print(" Enter Number of ROWS for the Pattern: ");
        int n = sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        // Procedure to print the Required Pattern

        int inSpace = 1;
        int inSpace2 = 2 * n - 3;
        int inSpace3 = 1;
        for(int row =1; row <= n ; row++){
            // Trailing Spaces
            for(int spaces = 1; spaces <= n - row; spaces ++){
                System.out.print(" ");
            }
            int noOfColumns = row > 1 ? 2 : 1;
            for(int column = 1; column <= noOfColumns ; column++){
                System.out.print("* ");
                if(row > 1){
                    for(int spaces = 1; spaces <= inSpace ; spaces ++) {
                        System.out.print(" ");
                    }
                    inSpace += 2;
                }
            }
            if( row >= 1 && row < n) {
                for (int spaces = 1; spaces <= inSpace2; spaces++) {
                    System.out.print(" ");
                }
                inSpace2 -= 2;
            }

            for(int column = 1; column <= noOfColumns ; column++){
                System.out.print("* ");
                if(row > 1){
                    for(int spaces = 1; spaces <= inSpace3 ; spaces ++) {
                        System.out.print(" ");
                    }
                    inSpace3 += 2;
                }
            }

            System.out.println();
        }
    }
}
