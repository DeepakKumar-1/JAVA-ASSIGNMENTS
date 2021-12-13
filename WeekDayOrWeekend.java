package com.company;

import java.util.Scanner;
public class WeekDayOrWeekend {
    // Input a week and print WeekDay or Weekend
    public static void main(String [] args){
        /*
        Explanation:
        Weekdays --> Monday to Friday
        Weekends --> Saturday and Sunday
         */
        // Creating Scanner Object for taking input from the User
        Scanner sc = new Scanner(System.in);
        // Taking Week as a Input from the USER
        System.out.print(" Enter any Week: ");
        int week = sc.nextInt();
        switch (week){
            case 1, 2, 3, 4, 5 -> System.out.println(" Weekday");
            case 6, 7 -> System.out.println(" Weekend");
            default -> System.out.println(" Wrong INPUT !!");
        }
    }
}
