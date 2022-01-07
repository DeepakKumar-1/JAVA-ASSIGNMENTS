package com.company;

import java.util.Scanner;

public class RecursiveFactorial {

    public static int recFactorial(int number){
        // base Condition
        if(number == 0)
            // if Number is 0 then return 1
            return 1;
        else
            // otherwise return number * factorial of number -1 (recursive Call)
           //  As Number ! = Number * (Number-1) * (Number-1) ........... 0!
            return number * recFactorial(number -1);
    }

    // Recursive Factorial in Java
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

        // if Number is >= 0 then Find the factorial of that Number
        if(number >= 0) {
            // Calling Function recFactorial(number)
            // This Function will return the Factorial of that Number
            // Then Store that Factorial result in factorial variable
            int factorial = recFactorial(number);

            // Once we the factorial of a number then Print that Number on the Screen
            System.out.println(" Factorial of " + number + " is: " + factorial);
        } else{
            // if number is not Positive then print Factorial Doesn't Exist
            System.out.println(" Factorial of Negative Number Doesn't Exist ");
        }
    }
}
