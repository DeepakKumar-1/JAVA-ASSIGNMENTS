package com.company;

import java.util.Scanner;

public class Factorial {
    // Factorial Program In Java
    public static void main(String[] args) {
        /*
        Factorial of any number can be Calculated as
        n! = n(n-1)(n-2)............1!
        Note:
              Factorial of Negative Number Doesn't Exist
              Factorial of Zero is always 1 ( i.e 0! = 1 )
         */

        // Creating Scanner Object for taking input from the User
        Scanner input = new Scanner(System.in);

        // Taking Number as a Input From User
        System.out.print(" Enter Any Number: ");
        int number = input.nextInt();

        // Procedure for Finding Factorial
        // Assign Initial Value of factorial as 1
        int factorial = 1;
        // if Number is 0 then Factorial is 1
        if (number == 0) {
            System.out.println(" Factorial of " + number + " is: " + factorial);
            return;
        } else if (number < 0) {
            // if number is Less than 0 i.e it's a Negative Number
            // then print factorial doesn't Exist
            System.out.println(" Factorial of Negative Number doesn't Exist ");
            return;
        } else {
            // otherwise calculate the factorial of a number
            // It's an Iterative Approach
            // n! =  1 * 2 * 3 * 4 ............ * n
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            // Once Factorial is Calculated then Print the Factorial
            System.out.println(" Factorial of " + number + " is: " + factorial);
        }
    }
}
