package com.company.DynamicProgramming;

public class EditDistance {

    private static int editDistance(String s, String t){
        // Base Case:
            if(s.isEmpty()){
                return t.length();
            }
            if(t.isEmpty()){
                return s.length();
            }

            if(s.charAt(0) == t.charAt(0)){
                return editDistance(s.substring(1), t.substring(1));
            }else{
                int insert = editDistance(s, t.substring(1));
                int delete = editDistance(s.substring(1), t);
                int substitute = editDistance(s.substring(1), t.substring(1));
                return 1 + Math.min(insert, Math.min(delete,substitute));
            }
    }

    public static void main(String []args){
        String s = "Deepak";
        String t = "Kumar";
        int res = editDistance(s, t);
        System.out.println(res);
    }
}
