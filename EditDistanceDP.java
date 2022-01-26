package com.company.DynamicProgramming;

public class EditDistanceDP {

    private static int editDistance(String s, String t){
        int m = s.length();
        int n = t.length();
        int [][]storage = new int[m+1][n+1];
        for(int i=0; i<=n; i++){
            storage[0][i] = i;
        }
        for(int i=0; i<=m; i++){
            storage[i][0] = i;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(m - i) == t.charAt(n - j)){
                    storage[i][j] = storage[i-1][j-1];
                }else{
                    storage[i][j] = 1 + Math.min(storage[i][j-1],
                            Math.min(storage[i-1][j], storage[i-1][j-1]));
                }
            }
        }
        return storage[m][n];
    }

    public static void main(String []args){
        String s = "Deepak";
        String t = "Kumar";
        int res = editDistance(s, t);
        System.out.println(res);
    }
}
