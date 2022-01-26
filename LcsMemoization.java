package com.company.DynamicProgramming;

public class LcsMemoization {
    private static int lcs(String s, String t, int[][]storage){
        int m = s.length();
        int n = t.length();

        if(storage[m][n] != -1){
            return storage[m][n];
        }

        if(m == 0 || n == 0){
            storage[m][n] = 0;
            return storage[m][n];
        }

        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = 1 + lcs(s.substring(1) , t.substring(1));
        }else{
            int op1 = lcs(s, t.substring(1));
            int op2 = lcs(s.substring(1), t);
            int op3 = lcs(s.substring(1), t.substring(1));
            storage[m][n] = Math.max(Math.max(op1, op2), op3);
        }
        return storage[m][n];
    }

    public static int lcs(String s, String t){
        int m = s.length();
        int n = t.length();
        int [][] storage = new int[m+1][n+1];
        for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                storage[i][j] = -1;
            }
        }
        return lcs(s, t, storage);
    }
    public static void main(String []args){
        String s = "adgei";
        String t = "abegi";
        int res = lcs(s, t);
        System.out.println(res);
    }
}
