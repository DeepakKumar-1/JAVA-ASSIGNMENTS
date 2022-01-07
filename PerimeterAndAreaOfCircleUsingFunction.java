package com.company;

import java.util.Scanner;
public class PerimeterAndAreaOfCircleUsingFunction {
    // Write a program to print the circumference and area of a circle
    // of radius entered by user by defining your own method.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Radius of the Circle ");
        int radius = sc.nextInt();

        System.out.println(" Perimeter of the Circle with Radius " + radius + " is: " + perimeter(radius));
        System.out.println(" Area of the Circle with Radius " + radius + " is: " + area(radius));
    }

    static float perimeter(int radius){
        return (float)(2*Math.PI*radius) ;
    }

    static float area(int radius){
        return (float)(Math.PI * radius * radius);
    }
}
