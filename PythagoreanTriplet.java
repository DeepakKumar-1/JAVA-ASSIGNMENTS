package com.company;

import java.util.Scanner;
public class PythagoreanTriplet {
    // Write a function to check if a given triplet is a Pythagorean triplet or not.
    // (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // Taking Three Numbers as a Input From the User
        System.out.print(" Enter Any Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(isPythagoreanTriplet(a,b,c))
            System.out.println(a +" " + b +" "+ c + " forms a Pythagorean Triplet. ");
        else
            System.out.println(a +" " + b +" "+ c + " is not a Pythagorean Triplet. ");
    }

    static boolean isPythagoreanTriplet(int a,int b, int c){
        if(((a*a) + (b*b)) == (c*c)){
            return true;
        } else if(((a*a) + (c*c)) == (b*b)){
            return true;
        } else return ((b * b) + (c * c)) == (a * a);
    }
}
