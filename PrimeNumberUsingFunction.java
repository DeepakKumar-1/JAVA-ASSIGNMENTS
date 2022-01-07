package com.company;

import java.util.Scanner;
public class PrimeNumberUsingFunction {
    // Define a method to find out if a number is prime or not.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // Taking Number as a Input From the User
        System.out.print(" Enter Any Number: ");
        int number = sc.nextInt();

        System.out.println(number + " is:" + isPrime(number));
    }

    static String isPrime(int number){
        if(number <= 0)
            return " not Prime ";
        if(number == 1)
            return " Neither Prime nor Composite ";
        for(int i=2; i*i < number ;i++){
            if(number%i==0)
                return " not Prime ";
        }
        return  " Prime ";
    }
}
