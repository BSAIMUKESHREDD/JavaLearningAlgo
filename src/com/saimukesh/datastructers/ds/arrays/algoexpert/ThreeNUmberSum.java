package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNUmberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        //
        List<Integer[]> triplet = new ArrayList<Integer[]>();
        Integer[] ans = new Integer[3];
        Arrays.sort(array);

        for (int i = 0; i < array.length-2; i++) {
            int left =i+1;
            int right = array.length-1;
           // int curr;
            while(left<right){
                int curr = array[left]+array[right]+array[i];
                if(curr==targetSum){
                     ans  = new Integer[]{array[i], array[left], array[right]};
                     triplet.add(ans);
                     left++;
                     right--;

                }
                else if(curr<targetSum){
                    left++;
                }
                else if(curr>targetSum){
                    right--;
                }
            }

        }
        return triplet;
    }

    public static void main(String[] args) {

        List<Integer[]> output = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);





    }
}
