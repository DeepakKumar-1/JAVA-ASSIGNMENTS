package com.company;

import java.util.*;

public class AnagramString {
    // Anagram String
    public static void main(String [] args){
        /*
        Two Strings are said to be anagram if all the characters of First String are also there in Second String
        Example:
            S1 --> "abcd"
            S2 --> "cdba"     S1 and S2 are Anagram
         */

        // Creating Scanner Object for Taking Inputs from the USER
        Scanner sc = new Scanner(System.in);
        // taking Two Strings from the USER
        System.out.print(" Enter Two Strings: ");
        String s1 = sc.next();
        String s2 = sc.next();
        if(isAnagram(s1, s2))
            System.out.println(s1 + " and " + s2 + " are ANAGRAM ");
        else
            System.out.println(s1 + " and " + s2 + " are not ANAGRAM ");
    }

    static boolean isAnagram(String s, String t){
        // Create Two Lists
        List <Character> list1 = new ArrayList<>();
        List <Character> list2 = new ArrayList<>();
        // ADD all the characters of String s in the list1
        for(int i=0; i<s.length(); i++){
            list1.add(s.charAt(i));
        }
        // ADD all the Characters of String t in the list2
        for(int j=0; j<t.length(); j++){
            list2.add(t.charAt(j));
        }
        // Now SORT both the Lists
        Collections.sort(list1);
        Collections.sort(list2);

        // Now Return true or False by checking is the lists are Equal or Not
        return list1.equals(list2);
    }
}