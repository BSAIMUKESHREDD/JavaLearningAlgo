package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNUmberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        //
        List<Integer[]> ans = new ArrayList<Integer[]>();
        Arrays.sort(array);
       int left ;
       int right;
       int curr;
        for (int i = 0; i < array.length; i++) {
            left = array[i];
            right= array[array.length];
            curr= array[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        List<Integer[]> output = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        System.out.println(output.get(0));
    }
}
