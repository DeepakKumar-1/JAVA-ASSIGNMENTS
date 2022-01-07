package com.company;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    // Perimeter Of Parallelogram
    public static void main(String[] args) {
        /*
        Perimeter Of Parallelogram can be Calculated as:
        Perimeter = 2( length + breath )
         */

        // Creating Scanner object for taking input from the User
        Scanner sc = new Scanner(System.in);

        // Taking length and breath of the Parallelogram from the User
        System.out.print(" Enter the value of length of the Parallelogram: ");
        int length = sc.nextInt();

        System.out.print(" Enter the value of breath of the Parallelogram: ");
        int breath = sc.nextInt();

        // Calculating the Perimeter of the Parallelogram
        int perimeter = 2 * (length + breath);

        // Displaying Perimeter on the Screen
        System.out.println(" Perimeter of the Parallelogram with length " + length + " and breath " + breath + " is: " + perimeter);

    }
}
