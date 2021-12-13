package com.company;

import java.util.Scanner;
public class TemperatureConversionUsingSwitchCase {
    //Temperature Conversion Celsius to Fahrenheit and Vice versa
    public static void main(String [] args){
        /*
        Explanation:
          Formulas:
          Degree Celsius to Fahrenheit
               (x°C × 9/5) + 32 = y°F
          Degree Fahrenheit to Celsius
               (y°F - 32) x 5/9 = x°C
         */
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take whether USER wants to Find Celsius to Fahrenheit
        System.out.println(" Welcome to Temperature Conversion Calculator ");
        System.out.println("1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius ");
        System.out.print(" Enter Your Choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1 -> {
                // Celsius to Fahrenheit
                // Take Temperature in Degree Celsius from the USER
                System.out.print(" Enter Temperature in Degree Celsius: ");
                float cel = sc.nextFloat();
                // Calculate Temperature in Fahrenheit
                float fah = (cel * 9/5) + 32;
                // Display the Temperature in Degree Fahrenheit
                System.out.println(" Temperate " + cel + "°C in "+ " Fahrenheit is: " + fah + "°F");
            }
            case 2 -> {
                // Degree Fahrenheit to Celsius
                // Take Temperature in Degree Fahrenheit from the USER
                System.out.print(" Enter Temperature in Degree Fahrenheit: ");
                float fah = sc.nextFloat();
                // Calculate Temperature in Celsius
                float cel = (fah - 32) * 5/9;
                // Display the Temperature in Degree Fahrenheit
                System.out.println(" Temperate " + fah + "°F in "+ " Celsius is: " + cel + "°C");
            }
            default -> { System.out.println(" Wrong Input !!"); }
        }
    }
}
