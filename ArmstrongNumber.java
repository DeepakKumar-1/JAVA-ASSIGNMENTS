package com.company;

import java.util.Scanner;
class ArmstrongNumber {
    // Find Number is Armstrong or Not
    public static void main(String [] args){
        /*
        Explanation:
          Armstrong Numbers
             A positive integer of n digits is called an Armstrong number
             of order n (order is number of digits) if.
          abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....

        For Example:
               1       5      3    Number of Digits --> 3
               /       |       \
           1*1*1  +  5*5*5  +  3*3*3   --> 1 + 125 + 27 = 126 + 27 = 153

          Hence, it Involves Following Three Steps
          Step1:  Find The Number of Digits in a Given Positive Number
          Step2:  Find Sum of Each Digits with Power raise to Number of Digits
          Step3:  At Last check the New Number or Given Number Are Equal or Not?
                  if Equal -->  Write Armstrong
                  Else     -->  Write Not Armstrong
         */

        // Creating Scanner Object for Taking Input from the USER
        Scanner sc = new Scanner(System.in);
        // Take Any Number as a Input From the USER
        System.out.print(" Enter Any Positive Number: ");
        int num = sc.nextInt();
       // Store This Number in oldNumber Variable for Later Use
//        int oldNumber = num;
        // Count Number of Digits in the Given Number
        int n = numberOfDigits(num);  // --> COPY of Number is Passed
        // Now Create a New Number
        int newNum = newNumber(num,n);
        //check is the given number and new number are Same or Not ?
        // if YES then print number is Armstrong
        if(num == newNum)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is Not an Armstrong Number");

    }
    static int numberOfDigits(int number){
        int countDigits = 0;
        while(number > 0){
            countDigits++;
            number /= 10;
        }
        // Return the total Count of Digits in the Given Number
        return countDigits;
    }
    static int newNumber(int number, int n){
        int newNumber = 0;
        while( number > 0 ){
            int remainder = number % 10;
            newNumber += (int)(Math.pow(remainder, n));
            number /= 10;
        }
        return newNumber;
    }
}
