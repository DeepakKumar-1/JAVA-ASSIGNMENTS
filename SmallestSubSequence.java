package com.company.DynamicProgramming;

public class SmallestSubSequence {

    private static int smallestSubSequence(String s, String t){
        // Base Case :
        if(s.isEmpty()){
            return t.length();
        }
        if(t.isEmpty()){
            return s.length();
        }

        if(s.charAt(0) == t.charAt(0)){
            return 1 + smallestSubSequence(s.substring(1), t.substring(1));
        } else{
            int opt1 = smallestSubSequence(s.substring(1), t);
            int opt2 = smallestSubSequence(s, t.substring(1));
            return 1 + Math.min(opt1, opt2);
        }
    }

    public static void main(String []args){
        String s = "abc";
        String t = "bac";
        int res = smallestSubSequence(s, t);
        System.out.println(res);
    }
}
