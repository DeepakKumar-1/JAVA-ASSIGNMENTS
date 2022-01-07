package com.company;

import java.util.Scanner;
public class CGPA {
    // Calculate CGPA Java Program
    public static void main(String [] args){
        /*
        GPA --> Marks in that Subject(out of 100) / 10
        CGPA = Total Grade Point Average / n
        n --> Total Number of Subjects
         */

        // Creating Scanner Object for Taking inputs from the User
        Scanner sc = new Scanner(System.in);

        // Taking Number of Subjects From the User
        System.out.print(" Enter Number of Subjects You have: ");
        int n = sc.nextInt();

        // Creating Array for Storing Marks
        float [] marks = new float[n];

        // taking marks in All the Subjects from the User
        for(int i = 0;i< n; i++){
            // Taking marks in Subject ( out of 100 )
            System.out.print(" Enter Marks in "+ (i+1) + " Subject (out of 100): ");
            float m = sc.nextInt();
            // Storing marks of Subjects in Marks Array
            marks[i] = m;
        }

        // Now calculating GPA in each Subject and Summing them
        float sum = 0;
        for(int i= 0; i<n; i++){
            float gpa = marks[i]/10;
            sum += gpa;
        }

        // Now Calculating CGPA
        float cgpa = sum / n;  // Here Sum is the Total GPA (i.e Summation of GPA 's of All the Subjects)

        // Displaying CGPA on the Screen
        System.out.println(" CGPA: " + cgpa);

    }
}
