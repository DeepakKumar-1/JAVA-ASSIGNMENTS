package com.company;

import java.util.Scanner;
public class AreaOfIsoscelesTriangle {
    // Area Of Isosceles Triangle
    public static void main(String [] args){
        /*
        Area of an Isosceles Triangle can be Calculated as :
        let a --> First Side
            a --> Second Side       // Because in Isosceles Triangle Two sides are Equal
            b --> Third Side
         Area of isosceles triangle using only sides = ½[√(a2 − b2 /4) × b]
         */

        // Creating Scanner Object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        System.out.println(" This Program will Calculate the Area of the Isosceles Triangle ");

        // Taking Values of All the Sides of the Triangle From user
        System.out.print(" Enter Value of First Side of the Triangle: ");
        int side1 = sc.nextInt();

        System.out.print(" Enter Value of Second Side of the Triangle: ");
        int side2 = sc.nextInt();

        System.out.print(" Enter Value of Third Side of the Triangle: ");
        int side3 = sc.nextInt();

        int a = 0;
        int b = 0;

        if(side1 == side2) {
            a = side1;
            b = side3;
        } else if(side2 == side3) {
            a = side2;
            b = side1;
        } else if (side1 == side3) {
            a = side1;
            b = side2;
        }

        // Calculating Area of the Triangle with Two Equal Sides
        float height =  (float)(Math.sqrt(a*a - (float)(b*b) / 4) );
        float area = (height * b )/2;

        // Displaying Area on the Screen
        System.out.println(" Area of the Triangle is: " + area);

    }
}
