package com.company;

import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    // Perimeter Of Equilateral Triangle
    public static void main(String [] args){
        /*
        Perimeter of the Equilateral triangle can be Calculated as
        perimeter = 3 * side
         */

        // Creating the Scanner Object for taking input from the user
        Scanner sc = new Scanner(System.in);

        // Taking value of side of the Equilateral Triangle as a input from the user
        System.out.print(" Enter Value of the side of Equilateral Triangle: ");
        int side = sc.nextInt();

        // Calculating the Perimeter of the Equilateral Triangle
        int perimeter = 3 * side;

        // Displaying perimeter on the Screen
        System.out.println(" Perimeter of Equilateral Triangle with side " + side + " is: " + perimeter);

    }
}
