package com.company;

import java.util.*;
public class SortAFloatArray {
    // Sort A Float Array In Ascending and Descending Order
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        //Create ArrayList
        List <Float> list = new ArrayList<>();
        // Take the Size of Array From the USER
        System.out.print(" Enter SIZE of Array:");
        int n = sc.nextInt();
        // Take n inputs from User and Store them into List
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<n; i++){
            float elements = sc.nextFloat();
            list.add(elements);
        }
        System.out.println(" Array Before Sorting : " + list);
        // Now Sort the List
        Collections.sort(list);
        // Return the Sorted List
        System.out.println(" Array After Sorting : " + list);
    }
}
