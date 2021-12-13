package com.company;

import java.util.Scanner;
public class LCMofTwoNumbers {
    // LCM of TWO Numbers
    public static void main(String [] args){
        /*
        Procedure for Finding LCM of given Number
        lcm = max (2,4)
        lcm --> 4
        is 4 % 2 == 0 ?   TRUE
           4 % 4 == 0 ?   TRUE
        lcm = 4
         */

        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // taking any Two Numbers from the USER
        System.out.print(" Enter Any Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm = Math.max(num1, num2);
        while ((lcm % num1 != 0) || (lcm % num2 != 0)) {
            ++lcm;
        }
        /*
                while(true){
            if((lcm%num1 == 0) && (lcm%num2 == 0))
                break;
            ++ lcm;
        }
         */
        System.out.println(" LCM of " + num1 + " and " + num2 + " is: " + lcm);

    }
}
