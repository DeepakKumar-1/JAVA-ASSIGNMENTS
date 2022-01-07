package com.company;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Creating Scanner Object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking Fibonacci nth Term as a input From the User
        System.out.print(" Enter any Number: ");
        int num = sc.nextInt();

        // Procedure of Generating Fibonacci Series
        int term1 = 0;
        int term2 = 1;
        if(num == 1)
            System.out.print(term1+ " ");
       else{
           if(num>=2){
               System.out.print(term1 + " "+ term2);
               for(int i = 3;i<=num; i++){
                   int c = term1 + term2;
                   System.out.print((" "+ c));
                   term1 = term2;
                   term2 = c;

               }
           }
        }
    }
}
