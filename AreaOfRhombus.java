package com.company;

import java.util.Scanner;
public class AreaOfRhombus {
//    Area Of Rhombus
    public static void main(String [] args){
        /*
        Area of Rhombus can be Calculated as:
        Area of Rhombus = d1 * d2
        d1 --> First Diagonal
        d2 --> Second Diagonal
         */

        // Creating Scanner Object for Taking Input From the User
        Scanner sc = new Scanner(System.in);

        // Now Taking value of First Diagonal from the user
        System.out.print(" Enter Value of First Diagonal: ");
        int d1 = sc.nextInt();

        // Now Taking value of Second Diagonal from the user
        System.out.print(" Enter Value of Second Diagonal: ");
        int d2 = sc.nextInt();

        // Calculating the Area
        int area = d1 * d2;

        // Displaying the Area on the Screen
        System.out.println(" Area of Rhombus with Diagonals " + d1 + " and " + d2 + " is: " + area );
    }
}
