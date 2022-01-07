package com.company;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumberInBetween {
    public static void main(String[] args) {
        // Creating Scanner Object for Taking Inputs From the User
        Scanner sc = new Scanner(System.in);

        // Taking Starting Range From the User
        System.out.print(" Enter Starting Number For the Range: ");
        int start = sc.nextInt();

        // Taking End Range From the User
        System.out.print(" Enter End Number For the Range: ");
        int end = sc.nextInt();

        // This Variable is used to check that if any Armstrong number Exits in between start and End or Not
        boolean isAnyArmstrongNumber = false;

        for (int i = start; i < end; i++) {
            int number = i + 1;
            // Algorithm / Pseudo Code:
            // To Check that the number is an Armstrong Number
            // First we have to Calculate the number of Digits of a number
            // Then Initialize a variable newNumber = 0
            // then Apply this Formula  newNumber = newNumber + (int)(Math.pow(remainder, count))
            // Then check if oldNumber and NewNumber are Equal then we can say that the number is an Armstrong Number

            // Now Assigning Number to CalculateCount Variable to Find the Count of digits:
            int calculateCount = number;
            int count = 0;                 //  Initially count is 0
            while (calculateCount > 0) {
                count++;                  // Incrementing count Variable
                calculateCount = calculateCount / 10;
            }
            // Till Now Total Count of Digits in a Number is Calculated

            // Now Assigning the Value of number to calculateNewNumber Variable
            int calculateNewNumber = number;
            int newNumber = 0;           // Initializing New Number to 0
            while (calculateNewNumber > 0) {
                int remainder = calculateNewNumber % 10;

                newNumber = newNumber + (int) (Math.pow(remainder, count));      // Math.pow will return Double So Type Cast to Int

                calculateNewNumber = calculateNewNumber / 10;
            }

            // Now Checking is the oldNumber and NewNumber are Same if they are Same it means Given Number is Armstrong
            if (number == newNumber) {
                isAnyArmstrongNumber = true;
                System.out.println(number + " is a Armstrong Number ");
            }
        }

        // When All the Numbers in between start and End Are checked and No Armstrong Number Found then
        // we can say that their is no Armstrong in between start and end
        if (!isAnyArmstrongNumber) {
            System.out.println(" No Armstrong Exist in Between " + start + " and " + end);
        }
    }
}
