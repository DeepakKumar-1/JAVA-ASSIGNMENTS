package com.company.DynamicProgramming;

public class EditDistanceMemoization {

    private static int editDistance(String s, String t, int [][]storage){
        int m = s.length();
        int n = t.length();
        if(storage[m][n] != -1){
            return storage[m][n];
        }
        // Base Case:
        if(s.isEmpty()){
            storage[m][n] = n;
            return storage[m][n];
        }
        if(t.isEmpty()){
            storage[m][n] = m;
            return storage[m][n];
        }

        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = editDistance(s.substring(1), t.substring(1), storage);
        }else{
            int insert = editDistance(s, t.substring(1), storage);
            int delete = editDistance(s.substring(1), t, storage);
            int substitute = editDistance(s.substring(1), t.substring(1), storage);
            storage[m][n] = 1 + Math.min(insert, Math.min(delete,substitute));
        }
        return storage[m][n];
    }

    private static int editDistance(String s, String t){
        int m = s.length();
        int n = t.length();
        int [][]storage = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                storage[i][j] = -1;
            }
        }
        return editDistance(s, t, storage);
    }

    public static void main(String []args){
        String s = "Deepak";
        String t = "Kumar";
        int res = editDistance(s, t);
        System.out.println(res);
    }
}
