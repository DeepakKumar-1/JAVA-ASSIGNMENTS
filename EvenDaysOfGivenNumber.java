package com.company;

import java.util.Locale;
import java.util.Scanner;
public class EvenDaysOfGivenNumber {
    // Kunal is allowed to go out with his friends only on the even days of a given month.
    // Write a program to count the number of days he can go out in the month of August.
    public static void main(String [] args){
        // creating Scanner Object for taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        // taking month from user as a Input
        System.out.print(" Enter Any Month (Ex: January): ");
        String month = sc.next().toLowerCase();
        int numberOfDays = 0;

        switch (month) {
            case "january", "march", "may", "july", "august", "october", "december" -> numberOfDays = 31;
            case "february" -> numberOfDays = 28;
            case "april", "june", "september", "november" -> numberOfDays = 30;
            default -> System.out.print(" Invalid INPUT !!");
        }
        /*
        switch (month){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                numberOfDays = 31;
                break;

            case "february":
                numberOfDays = 28;
                break;

            case "april":
            case "june":
            case "september":
            case "november":
                numberOfDays = 30;
                break;
            default:
                System.out.print(" Invalid INPUT !!");
        }
        */
        int evenCount = 0;
        for(int i =0;i<= numberOfDays; i++){
            if(i%2==0)
                evenCount++;
        }

        System.out.println(" Number of Even Days in Month " + month + " are: " + evenCount);

    }

}
