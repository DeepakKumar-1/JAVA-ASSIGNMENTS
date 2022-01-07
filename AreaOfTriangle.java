package com.company;

import java.util.Scanner;
public class AreaOfTriangle {
    // Area Of Triangle
    public static void main(String [] args){

        /*
           Area of A Triangle in Different cases
           Case 1: Equilateral Triangle
                   Area = (side)*(side)* √3 / 4
           Case 2: Height and Base are Given
                   Area = 1/2 * h * b
                   h ----> Height
                   b ----> Base
           Case 3: Two Sides and Angle is Given
                   Area = 1/2 * a * b * sinC
                   a ----> Side1
                   b ----> Side2
                   C ----> Angle Between them
           Case 4: All Three Sides are Given
                   Area = √s(s-a)(s-b)(s-c)   ............... Heron's Formula
                   s ---> Semi-Perimeter of Triangle i.e   s = (a+b+c)/2
                   a ---> side1
                   b ---> side2
                   c ---> side3
         */

          // Creating Scanner Object for taking input From user
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Base length of the Triangle: ");
        int base = sc.nextInt();

        System.out.print(" Enter Height of the Triangle: ");
        int height = sc.nextInt();

        // Calculating Area
        float area = (float) (base * height)/2 ;

        // Displaying Area of the Triangle
        System.out.println(" Area of the Triangle is: " + area);

    }
}
