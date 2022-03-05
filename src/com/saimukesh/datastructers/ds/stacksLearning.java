package com.saimukesh.datastructers.ds;

public class stacksLearning {
    // Stack<Integer> st = new Stack<>();
    public static boolean balancedBrackets(String str) {
        // Write your code here.
int sum=0;
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i++) {
               String a = str.valueOf(i);
                if(a.equals("(" )) {sum++;}
                else  {sum--;}

                if(sum<0){return false;}
            }
            if(sum==0){return true;}

        }
        else{
            return false;
        }
        return false;
    }


    public static void main(String[] args) {
       String st="()";
        System.out.println(balancedBrackets(st));
    }

}


