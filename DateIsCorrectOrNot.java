package com.company;

import java.util.Scanner;
public class DateIsCorrectOrNot {
    // The Date is Correct or Not
    public static void main(String [] args){
        /*

         */
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take date, month, year from the USER
        System.out.print(" Enter Date: ");
        int date = sc.nextInt();
        System.out.print(" Enter Month (Ex. 08): ");
        int month = sc.nextInt();
        System.out.print(" Enter Year: ");
        int year = sc.nextInt();

        boolean isValidDate = false;
        boolean isValidMonth = false;
        boolean isValidYear = year >= 1900 && year <= 9999;
            if(month >= 1 && month <= 12){
                isValidMonth = true;
            }
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (date >= 1 && date <= 31)
                        isValidDate = true;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (date >= 1 && date <= 30)
                        isValidDate = true;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        if (date >= 1 && date <= 29)
                            isValidDate = true;
                    } else {
                        if (date >= 1 && date <= 28)
                            isValidDate = true;
                    }
                    break;
            }

            if(isValidDate && isValidMonth && isValidYear){
                System.out.println(date + "/" + month + "/" + year + "  is a Valid Date");
            } else
                System.out.println(date + "/" + month + "/" + year + "  is not a Valid Date");

    }

    static boolean isLeapYear(int year) {
        if( year % 4 == 0){
            if(year % 100 == 0){
                return year % 400 == 0;
            }
        }
        return false;
    }
}
