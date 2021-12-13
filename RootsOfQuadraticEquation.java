package com.company;

import java.util.Scanner;
public class RootsOfQuadraticEquation {
    // Find All Roots of Quadratic Equation
    public static void main(String [] args){
        // Creating Scanner Object for Taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take All the Coefficients of x's of the Quadratic Equation From the USER
        System.out.println(" Quadratic Equation Roots Calculator ");
        System.out.print(" Enter Coefficients of Quadratic Equation: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Find Discriminant
        int dis = b*b - 4*a*c;
        // if discriminant is ZERO it means ROOTS are REAL and Equal
        int root1 = 0, root2 = 0;
        int flag = 0;
        String imgRoot1 = "", imgRoot2 = "";
        if(dis == 0){
            root1 = -b/2*a;
            root2 = -b/2*a;
        }else if(dis > 0){   // if Discriminant is Greater than ZERO roots are real and Different
            root1 = (-b + (int)(Math.pow(dis, 0.5)))/2*a;
            root2 = (-b - (int)(Math.pow(dis, 0.5)))/2*a;
        }else{   // otherwise Roots are Imaginary
            flag = 1;
            imgRoot1 = ((-b/2*a) +"+" + (-dis/2*a) + "i");
            imgRoot2 = ((-b/2*a)  +"-" + (-dis/2*a) + "i");
        }
        // Display the Roots
        if(flag == 0)
            System.out.println(" Roots are: " + root1 + " " + root2);
        else
            System.out.println(" Roots are: " + imgRoot1 + " " + imgRoot2);
    }
}
