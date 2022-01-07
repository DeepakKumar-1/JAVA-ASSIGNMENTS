package com.company;

import java.util.Scanner;
public class AreaOfEquilateralTriangleUsingFunction {
    // Area Of Equilateral Triangle
    public static void main(String [] args){
        /*
        Area of Equilateral Triangle
            area = (√3 * side^2)/4
         */

        // Creating Scanner Object For Taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Values of Diagonals as a Input from the User
        System.out.print(" Enter Value of side of Equilateral Triangle: ");
        int side = sc.nextInt();

        System.out.println(" Area of Equilateral Triangle with Side " + side + " is: "+ area(side));
    }

    static float area(int side){
        return (float)(Math.sqrt(3)* (side * side))/4;
    }
}
