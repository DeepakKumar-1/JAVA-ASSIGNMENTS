package com.company;

import java.util.Scanner;
public class AverageMarks {
    // Calculate Average Marks
    public static void main(String [] args){
        /*
        Average Marks = Sum of Marks in all Subjects / number of Subjects
         */

        // Creating Scanner Object for taking input from the User
        Scanner sc = new Scanner(System.in);

        // taking Number of Subjects as a Input from the User
        System.out.print(" Enter Number of Subjects You Have: ");
        int n = sc.nextInt();

        // Now taking Marks of All the Subjects and Summing them
        int sum = 0;
        for(int i = 0;i < n; i++){
            System.out.print(" Enter Marks in " + (i+1) + " Subject: ");
            float marks = sc.nextFloat();
            sum += marks;
        }

        // At this point we have the sum of Marks of All the Subjects
        // calculating Average Marks
        float average = (float)(sum)/n;

        // Displaying Average of Marks on the Screen
        System.out.println(" Average Marks is: " + average);
    }
}
