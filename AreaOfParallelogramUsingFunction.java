package com.company;

import java.util.Scanner;
public class AreaOfParallelogramUsingFunction {
    // Area Of Parallelogram
    public static void main(String [] args){
        /*
        Area of Parallelogram:
           Area = b * h
           b --> Base parallelogram
           h --> Height of the parallelogram
         */

        // Creating Scanner Object For Taking Input From The user
        Scanner sc = new Scanner(System.in);

        // Taking Base and Height of the Parallelogram as a input from the User
        System.out.print(" Enter Base Value of the Parallelogram: ");
        int base = sc.nextInt();

        System.out.print(" Enter Value of Height of the Parallelogram: ");
        int height = sc.nextInt();

        System.out.println(" Area of the Parallelogram is: " + area(base, height));
    }

    // Function That Calculates the area of the Parallelogram
    // and Will return the Area
    static int area(int base , int height){
        return base * height;
    }
}
