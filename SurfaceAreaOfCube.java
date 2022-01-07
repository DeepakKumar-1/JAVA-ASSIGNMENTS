package com.company;

import java.util.Scanner;
public class SurfaceAreaOfCube {
    // Total Surface Area Of Cube
    public static void main(String [] args){
        /*
        Total Surface Area Of Cube
             Surface Area of Cube = 6 * a * a
             a --> Side of the Square
         */

        // creating Scanner Object for Taking input from the User
        Scanner sc = new Scanner(System.in);

        // Taking Side of the Cube as a Input from the User
        System.out.print(" Enter Side of the Cube: ");
        int side = sc.nextInt();

        // Calculating Total Surface Area of the Cube
        int surfaceArea = 6 * side * side;

        // Displaying the Total Surface Area of the Cube on the Screen
        System.out.println(" Total Surface Area of the Cube with side " + side + " is: " + surfaceArea);

    }
}
