package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class DeleteElementFromArray {
    // Delete Element in Array From Desired or Specific Position
    public static void main(String [] args){
        // Creating Scanner Object for taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Creating an Array List
        ArrayList <Integer> list = new ArrayList<>();
        // Take the SIZE of the Array From the USER
        System.out.print(" Enter SIZE of the Array: ");
        int n = sc.nextInt();
        // take n Elements from the USER and Store in LIST
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<n; i++)
            list.add(sc.nextInt());
        // Display the Array
        System.out.println(list);
        // Take The Index/Position from where USER wants to Delete the Element
        System.out.print(" Enter Position From where you want to Delete the Element: ");
        int position = sc.nextInt();
        list.remove(position);
        // Display the Resultant Array
        System.out.println(" Array after Removing " + " Element from " + position + "th Index: " + list);
    }
}
