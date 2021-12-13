package com.company;

import java.util.Scanner;
public class FindGradeFromMarksUsingSwitch {
    // Find a Grade From Marks Using Switch
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Marks of the User As a Input
        System.out.print(" Enter Your Marks(0 - 100): ");
        int marks = sc.nextInt();
        switch (marks / 10) {
            case 10 -> System.out.println(" O+ ");
            case 9 -> System.out.println(" A+ ");
            case 8 -> System.out.println(" A ");
            case 7 -> System.out.println(" B+ ");
            case 6 -> System.out.println(" C ");
            case 5 -> System.out.println(" D ");
            case 4 -> System.out.print(" E ");
            case 3 -> System.out.println(" F ");
        }
    }
}
