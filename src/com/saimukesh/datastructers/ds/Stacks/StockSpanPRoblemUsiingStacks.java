package com.saimukesh.datastructers.ds.Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StockSpanPRoblemUsiingStacks {
    public static String calculateSpan(int price[], int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
int s = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < price.length; i++) {
           stack.push(price[i]);
        }
      //  System.out.println(stack.toString());
        while(stack.size() != 0) {
            for (int i = 0; i < price.length; i++) {
               // System.out.println(price[i]);
                if (stack.peek() > price[i]) {
                         s = stack.size()-i-1; // some differnce in logic and ans id different

                }

            }
            arrayList.add(s);
            stack.pop();
           // System.out.println(stack.toString());

        }
        return arrayList.toString();
    }

    public static void main(String[] args) {
        int[] a ={100,80,60,70,60,75,85};
        int b = 7;

       System.out.println((calculateSpan(a,b)));
    }
}
