package com.saimukesh.datastructers.ds.Stacks;

import java.util.Stack;

public class BalnceParanthesis {

    public static void main(String[] args) {

        String g = "(((()))";
        System.out.println(g);
       System.out.println(ispar(g));
    }


    static boolean ispar(String x)
    {
        Character b = '{';
        Character c = '[';
        Character d = '(';
        Character e = ')';
        Character f = '}';
        Character h = ']';
        // add your code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
           Character a =  x.charAt(i);

           if(a == b || a==c || a==d ){
              System.out.println(stack.push(a));
           }
            if((a==e&& stack.peek()==e) /* || (a==f  && stack.peek()==f) || (a==h &&  stack.peek()==h) */){
              System.out.println("aaaa");
              stack.pop();
            }

        }

        System.out.println(stack.size());
        return (stack.size() == 0);


    }
}
