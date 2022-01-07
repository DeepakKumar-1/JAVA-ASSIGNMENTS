package com.company;

import java.util.Scanner;
public class LCM {
    // LCM Of Two Numbers Program
    public static void main(String[] args) {
        /*
        LCM Of Two Numbers Program
        Any greater Number that is Divided by both the Numbers will be the LCM
         */

        // Creating Scanner Object For taking inputs from the user
        Scanner sc = new Scanner(System.in);

        // taking Two Numbers as a Input From the User
        System.out.print(" Enter Any Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = (a>b)? a:b;
        while(true){
            if(lcm%a == 0 && lcm%b == 0){
                System.out.print(" LCM of " + a + " " + b + " is: " + lcm);
                break;
            }
            ++lcm;
        }
    }
}
