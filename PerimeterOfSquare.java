package com.company;

import java.util.Scanner;

public class PerimeterOfSquare {
    // Perimeter Of Square
    public static void main(String[] args) {
        /*
        Perimeter of the Square can be Calculated as :
        perimeter = 4 * side
         */

        // Creating Scanner Object for taking input from the user
        Scanner sc = new Scanner(System.in);

        // taking side of a Square
        System.out.print(" Enter value of Side of Square: ");
        int side = sc.nextInt();

        // Calculating perimeter of the Square
        int perimeter = 4 * side;

        // Displaying Perimeter on the Screen
        System.out.println(" Perimeter of the Square with " + side + " is: " + perimeter);

    }
}
