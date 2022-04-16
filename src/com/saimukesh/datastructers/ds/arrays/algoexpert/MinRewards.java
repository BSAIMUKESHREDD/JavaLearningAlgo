package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.HashMap;
import java.util.Map;

public class MinRewards {
        public static int minRewards(int[] ratings) {
            int[] candy=new int[ratings.length];
            // scan from left to right and set candy of i-th child
            // to be 1 greater than i-1 th child
            // if i th rating is higher
            for(int i=1;i<ratings.length;i++) {
                if(ratings[i-1]<ratings[i]) {
                    candy[i]=candy[i-1]+1;
                }
            }
            int total=candy[ratings.length-1];
            // scan from right to left and set candy of i-th child
            // to be greater than i+1 child as well as grather than i-1 th child
            // if i-th child's rating is greater than of both of neighbors ratings
            // so get max of current candy of i-th child and candy of (i+1) th child + 1
            for(int i=ratings.length-2;i>=0;i--) {
                if(ratings[i]>ratings[i+1]) {
                    candy[i]=Math.max(candy[i], candy[i+1]+1);
                }
                // keep calculating total candy
                total+=candy[i];
            }
            //since each child get one candy so add total children
            System.out.println(total+ratings.length);
            return total+ratings.length;
        }
    public static void main(String[] args) {

      int[] scores = new int[]{0, 4, 2, 1, 3};
        minRewards(scores);
    }
}
