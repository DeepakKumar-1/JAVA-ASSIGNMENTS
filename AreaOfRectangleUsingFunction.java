package com.company;

import java.util.Scanner;
public class AreaOfRectangleUsingFunction {
    // Area Of Rectangle Program
    public static void main(String [] args){
        /*
        Area Of Rectangle
             Area = l * b
             l --> length
             b --> breadth
         */

        // Creating Scanner object for taking input from the User
        Scanner sc = new Scanner(System.in);

        // Taking length and breath of Rectangle as a Input From the User
        System.out.print(" Enter value of Length of the Rectangle: ");
        int length = sc.nextInt();

        System.out.print(" Enter value of breath of the Rectangle: ");
        int breath = sc.nextInt();

        // Displaying Area of the Rectangle
        System.out.println(" Area of the Rectangle with length "+ length +" and height " + breath+ " is: " + area(length,breath));
    }
    static int area(int l, int b){
        return l*b;
    }
}
