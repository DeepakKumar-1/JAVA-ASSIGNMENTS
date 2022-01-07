package com.company;

import java.util.Scanner;
public class DiscountOfProduct {
    // Calculate Discount Of Product
    public static void main(String [] args){
           /*
            Get price and quantity of a product, calculate bill amount
            and calculate 10% discount for the bill amount 5000 and above.
         */

        // Creating Scanner Object for taking input from the user
        Scanner sc = new Scanner(System.in);

        int quantity;  // variable for taking quantity from the user
        float price;     // variable for taking price from the user

        // taking quantity and price as input from the user
        System.out.print(" Enter quantity and Price: ");
        quantity = sc.nextInt();
        price    = sc.nextFloat();

        // Now Calculating Total amount
        float amount = quantity * price;

        float discount ;
        // if Amount > 5000 then add discount of 10%
        if(amount > 5000) {
            discount = amount * 0.1f;
            amount = amount - discount;
        }

        // Now Displaying the Final Amount on the Screen
        System.out.println(" Amount to Pay: " + amount);

    }
}
