package com.company;

/*
Pending
 */

public class Test {
    public static void main(String [] args){
        String s = "III";
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char value = s.charAt(i);
            System.out.println(value);
            switch(value){
                case 'I':
                    sum+=1;
                    break;
                case 'V':
                    sum+=5;
                    break;
                case 'X':
                    sum+=10;
                    break;
                case 'L':
                    sum+=50;
                    break;
                case 'C':
                    sum+=100;
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+=1000;
                    break;
            }
            System.out.println(" Sum: "+sum);

        }
    }
}
