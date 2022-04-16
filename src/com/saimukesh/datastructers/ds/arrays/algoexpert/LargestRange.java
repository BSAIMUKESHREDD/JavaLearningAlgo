package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static int[] largestRange(int[] array) {
        // Write your code here.
       // Arrays.sort(array);

        int[] bestRange = new int[2];
        int longestLenght =0;

         HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
         for(int num:array){
             map.put(num,true);
         }
        for(int num:array){
            if(!map.get(num)){
                continue;
            }
            map.put(num,false);
            int curr = 1;
            int left = num-1;
            int right = num+1;

            while(map.containsKey(left)){
                map.put(left,false);
                curr++;
                left--;
            }
            while(map.containsKey(right)){
                map.put(right,false);
                curr++;
                right++;
            }

            if(curr>longestLenght){
                longestLenght= curr;
                bestRange = new int[]{left+1,right-1};
            }
        }
        return  bestRange;




































         //code to print largest sequence
      /*  for (int i = 0; i < array.length; i++) {
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


        }
  System.out.println(longestStreak);*/
    }

    public static void main(String[] args) {
       int[] array = new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        largestRange(array);
    }
}
