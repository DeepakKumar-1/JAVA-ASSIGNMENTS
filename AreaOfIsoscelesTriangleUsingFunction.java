package com.company;

import java.util.Scanner;
public class AreaOfIsoscelesTriangleUsingFunction {
    // Area Of Isosceles Triangle
    public static void main(String [] args){
        /*
            Area Of Isosceles Triangle
              Area = 1/2 * b * √a^2 - b^2/4
         */

        // Creating Scanner Object for taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Required Inputs from the User
        System.out.print(" Enter value of the same Side of triangle: ");
        int a = sc.nextInt();

        System.out.print(" Enter value of the Base of the Triangle: ");
        int base = sc.nextInt();

        // Calculating height fot the Isosceles Triangle
        float height =  (float)(Math.sqrt(a*a - (float)(base*base)/4));

        // Displaying Area of Isosceles Triangle on the Screen
        System.out.println(" Area of the Isosceles Triangle is: " + area(base, height));
    }

    static float area(int base, float height){
        return (base * height)/2;
    }
}
