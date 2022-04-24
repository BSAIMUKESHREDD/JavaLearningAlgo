package com.saimukesh.datastructers.ds.Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StackusingList {

    static  class  MinMaxStack {
         static ArrayList<Integer> list = new ArrayList<>();

        public static int peek() {
            // Write your code here.
            return list.get(list.size()-1);
        }

        public static int pop() {
            // Write your code here.
            list.remove(list.get(list.size()-1));
            return  list.get(list.size()-1);
        }

        public static void push(Integer number) {
            // Write your code here.
            list.add(number);
        }

        public static int getMin() {
            // Write your code here.
            int size = list.size();
            int min =100;
            System.out.println(min);
            while(size>=1){
                System.out.println("hii");

                if(min>=MinMaxStack.peek()){
                    min = MinMaxStack.peek();
                }
                 MinMaxStack.pop();

                size--;
            }
            return min;
        }

        public int getMax() {
            // Write your code here.
            return 0;
        }
    }


    public static void main(String[] args) {

         MinMaxStack.push(10);
        MinMaxStack.push(20);
        MinMaxStack.push(30);
      int b =   MinMaxStack.getMin();
        System.out.println(b);


    }
}
