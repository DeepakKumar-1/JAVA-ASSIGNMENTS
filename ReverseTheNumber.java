package com.company;

import java.util.Scanner;
public class ReverseTheNumber {
    // Reverse a Given Number
    public static void main(String [] args){
        /*
        EXPLANATION:
           Let Given Number --> 12345
               Reverse is   --> 54321
           Procedure:
               --> Take the Remainder of the Number Till Number doesn't become 0
               --> Example :
        PrevNumber     Number(MOD)10      Remainder
          12345        12345 % 10   -->     5
          1234         1234  % 10   -->     4
          123          123   % 10   -->     3
          12           12    % 10   -->     2
          1            1     % 10   -->     1
          0   -->   At This Point STOP the LOOP

           From remainders we can get the Reverse of the Number as
           (5*10000) + (4*1000) + (3*100) + (2*10) + (1*1) = 54321
        OR
         ( 0 * 10)    + 5  --> 5
         ( 5 * 10)    + 4  --> 54
         ( 54 * 10)   + 3  --> 543
         ( 543 * 10)  + 2  --> 5432
         ( 5432 * 10) + 1  --> 54321   --> Resultant Number (Required Reverse Number)
         So, In Generalized way we can Write it as

         revNumber = (revNumber * 10) + remainder      Initially, revNumber = 0
         */

        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Number as a Input From the USER
        System.out.print(" Enter Any Number: ");
        int num = sc.nextInt();
        int oldNumber = num;    // Store Number For Later USE
        // Let Initially Reverse of the Number is 0
        int revNum = 0;
        while(num > 0){
            int remainder = num % 10;
            revNum = (revNum * 10) + remainder;
            num /= 10;     // Equivalent to num = num / 10
        }

        // Display the Reverse of the Number
        System.out.println(" Reverse of " + oldNumber + " is: " + revNum);
    }
}
