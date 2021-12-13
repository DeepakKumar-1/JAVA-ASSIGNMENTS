package com.company;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class InsertElementAtSpecificPositionInAnArray {
    // Insert an Element at Desired or Specific Position in an Array
    public static void main(String [] args){
        // Creating Scanner Object For taking inputs from the User
        Scanner sc = new Scanner(System.in);
        // Creating An ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // Take Numbers of Elements USER Wants to Enter
        System.out.print(" How Many Elements You wants to Enter in the ARRAY: ");
        int n = sc.nextInt();
        // take Elements from the USER and Store in list
        System.out.print(" Enter " + n + " Elements: ");
        for(int i=0; i<n; i++)
            list.add(sc.nextInt());
        // Display the Array
        System.out.println(list);
        // Take Element that USER wants to Insert in the ARRAY
        System.out.print(" Enter Element that You want to Insert in the ARRAY: ");
        int element = sc.nextInt();
        // Take Position where USER wants to Insert element
        System.out.print(" Enter Position where you want to Insert " + element + ": ");
        int position = sc.nextInt();
        // ADD Element in the ARRAY LIST
        list.add(position, element);
        System.out.println(element + " Inserted Successfully ");
        // Display the Resultant Array
        System.out.println(" Resultant Array is: " + list);
    }
}
