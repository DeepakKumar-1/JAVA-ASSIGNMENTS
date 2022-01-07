package com.company;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        /*
        Triangle with all Equal sides is Called Equilateral Triangle
        Area Of Equilateral Triangle can be Calculated as :
        Area =  (√3 * s * s)/4.
        s --> Side of the Equilateral Triangle
         */

        // Creating Scanner Object for Taking input from the User
        Scanner sc = new Scanner(System.in);

        // Taking the Value of Side of Equilateral Triangle from the user
        System.out.print(" Enter the Value of Side of Equilateral Triangle: ");
        int side = sc.nextInt();

        // Calculating the Area of Equilateral Triangle
        float area = (float) ((Math.sqrt(3) * side * side) / 4);

        // Displaying the Area on the Screen
        System.out.println(" Area of Equilateral Triangle with Side " + side + " is: " + area);
    }
}
