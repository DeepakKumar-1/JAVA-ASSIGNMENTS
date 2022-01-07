package com.company;

import java.util.Scanner;
public class CheckLeapYear {
    // Check Leap Year Or Not
    public static void main(String [] args){
        /*
        Conditions for a Year to be Leap Year
        if Divisible by 4
           /          \
         No           YES
                (Divisible by 100)
                    /      \
                  No       YES
                      (Divisible by 400)
                        /       \
                      NO       YES LEAP YEAR

           Why year % 4 == 0 not Always a leap Year ??
           Exceptions:
             In the Gregorian calendar, a century year (a year ending with 00) is not a leap year,
             even though it is a multiple of 4. Thus, the year 2100 will not be a leap year.
             To ensure that, some century years remain leap years.
             In the Gregorian calendar, leap years include those century years which are exactly divisible by 400.
             Thus, 2000 remained a leap year even though it ended with 00.
         */

        // Creating Scanner Object for taking Input From the User
        Scanner sc = new Scanner(System.in);

        // taking Year as a Input From the User
        System.out.print(" Enter any Year: ");
        int year = sc.nextInt();

        // Applying Conditions for a Number to be a Leap Year
        boolean isLeapYear = false;
        if(year% 4 == 0){
            if(year % 100 == 0){
                if(year % 100 == 0){
                    isLeapYear = true;
                }
            }
        }

        if(isLeapYear)
            System.out.println(year + " is a Leap year ");
        else
            System.out.println(year + " is not a Leap Year ");
    }
}
