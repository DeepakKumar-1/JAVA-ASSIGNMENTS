package com.company;

import java.util.Scanner;

public class PerimeterOfRectangle {
    // Perimeter Of Rectangle
    public static void main(String[] args) {
        /*
        Perimeter Of Rectangle can be Calculated as :
        perimeter = 2 * ( length + breath )
         */

        // Creating Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        // taking length and breath from the user
        System.out.print(" Enter value of length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print(" Enter value of breath of the rectangle: ");
        int breath = sc.nextInt();

        // Calculating the Perimeter of the rectangle
        int perimeter = 2 * (length + breath);

        // Displaying Perimeter on the Screen
        System.out.println(" Perimeter of the Rectangle with length " + length + " and breath " + breath + " is: " + perimeter);
    }
}
