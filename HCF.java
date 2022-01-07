package com.company;

import java.util.Scanner;
public class HCF {
    // HCF of a Number Program in Java
    public static void main(String [] args){
        /*
         LCM of two Numbers
         Any Lowest number that divides both the Numbers
         */

        // Creating Scanner Object For taking Inputs from the User
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = Math.min(a,b);
        while(true){
            if(a % hcf == 0 && b % hcf == 0){
                System.out.println(" HCF is: " + hcf);
                break;
            }
            --hcf;
        }
    }
}
