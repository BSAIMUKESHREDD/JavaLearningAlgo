package com.saimukesh.datastructers.ds.Stacks;
import java.util.*;


public class REverseStringUsingStack

{
        public static String reverse(String S){
            //code here
            Stack<Character>stk = new Stack<>();
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i <S.length();i++){
                stk.push(S.charAt(i));

            }

            while(stk.isEmpty()==false){
                sb.append(stk.pop());}

            return sb.toString();

        }

    public static void main(String[] args) {
        String a = "SAIMUKESH";
        reverse(a);
    }
}



