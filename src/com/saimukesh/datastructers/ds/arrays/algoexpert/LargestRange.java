package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static int[] largestRange(int[] array) {
        // Write your code here.
       // Arrays.sort(array);
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],i);
        }
       // System.out.println(map.toString());

        int longestStreak = 0;


        for (int num : map.keySet()) {
           // System.out.println(num);
            if (!map.containsKey(num-1)) {
               // System.out.println(num);
                int currentNum = num;
                //System.out.println(currentNum);
                int currentStreak = 1;

                while (map.containsKey(currentNum+1)) {
                    currentNum += 1;
                  //  System.out.println(currentNum);
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
            System.out.println(longestStreak);

        }

        return new int[] {};
    }

    public static void main(String[] args) {
       int[] array = new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        largestRange(array);
    }
}
