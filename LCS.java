package com.company.DynamicProgramming;

public class LCS {
    private static int lcs(String s, String t){
        if(s.isEmpty() || t.isEmpty()){
            return 0;
        }

        if(s.charAt(0) == t.charAt(0)){
            return 1 + lcs(s.substring(1) , t.substring(1));
        }else{
            int op1 = lcs(s, t.substring(1));
            int op2 = lcs(s.substring(1), t);
            int op3 = lcs(s.substring(1), t.substring(1));
            return Math.max(Math.max(op1, op2), op3);
        }

    }
    public static void main(String []args){
        String s = "adgei";
        String t = "abegi";
        int res = lcs(s, t);
        System.out.println(res);
    }
}
