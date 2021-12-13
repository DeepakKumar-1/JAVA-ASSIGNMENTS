package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class RemoveDuplicatesFromArray {
    // Remove Duplicate Elements from the Array
    public static void main(String [] args){
        // Creating Scanner Object For Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Declaring Array List
        ArrayList <Integer> list = new ArrayList<>();
        // Take SIZE of the ARRAY LIST
        System.out.print(" Enter SIZE of the ARRAY: ");
        int n = sc.nextInt();
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<n; i++)
            list.add(sc.nextInt());
        // Display the ARRAY List
        System.out.println(list);
        // Procedure to Remove Duplicates from the Array
        for(int i=0; i<list.size(); i++){
            for(int j = i; j< list.size(); j++) {
                if (list.get(i).equals(list.get(j)))
                    list.remove(i);
            }
        }
        // Display the Resultant List
        System.out.println(list);
    }
}
