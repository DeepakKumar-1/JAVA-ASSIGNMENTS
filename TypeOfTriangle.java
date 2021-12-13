package com.company;

import java.util.Scanner;
public class TypeOfTriangle {
    // Check whether the Triangle is an Equilateral, Isosceles or Scalene Triangle
    public static void main(String [] args){
        /*
        EXPLANATION:
        Equilateral Triangle --> is a Triangle that has all Equal Sides i.e a == b == c
        Scalene Triangle --> is a Triangle that has no Equal Sides  i.e a != b != c
        Isosceles Triangle --> is a Triangle that has two Equal Sides i.e a == b != c
         */
        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Taking Sides of the Triangle as a Input from the USER
        System.out.print(" Enter values of Sides of Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Applying Conditions
        // if All sides are Equal --> Equilateral Triangle
        if( a == b && b == c)
            System.out.println(" It's an Equilateral Triangle ");
        // if All Sides are Not Equal --> Scalene Triangle
        if( a != b && b != c)
            System.out.println(" It's a Scalene Triangle ");
        // if Two Sides are Equal --> Isosceles Triangle
        if( a == b && b != c || b == c && c != a)
            System.out.println(" It's an Isosceles Triangle ");
    }
}
