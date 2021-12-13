package com.company;

import java.util.Scanner;
public class TemperatureConversion {
    // Convert Celsius to Fahrenheit
    public static void main(String [] args){
        /*
        Formula:
            (x°C × 9/5) + 32 = y°F
         */

        // Creating Scanner Object for taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take temperature in Degree Celsius as a Input from the USER
        System.out.print(" Enter Temperature in Degree Celsius: ");
        float cel = sc.nextFloat();

        // Calculations:
        float feh = (cel * 9/5) + 32;
        // Display the Temperature in Degree Fahrenheit
        System.out.println(" Temperature in Degree Fahrenheit is: " + feh + "°F");
    }
}
