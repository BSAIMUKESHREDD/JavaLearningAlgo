package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        //System.out.println("hiiiii");
        List<Integer> ans = new ArrayList<Integer>();
        int sum=0;
       // System.out.println(array.get(1));
        for (int i = 0; i < array.size(); i++) {
            //System.out.println(array.get(i));
            if(array.get(i)==toMove){sum++;}
            else{ans.add(array.get(i));}
        }
        for (int i = 0; i < sum; i++) {
            ans.add(toMove);
        }

        return ans;


    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;
        List<Integer> ans = moveElementToEnd(array,toMove);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
