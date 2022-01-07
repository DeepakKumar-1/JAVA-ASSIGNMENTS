package com.company;

import java.util.Scanner;

public class PerimeterOfRhombus {
    // Perimeter Of Rhombus
    public static void main(String[] args) {
        /*
        Perimeter Of Rhombus
        perimeter = 4 * side
         */

        // Creating Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking side of the rhombus as a input from the User
        System.out.print(" Enter Side of the Rhombus: ");
        int side = sc.nextInt();

        // Calculating Perimeter of the Rhombus
        int perimeter = 4 * side;

        // Displaying perimeter on the Screen
        System.out.println(" Perimeter of the Rhombus with side " + side + " is: " + perimeter);
    }
}
