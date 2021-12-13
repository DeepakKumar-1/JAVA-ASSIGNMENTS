package com.company;

import java.util.Scanner;
public class TriangleValidityUsingSIdes {
    // Input SIDES of a Triangle and Check whether the Triangle is Valid or Not
    public static void main(String [] args){
        /*
        EXPLANATION:
          Triangle with Three GIVEN Sides is Said to be Valid if
               Sum of two Sides is Equals greater than the Third Side
               i.e a+b > c
         */
        // Creating Scanner Object for Taking Inputs from the User
        Scanner sc = new Scanner(System.in);
        // Take Value of All the Sides of the Triangle
        System.out.print(" Enter Value of SIDES of the Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Check if Sum of Any Two Sides is greater than 3rd one or nor
        // if Yes then Triangle is Valid
        boolean isValidTriangle = a + b > c || b + c > a || c + a > b;

        if(isValidTriangle)
            System.out.println(" Triangle with Sides " + a + ", " + b + " and " + c + " is a Valid Triangle");
        else
            System.out.println(" Triangle with Sides " + a + ", " + b + " and " + c + " is NOT a Valid Triangle");
    }
}
